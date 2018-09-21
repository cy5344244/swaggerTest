package com.github.ethendev.jdruid.aggregator;

import lombok.Getter;

/**
 * @author: Ethan
 * @Date: 2018/9/15
 */
@Getter
public class LongMinAggregator extends CommonAggregator {
    private static String AGGREGATOR_TYPE = "longMin";

    public LongMinAggregator(String name, String fieldName) {
        super(AGGREGATOR_TYPE, name, fieldName);
    }
}
