package com.github.ethendev.jdruid.aggregator;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

import java.util.List;

/**
 * @author: Ethan
 * @Date: 2018/9/15
 */
@Getter
public class JavaScriptAggregator extends BaseAggregator {
    private List<String> fieldNames;
    private String fnAggregate;
    private String fnCombine;
    private String fnReset;

    @Builder
    public JavaScriptAggregator(@NonNull String name, @NonNull List<String> fieldNames,
                                String fnAggregate, String fnCombine, String fnReset) {
        super(AggregatorType.JAVASCRIPT.getValue(), name);
        this.fieldNames = fieldNames;
        this.fnAggregate = fnAggregate;
        this.fnCombine = fnCombine;
        this.fnReset = fnReset;
    }
}
