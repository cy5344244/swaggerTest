package com.github.ethendev.jdruid.filter;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;

/**
 * @author: Ethan
 * @Date: 2018/9/14
 */
@Getter
@EqualsAndHashCode(callSuper = true)
public class SelectorFilter extends BaseFilter {
    private static String FILTER_TYPE = "selector";

    private String dimension;
    private String value;

    public SelectorFilter(@NonNull String dimension, @NonNull String value) {
        super(FILTER_TYPE);
        this.dimension = dimension;
        this.value = value;
    }
}
