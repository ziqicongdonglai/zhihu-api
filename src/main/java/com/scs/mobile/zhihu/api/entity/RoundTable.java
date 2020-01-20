package com.scs.mobile.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author ke_zhang
 * @create 2020/1/17 14:24
 */
@Data
@Builder
public class RoundTable {
    private Integer id;
    private String name;
    private String banner;
    private String tinyBanner;
    private String urlToken;
    private Integer visitsCount;
    private Integer includeCount;
}
