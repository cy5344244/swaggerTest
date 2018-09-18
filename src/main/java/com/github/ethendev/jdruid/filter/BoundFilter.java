package com.github.ethendev.jdruid.filter;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;

/**
 * @author: Ethan
 * @Date: 2018/9/15
 */
@Getter
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BoundFilter extends BaseFilter {
    private static final String FILTER_TYPE = "bound";

    private String dimension;
    private String lower;
    private String upper;
    private Boolean alphaNumber;
    private Boolean lowerStrict;
    private Boolean upperStrict;

    @Builder
    private BoundFilter(@NonNull String dimension, String lower, String upper,
                        Boolean alphaNumber, Boolean lowerStrict, Boolean upperStrict) {
        super(FILTER_TYPE);
        this.dimension = dimension;
        this.lower = lower;
        this.upper = upper;
        this.alphaNumber = alphaNumber;
        this.lowerStrict = lowerStrict;
        this.upperStrict = upperStrict;
    }

}
