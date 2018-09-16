package com.github.ethendev.jdruid.aggregator;

import lombok.Getter;
import lombok.NonNull;

/**
 * @author: Ethan
 * @Date: 2018/9/15
 */
@Getter
public class LongMinAggregator extends BaseAggregator {
    private static String AGGREGATOR_TYPE = "longMin";
    private String fieldName;

    public LongMinAggregator(@NonNull String name, @NonNull String fieldName) {
        super(AGGREGATOR_TYPE, name);
        this.fieldName = fieldName;
    }
}
