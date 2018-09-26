package com.github.ethendev.jdruid.aggregator;

import lombok.Getter;

/**
 * @author: Ethan
 * @Date: 2018/9/15
 */
@Getter
public class LongMaxAggregator extends CommonAggregator {

    public LongMaxAggregator(String name, String fieldName) {
        super(AggregatorType.LONG_MAX, name, fieldName);
    }
}
