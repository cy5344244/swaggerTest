package com.github.ethendev.jdruid.postAggregator;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;

/**
 * @author: Ethan
 * @Date: 2018/9/21
 */
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HyperUniqueCardinalityPostAggregator extends BasePostAggregator {
    private static String AGGREGATOR_TYPE = "hyperUniqueCardinality";

    private String fieldName;

    public HyperUniqueCardinalityPostAggregator(String name, String fieldName) {
        super(AGGREGATOR_TYPE, name);
        this.fieldName = fieldName;
    }
}
