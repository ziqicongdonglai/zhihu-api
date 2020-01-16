package com.scs.mobile.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * @author ke_zhang
 * @create 2020/1/16 15:05
 */
@Data
@Builder

public class Special {
    private String specialId;
    private String title;
    private String introduction;
    private String banner;
    private Integer viewCount;
    private Integer followersCount;
    private Date updated;
}
