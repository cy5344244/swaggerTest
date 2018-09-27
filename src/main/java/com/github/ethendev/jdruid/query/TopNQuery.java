package com.github.ethendev.jdruid.query;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.github.ethendev.jdruid.aggregator.BaseAggregator;
import com.github.ethendev.jdruid.filter.BaseFilter;
import com.github.ethendev.jdruid.postAggregator.BasePostAggregator;
import com.github.ethendev.jdruid.query.topn.AbstractMetric;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

import java.util.List;

/**
 * @author: Ethan
 * @Date: 2018/9/16
 */
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TopNQuery extends BaseQuery {
    private static final String QUERY_TYPE = "topN";
    private BaseFilter filter;
    private List<BaseAggregator> aggregations;
    private List<BasePostAggregator> postAggregations;
    private String dimension;
    private Integer threshold;
    private AbstractMetric metric;
    private Context context;

    @Builder
    public TopNQuery(String dataSource, List<String> intervals, GranularityType granularity,
                     BaseFilter filter, List<BaseAggregator> aggregations, List<BasePostAggregator> postAggregations,
                     @NonNull String dimension, @NonNull Integer threshold, @NonNull AbstractMetric metric, Context context) {
        super(QUERY_TYPE, dataSource, intervals, granularity);
        this.filter = filter;
        this.aggregations = aggregations;
        this.postAggregations = postAggregations;
        this.dimension = dimension;
        this.threshold = threshold;
        this.metric = metric;
        this.context = context;
    }
}
