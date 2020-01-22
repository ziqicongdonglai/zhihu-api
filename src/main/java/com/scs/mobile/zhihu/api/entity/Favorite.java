package com.scs.mobile.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author ke_zhang
 * @create 2020/1/21 16:41
 */
@Data
@Builder
public class Favorite {
    private Integer id;
    private String title;
    private String creatorName;
    private String creatorAvatar;
    private Integer followers;
    private Integer totalCount;
    private String questionTitle;
    private String answerAuthorName;
    private String answerContent;
    private Integer voteupCount;
    private Integer commentCount;
}
