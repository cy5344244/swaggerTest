package com.github.ethendev.jdruid.aggregator;

import com.github.ethendev.jdruid.filter.DruidFilter;
import lombok.Getter;
import lombok.NonNull;

/**
 * @author: Ethan
 * @Date: 2018/9/15
 */
@Getter
public class FilteredAggregator extends DruidAggregator {
    private static String AGGREGATOR_TYPE = "filtered";

    private DruidFilter filter;
    private DruidAggregator aggregator;

    public FilteredAggregator(@NonNull DruidFilter filter, @NonNull DruidAggregator aggregator) {
        super(AGGREGATOR_TYPE, null);
        this.filter = filter;
        this.aggregator = aggregator;
    }
}
