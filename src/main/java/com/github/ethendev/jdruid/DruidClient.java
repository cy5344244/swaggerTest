package com.github.ethendev.jdruid;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.ethendev.jdruid.query.BaseQuery;
import com.squareup.okhttp.*;

import java.io.IOException;

/**
 * @author: Ethan
 * @Date: 2018/9/18
 */
public class DruidClient {

    private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    private final OkHttpClient client;
    private final ObjectMapper mapper;

    public DruidClient() {
        this.client = new OkHttpClient();
        this.mapper = new ObjectMapper();
    }

    public String query(String url, String param) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .post(RequestBody.create(JSON, param))
                .build();
        Response response = client.newCall(request).execute();
        if (!response.isSuccessful()) {
            throw new IOException("query error: " + response);
        }
        return response.body().string();
    }

    public String query(String url, BaseQuery param) throws IOException {
        return query(url, mapper.writeValueAsString(param));
    }

    public Object query(String url, String param, Class<?> classType) throws IOException {
        String result = query(url, param);
        return mapper.readValue(result, classType);
    }

    public Object query(String url, BaseQuery param, Class<?> classType) throws IOException {
        String result = query(url, mapper.writeValueAsString(param));
        return mapper.readValue(result, classType);
    }

}
