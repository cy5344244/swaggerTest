package com.github.ethendev.jdruid.query.topn;

import lombok.Getter;
import lombok.NonNull;

/**
 * @author: Ethan
 * @Date: 2018/9/26
 */
@Getter
public class NumericMetric extends AbstractMetric {
    private static final String METRIC_TYPE = "numeric";

    private String type;
    private String metric;

    public NumericMetric(@NonNull String metric) {
        this.type = METRIC_TYPE;
        this.metric = metric;
    }
}
