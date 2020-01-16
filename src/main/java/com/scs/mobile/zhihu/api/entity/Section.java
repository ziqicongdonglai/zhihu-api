package com.scs.mobile.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author ke_zhang
 * @create 2020/1/16 15:18
 */
@Data
@Builder
public class Section {
    private String sectionId;
    private String specialId;
    private String sectionTitle;
}
