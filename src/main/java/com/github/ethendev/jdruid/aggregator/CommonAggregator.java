package com.github.ethendev.jdruid.aggregator;

import lombok.Getter;
import lombok.NonNull;

import java.util.List;

/**
 * a general aggregator which can be used to replace other aggregators.
 * @author: Ethan
 * @Date: 2018/9/15
 */
@Getter
public class CommonAggregator extends BaseAggregator {

    private String fieldName;
    private List<String> fieldNames;

    public CommonAggregator(@NonNull String aggregatorType, @NonNull String name, @NonNull String fieldName) {
        super(aggregatorType, name);
        this.fieldName = fieldName;
    }

}
