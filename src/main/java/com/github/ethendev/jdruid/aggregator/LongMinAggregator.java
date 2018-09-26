package com.github.ethendev.jdruid.aggregator;

import lombok.Getter;

/**
 * @author: Ethan
 * @Date: 2018/9/15
 */
@Getter
public class LongMinAggregator extends CommonAggregator {

    public LongMinAggregator(String name, String fieldName) {
        super(AggregatorType.LONG_MIN, name, fieldName);
    }
}
