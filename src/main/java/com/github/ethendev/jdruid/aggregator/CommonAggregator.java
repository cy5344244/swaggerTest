package com.github.ethendev.jdruid.aggregator;

import lombok.Getter;
import lombok.NonNull;

/**
 * a general aggregator which can be used to replace other aggregators.
 * @author: Ethan
 * @Date: 2018/9/15
 */
@Getter
public class CommonAggregator extends BaseAggregator {

    private String fieldName;

    public CommonAggregator(@NonNull String aggregatorType, @NonNull String name, @NonNull String fieldName) {
        super(aggregatorType, name);
        this.fieldName = fieldName;
    }

    public CommonAggregator(@NonNull AggregatorType aggregatorType, @NonNull String name, @NonNull String fieldName) {
        super(aggregatorType.getValue(), name);
        this.fieldName = fieldName;
    }

}
