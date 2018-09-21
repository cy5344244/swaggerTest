package com.github.ethendev.jdruid.aggregator;

import lombok.Getter;

/**
 * @author: Ethan
 * @Date: 2018/9/15
 */
@Getter
public class LongSumAggregator extends CommonAggregator {
    private static String AGGREGATOR_TYPE = "longSum";

    public LongSumAggregator(String name, String fieldName) {
        super(AGGREGATOR_TYPE, name, fieldName);
    }
}
