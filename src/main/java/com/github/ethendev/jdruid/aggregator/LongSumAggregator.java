package com.github.ethendev.jdruid.aggregator;

import lombok.Getter;

/**
 * @author: Ethan
 * @Date: 2018/9/15
 */
@Getter
public class LongSumAggregator extends CommonAggregator {

    public LongSumAggregator(String name, String fieldName) {
        super(AggregatorType.LONG_SUM, name, fieldName);
    }
}
