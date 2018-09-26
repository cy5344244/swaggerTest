package com.github.ethendev.jdruid.aggregator;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.github.ethendev.jdruid.filter.BaseFilter;
import lombok.Getter;
import lombok.NonNull;

/**
 * @author: Ethan
 * @Date: 2018/9/15
 */
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FilteredAggregator extends BaseAggregator {
    private BaseFilter filter;
    private BaseAggregator aggregator;

    public FilteredAggregator(@NonNull BaseFilter filter, @NonNull BaseAggregator aggregator) {
        super(AggregatorType.FILTERED.getValue(), null);
        this.filter = filter;
        this.aggregator = aggregator;
    }
}
