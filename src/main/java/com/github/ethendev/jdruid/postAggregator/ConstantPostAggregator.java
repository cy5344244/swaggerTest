package com.github.ethendev.jdruid.postAggregator;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;

/**
 * @author: Ethan
 * @Date: 2018/9/21
 */
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConstantPostAggregator extends BasePostAggregator {
    private static String AGGREGATOR_TYPE = "constant";

    private String value;

    public ConstantPostAggregator(String name, String value) {
        super(AGGREGATOR_TYPE, name);
        this.value = value;
    }
}
