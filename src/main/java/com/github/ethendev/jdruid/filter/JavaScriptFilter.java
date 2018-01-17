package com.github.ethendev.jdruid.filter;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;

/**
 * @author: chy
 * @Date: 2018/9/14
 */
@Getter
@EqualsAndHashCode(callSuper = true)
public class JavaScriptFilter extends DruidFilter {
    private static String FILTER_TYPE = "javascript";

    private String dimension;
    private String function;

    public JavaScriptFilter(@NonNull String dimension, @NonNull String function) {
        super(FILTER_TYPE);
        this.dimension = dimension;
        this.function = function;
    }
}
