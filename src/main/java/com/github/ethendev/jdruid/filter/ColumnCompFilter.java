package com.github.ethendev.jdruid.filter;

import lombok.Getter;
import lombok.NonNull;

import java.util.List;

/**
 * @author: Ethan
 * @Date: 2018/9/26
 */
@Getter
public class ColumnCompFilter extends BaseFilter {
    private static final String FILTER_TYPE = "columnComparison";
    private List<String> dimensions;

    public ColumnCompFilter(@NonNull List<String> dimensions) {
        super(FILTER_TYPE);
        this.dimensions = dimensions;
    }
}
