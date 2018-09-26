package com.github.ethendev.jdruid.aggregator;

import lombok.Getter;

/**
 * @author: Ethan
 * @Date: 2018/9/15
 */
@Getter
public class DoubleMinAggregator extends CommonAggregator {

    public DoubleMinAggregator(String name, String fieldName) {
        super(AggregatorType.DOUBLE_MIN, name, fieldName);
    }
}
