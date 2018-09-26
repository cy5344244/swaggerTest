package com.github.ethendev.jdruid.aggregator;

import lombok.Getter;

/**
 * @author: Ethan
 * @Date: 2018/9/15
 */
@Getter
public class CountAggregator extends CommonAggregator {

    public CountAggregator(String name, String fieldName) {
        super(AggregatorType.COUNT, name, fieldName);
    }
}
