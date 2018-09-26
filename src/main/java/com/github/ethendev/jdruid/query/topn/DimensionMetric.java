package com.github.ethendev.jdruid.query.topn;

import lombok.Getter;
import lombok.NonNull;

/**
 * @author: Ethan
 * @Date: 2018/9/26
 */
@Getter
public class DimensionMetric extends AbstractMetric {
    private static final String METRIC_TYPE = "dimension";

    private String type;
    private String ordering;
    private String previousStop;

    public DimensionMetric(String ordering, String previousStop) {
        this.type = METRIC_TYPE;
        this.ordering = ordering != null ? ordering : "lexicographic";
        this.previousStop = previousStop;
    }
}
