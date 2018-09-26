package com.github.ethendev.jdruid;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.ethendev.jdruid.aggregator.HyperUniqueAggregator;
import com.github.ethendev.jdruid.aggregator.LongSumAggregator;
import com.github.ethendev.jdruid.filter.LogicalFilter;
import com.github.ethendev.jdruid.filter.LogicalType;
import com.github.ethendev.jdruid.filter.SelectorFilter;
import com.github.ethendev.jdruid.postAggregator.ArithmeticFunction;
import com.github.ethendev.jdruid.postAggregator.ArithmeticPostAggregator;
import com.github.ethendev.jdruid.postAggregator.HyperUniqueCardinalityPostAggregator;
import com.github.ethendev.jdruid.query.GranularityType;
import com.github.ethendev.jdruid.query.TimeseriesQuery;
import com.github.ethendev.jdruid.query.TopNQuery;
import com.github.ethendev.jdruid.query.topn.NumericMetric;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;

/**
 * @author: Ethan
 * @Date: 2018/9/18
 */
public class DruidClientTest {

    private String url = "http://localhost:8082/druid/v2";

    @Test
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
                .aggregators(Arrays.asList(longSum, hyperUnique))
                .postAggregations(Arrays.asList(post))
                .build();

        ObjectMapper mapper = new ObjectMapper();
        System.out.println(mapper.writeValueAsString(query));

        DruidClient client = new DruidClient();
        String result = client.query(url, query);
        System.out.println(result);
    }

    @Test
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
                .aggregators(Arrays.asList(longSum, hyperUnique))
                .postAggregations(Arrays.asList(post))
                .build();

        ObjectMapper mapper = new ObjectMapper();
        System.out.println(mapper.writeValueAsString(query));

        DruidClient client = new DruidClient();
        String result = client.query(url, query);
        System.out.println(result);
    }
}