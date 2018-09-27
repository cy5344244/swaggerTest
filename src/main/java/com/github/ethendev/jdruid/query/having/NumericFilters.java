package com.github.ethendev.jdruid.query.having;

import lombok.Getter;
import lombok.NonNull;

/**
 * @author: Ethan
 * @Date: 2018/9/27
 */
@Getter
public class NumericFilters extends HavingFilter {
    private String aggregation;
    private Number value;

    public NumericFilters(@NonNull NumericType type, @NonNull String aggregation, @NonNull Number value) {
        super(type.getValue());
        this.aggregation = aggregation;
        this.value = value;
    }
}
