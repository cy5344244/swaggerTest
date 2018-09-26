package com.github.ethendev.jdruid.aggregator;

import lombok.Getter;

/**
 * @author: Ethan
 * @Date: 2018/9/15
 */
@Getter
public class DoubleSumAggregator extends CommonAggregator {

    public DoubleSumAggregator(String name, String fieldName) {
        super(AggregatorType.DOUBLE_SUM, name, fieldName);
    }
}
