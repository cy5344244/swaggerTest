package com.github.ethendev.jdruid.aggregator;

import lombok.Getter;
import lombok.NonNull;

/**
 * @author: Ethan
 * @Date: 2018/9/15
 */
@Getter
public class DoubleMinAggregator extends DruidAggregator {
    private static String AGGREGATOR_TYPE = "doubleMin";
    private String fieldName;

    public DoubleMinAggregator(@NonNull String name, @NonNull String fieldName) {
        super(AGGREGATOR_TYPE, name);
        this.fieldName = fieldName;
    }
}
