package com.github.ethendev.jdruid.aggregator;

import lombok.Getter;

/**
 * @author: Ethan
 * @Date: 2018/9/15
 */
@Getter
public class HyperUniqueAggregator extends CommonAggregator {

    public HyperUniqueAggregator(String name, String fieldName) {
        super(AggregatorType.HYPER_UNIQUE, name, fieldName);
    }
}
