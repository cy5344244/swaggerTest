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
public class SearchFilter extends BaseFilter {
    private static String FILTER_TYPE = "search";

    private String dimension;

    // TODO
    // need modify the type of query
    private String query;

    public SearchFilter(@NonNull String dimension, @NonNull String query) {
        super(FILTER_TYPE);
        this.dimension = dimension;
        this.query = query;
    }
}
