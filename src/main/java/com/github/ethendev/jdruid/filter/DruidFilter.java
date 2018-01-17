package com.github.ethendev.jdruid.filter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author: chy
 * @Date: 2018/9/14
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public abstract class DruidFilter {
    protected String type;
}
