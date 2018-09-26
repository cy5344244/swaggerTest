package com.github.ethendev.jdruid.query.topn;

import lombok.Getter;
import lombok.NonNull;

/**
 * @author: Ethan
 * @Date: 2018/9/26
 */
@Getter
public class InvertedMetric extends AbstractMetric {
    private static final String METRIC_TYPE = "inverted";

    private String type;
    private AbstractMetric metric;

    public InvertedMetric(@NonNull AbstractMetric metric) {
        this.type = METRIC_TYPE;
        this.metric = metric;
    }
}
