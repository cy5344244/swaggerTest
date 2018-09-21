package com.github.ethendev.jdruid.postAggregator;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author: Ethan
 * @Date: 2018/9/16
 */
@Getter
@AllArgsConstructor
public abstract class BasePostAggregator {
    private String type;
    private String name;
}
