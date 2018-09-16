package com.github.ethendev.jdruid.query;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

/**
 * @author: Ethan
 * @Date: 2018/9/16
 */
@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Context {
    /**
     * Query timeout in millis
     */
    @JsonProperty("timeout")
    private Integer timeoutMillis;
    /**
     * Maximum number of bytes gathered from data nodes such as historicals and realtime processes to execute a query.
     */
    private Long maxScatterGatherBytes;

    private Integer priority;
    /**
     * Unique identifier given to this query. If a query ID is set or known, this can be used to cancel the query
     */
    private String queryId;
    private Boolean useCache;
    /**
     * Flag indicating whether to save the results of the query to the query cache.
     * Primarily used for debugging. When set to false, it disables saving the results of this query to the query cache.
     */
    private Boolean populateCache;
    /**
     * Return "by segment" results. Primarily used for debugging, setting it to true
     * returns results associated with the data segment they came from
     */
    private Boolean bySegment;
    /**
     * Flag indicating whether to "finalize" aggregation results. Primarily used for debugging.
     */
    private Boolean finalize;
    /**
     * indicating long interval queries broken into shorter interval queries to parallelize merging more than normal.
     * Use ISO 8601 periods. For example, if this property is set to P1M
     */
    private String chunkPeriod;
    /**
     * If true, DateTime is serialized as long in the result returned by broker
     */
    private Boolean serializeDateTimeAsLong;
    /**
     * If true, DateTime is serialized as long in the data transportation between broker and compute node
     */
    private Boolean serializeDateTimeAsLongInner;

    // TODO There are no below attributes in official documents.
    private Integer minTopNThreshold;
    private Integer maxResults;
    private Integer maxIntermediateRows;
    private Boolean groupByIsSingleThreaded;
}
