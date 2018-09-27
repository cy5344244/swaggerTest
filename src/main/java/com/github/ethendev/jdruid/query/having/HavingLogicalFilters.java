package com.github.ethendev.jdruid.query.having;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.github.ethendev.jdruid.filter.BaseFilter;
import com.github.ethendev.jdruid.filter.LogicalType;
import lombok.Getter;

import java.util.List;

/**
 * @author: Ethan
 * @Date: 2018/9/27
 */
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HavingLogicalFilters extends HavingFilter {
    private List<HavingFilter> havingSpecs;
    private HavingFilter havingSpec;

    public HavingLogicalFilters(LogicalType type, List<HavingFilter> havingSpecs) {
        super(type.getValue());
        if (type.equals(LogicalType.NOT)) {
            throw new IllegalArgumentException("type connot be 'not'!");
        }
        this.havingSpecs = havingSpecs;
    }

    public HavingLogicalFilters(LogicalType type, HavingFilter havingSpec) {
        super(type.getValue());
        if (!type.equals(LogicalType.NOT)) {
            throw new IllegalArgumentException("type must be 'not'!");
        }
        this.havingSpec = havingSpec;
    }
}
