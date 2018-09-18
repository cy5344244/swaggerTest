package com.github.ethendev.jdruid;

import com.github.ethendev.jdruid.aggregator.HyperUniqueAggregator;
import com.github.ethendev.jdruid.aggregator.LongSumAggregator;
import com.github.ethendev.jdruid.filter.LogicalFilter;
import com.github.ethendev.jdruid.filter.LogicalType;
import com.github.ethendev.jdruid.filter.SelectorFilter;
import com.github.ethendev.jdruid.query.GranularityType;
import com.github.ethendev.jdruid.query.TimeseriesQuery;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;

/**
 * @author: Ethan
 * @Date: 2018/9/18
 */
public class DruidClientTest {

    @Test
    public void query() throws IOException {
        SelectorFilter sf1 = new SelectorFilter("host", "www.google.com");
        SelectorFilter sf2 = new SelectorFilter("corpin", "123456");

        LongSumAggregator longSum = new LongSumAggregator("pv","count");
        HyperUniqueAggregator hyperUnique = new HyperUniqueAggregator("pv","visit_count");

        TimeseriesQuery query = TimeseriesQuery.builder()
                .dataSource("lip")
                .dataSource("visitor_stat")
                .granularity(GranularityType.ALL)
                .intervals(Arrays.asList("2018-01-15T16:00:00Z/2018-01-15T16:05:00Z"))
                .filter(new LogicalFilter(LogicalType.AND, Arrays.asList(sf1, sf2)))
                .aggregators(Arrays.asList(longSum, hyperUnique))
                .build();

        String url = "http://localhost:8082/druid/v2";
        DruidClient client = new DruidClient();
        String result = client.query(url, query);
        System.out.println(result);
    }
}