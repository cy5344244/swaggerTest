package com.github.ethendev.jdruid.query.topn;

import lombok.Getter;
import lombok.NonNull;

/**
 * @author: Ethan
 * @Date: 2018/9/26
 */
@Getter
public class SimpleMetric extends AbstractMetric {
    private String metric;

    public SimpleMetric(@NonNull String metric) {
        this.metric = metric;
    }
}
