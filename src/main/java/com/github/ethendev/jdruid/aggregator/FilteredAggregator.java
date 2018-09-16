package com.github.ethendev.jdruid.aggregator;

import com.github.ethendev.jdruid.filter.BaseFilter;
import lombok.Getter;
import lombok.NonNull;

/**
 * @author: Ethan
 * @Date: 2018/9/15
 */
@Getter
public class FilteredAggregator extends BaseAggregator {
    private static String AGGREGATOR_TYPE = "filtered";

    private BaseFilter filter;
    private BaseAggregator aggregator;

    public FilteredAggregator(@NonNull BaseFilter filter, @NonNull BaseAggregator aggregator) {
        super(AGGREGATOR_TYPE, null);
        this.filter = filter;
        this.aggregator = aggregator;
    }
}
