package com.github.ethendev.jdruid.aggregator;

import lombok.Getter;
import lombok.NonNull;

/**
 * @author: Ethan
 * @Date: 2018/9/15
 */
@Getter
public class CountAggregator extends DruidAggregator {
    private static String AGGREGATOR_TYPE = "count";
    private String fieldName;

    public CountAggregator(@NonNull String name, @NonNull String fieldName) {
        super(AGGREGATOR_TYPE, name);
        this.fieldName = fieldName;
    }
}
