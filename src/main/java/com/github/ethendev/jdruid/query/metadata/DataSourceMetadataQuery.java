package com.github.ethendev.jdruid.query.metadata;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.github.ethendev.jdruid.query.Context;
import lombok.Getter;
import lombok.NonNull;

/**
 * @author: Ethan
 * @Date: 2018/9/16
 */
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataSourceMetadataQuery {
    private static final String QUERY_TYPE = "dataSourceMetadata";

    private String queryType;
    private String dataSource;
    private Context context;

    public DataSourceMetadataQuery(@NonNull String dataSource) {
        this.queryType = QUERY_TYPE;
        this.dataSource = dataSource;
    }

    public DataSourceMetadataQuery(@NonNull String dataSource, Context context) {
        this.queryType = QUERY_TYPE;
        this.dataSource = dataSource;
        this.context = context;
    }

}
