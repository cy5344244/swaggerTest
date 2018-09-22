package com.github.ethendev.jdruid.postAggregator;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;

import java.util.List;

/**
 * @author: Ethan
 * @Date: 2018/9/21
 */
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class JavaScriptPostAggregator extends BasePostAggregator {
    private static String AGGREGATOR_TYPE = "javascript";

    private List<String> fieldNames;
    private String function;

    public JavaScriptPostAggregator(String name, List<String> fieldNames, String function) {
        super(AGGREGATOR_TYPE, name);
        this.fieldNames = fieldNames;
        this.function = function;
    }
}
