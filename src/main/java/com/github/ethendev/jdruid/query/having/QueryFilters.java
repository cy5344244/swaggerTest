package com.github.ethendev.jdruid.query.having;

import com.github.ethendev.jdruid.filter.BaseFilter;
import lombok.Getter;
import lombok.NonNull;

/**
 * @author: Ethan
 * @Date: 2018/9/27
 */
@Getter
public class QueryFilters extends HavingFilter {
    private static String FILTER_TYPE = "filter";

    private BaseFilter filter;

    public QueryFilters(@NonNull BaseFilter filter) {
        super(FILTER_TYPE);
        this.filter = filter;
    }
}
