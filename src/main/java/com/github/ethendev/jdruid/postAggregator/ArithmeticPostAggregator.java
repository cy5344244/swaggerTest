package com.github.ethendev.jdruid.postAggregator;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

import java.util.List;

/**
 * @author: Ethan
 * @Date: 2018/9/21
 */
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ArithmeticPostAggregator extends BasePostAggregator {
    private static String AGGREGATOR_TYPE = "arithmetic";

    private ArithmeticFunction fn;
    private List<BasePostAggregator> fields;
    private ArithmeticOrdering ordering;

    @Builder
    private ArithmeticPostAggregator(@NonNull String name, @NonNull ArithmeticFunction fn,
                                    @NonNull List<BasePostAggregator> fields, ArithmeticOrdering ordering) {
        super(AGGREGATOR_TYPE, name);
        this.fn = fn;
        this.fields = fields;
        this.ordering = ordering;
    }
}
