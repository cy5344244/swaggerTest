package com.github.ethendev.jdruid.aggregator;

import lombok.Getter;
import lombok.NonNull;

import java.util.List;

/**
 * a general aggregator which can be used to replace other aggregators.
 * @author: Ethan
 * @Date: 2018/9/15
 */
@Getter
public class CommonAggregator extends BaseAggregator {

    private String fieldName;
    private List<String> fieldNames;

    public CommonAggregator(@NonNull AggregatorType type, @NonNull String name, @NonNull String fieldName) {
        super(type.getValue(), name);
        this.fieldName = fieldName;
    }

    public CommonAggregator(@NonNull AggregatorType type, @NonNull String name, @NonNull List<String> fieldNames) {
        super(type.getValue(), name);
        if (!AggregatorType.CARDINALITY.equals(type)) {
            throw new IllegalArgumentException("illegal argument aggregator type: " + type.getValue());
        }
        this.fieldNames = fieldNames;
    }

}
