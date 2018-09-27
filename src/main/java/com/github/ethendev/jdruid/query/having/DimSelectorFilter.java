package com.github.ethendev.jdruid.query.having;

import com.github.ethendev.jdruid.filter.BaseFilter;
import lombok.Getter;
import lombok.NonNull;

/**
 * @author: Ethan
 * @Date: 2018/9/27
 */
@Getter
public class DimSelectorFilter extends HavingFilter {
    private static String FILTER_TYPE = "dimSelector";

    private String dimension;
    private String value;

    public DimSelectorFilter(@NonNull String filter, @NonNull String value) {
        super(FILTER_TYPE);
        this.dimension = dimension;
        this.value = value;
    }
}
