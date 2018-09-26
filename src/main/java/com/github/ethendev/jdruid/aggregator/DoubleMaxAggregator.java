package com.github.ethendev.jdruid.aggregator;

import lombok.Getter;

/**
 * @author: Ethan
 * @Date: 2018/9/15
 */
@Getter
public class DoubleMaxAggregator extends CommonAggregator {

    public DoubleMaxAggregator(String name, String fieldName) {
        super(AggregatorType.DOUBLE_MAX, name, fieldName);
    }
}
