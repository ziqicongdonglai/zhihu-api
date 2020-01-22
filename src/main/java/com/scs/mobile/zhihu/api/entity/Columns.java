package com.scs.mobile.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author ke_zhang
 * @create 2020/1/21 16:48
 */
@Data
@Builder
public class Columns {
    private Integer id;
    private String title;
    private String description;
    private String url;
    private String imageUrl;
    private Integer followers;
    private Integer articlesCount;
}
