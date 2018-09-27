# Jdruid

[![Build Status](https://api.travis-ci.org/ethendev/jdruid.svg?branch=master)](https://travis-ci.org/ethendev/jdruid)
[![Latest release](https://img.shields.io/github/release/ethendev/jdruid.svg)](https://github.com/ethendev/jdruid/releases/latest)
[![GitHub license](https://img.shields.io/badge/license-apache%202.0-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0)

# Introduction
Jdruid is a java client for druid.

# Example

timeseriesQuery

```
public void timeseriesQuery() throws IOException {
    SelectorFilter sf1 = new SelectorFilter("host", "www.mejia.wang");
    SelectorFilter sf2 = new SelectorFilter("corpin", "2852199100");

    LongSumAggregator longSum = new LongSumAggregator("pv","count");
    HyperUniqueAggregator hyperUnique = new HyperUniqueAggregator("pv","visit_count");

    ArithmeticPostAggregator post = ArithmeticPostAggregator.builder()
            .name("new_visitor_rate").fn(ArithmeticFunction.ADD)
            .fields(Arrays.asList(new HyperUniqueCardinalityPostAggregator(null, "new_visitor_count"))).build();

    TimeseriesQuery query = TimeseriesQuery.builder()
            .dataSource("visitor_statistics")
            .granularity(GranularityType.ALL)
            .intervals(Arrays.asList("2018-01-15T16:00:00Z/2018-01-15T16:05:00Z"))
            .filter(new LogicalFilter(LogicalType.AND, Arrays.asList(sf1, sf2)))
            .aggregations(Arrays.asList(longSum, hyperUnique))
            .postAggregations(Arrays.asList(post))
            .build();

    ObjectMapper mapper = new ObjectMapper();
    System.out.println(mapper.writeValueAsString(query));

    DruidClient client = new DruidClient();
    String result = client.query(url, query);
    System.out.println(result);
}
```

topNQuery
```
public void topNQuery() throws IOException {
    SelectorFilter sf1 = new SelectorFilter("host", "www.mejia.wang");
    SelectorFilter sf2 = new SelectorFilter("corpin", "2852199100");

    LongSumAggregator longSum = new LongSumAggregator("pv","count");
    HyperUniqueAggregator hyperUnique = new HyperUniqueAggregator("visitor_count","visit_count");

    ArithmeticPostAggregator post = ArithmeticPostAggregator.builder()
            .name("new_visitor_rate").fn(ArithmeticFunction.DIVIDE)
            .fields(Arrays.asList(new HyperUniqueCardinalityPostAggregator(null, "new_visitor_count"),
                    new HyperUniqueCardinalityPostAggregator(null, "visitor_count"))).build();

    TopNQuery query = TopNQuery.builder()
            .dataSource("visitor_statistics")
            .granularity(GranularityType.ALL)
            .dimension("ad_source")
            .threshold(3)
            .metric(new NumericMetric("pv"))
            .intervals(Arrays.asList("2016-08-30T00:00:00Z/2016-09-05T23:59:59Z"))
            .filter(new LogicalFilter(LogicalType.AND, Arrays.asList(sf1, sf2)))
            .aggregations(Arrays.asList(longSum, hyperUnique))
            .postAggregations(Arrays.asList(post))
            .build();

    ObjectMapper mapper = new ObjectMapper();
    System.out.println(mapper.writeValueAsString(query));

    DruidClient client = new DruidClient();
    String result = client.query(url, query);
    System.out.println(result);
}
```