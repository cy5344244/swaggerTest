package com.github.ethendev.jdruid.aggregator;

import lombok.Getter;
import lombok.NonNull;

/**
 * @author: Ethan
 * @Date: 2018/9/15
 */
@Getter
public class LongSumAggregator extends BaseAggregator {
    private static String AGGREGATOR_TYPE = "longSum";
    private String fieldName;

    public LongSumAggregator(@NonNull String name, @NonNull String fieldName) {
        super(AGGREGATOR_TYPE, name);
        this.fieldName = fieldName;
    }
}
