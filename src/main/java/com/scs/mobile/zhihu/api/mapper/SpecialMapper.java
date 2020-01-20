package com.scs.mobile.zhihu.api.mapper;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author ke_zhang
 * @create 2020/1/16 15:57
 */
public interface SpecialMapper {
    /**
     * 查询最新专题
     *
     *
     * @return List<Special>
     */
    @Select("SELECT * FROM t_special ORDER BY updated DESC LIMIT 0,4")
    @Results({
            @Result(id = true, property = "specialId", column = "special_id", javaType = String.class),
            @Result(property = "title", column = "title", javaType = String.class),
            @Result(property = "introduction", column = "introduction", javaType = String.class),
            @Result(property = "banner", column = "banner", javaType = String.class),
            @Result(property = "viewCount", column = "view_count", javaType = Integer.class),
            @Result(property = "followersCount", column = "followers_count", javaType = Integer.class),
            @Result(property = "updated", column = "updated", javaType = Date.class),
            @Result(property = "sections", column = "special_id",
                    many = @Many(select = "com.scs.mobile.zhihu.api.mapper.SectionMapper.getSectionsLimitCount")),
    })
    List<Map> selectRecent();

    /**
     * 查询所有专题
     *
     * @return List<Map>
     */
    @Select("SELECT * FROM t_special")
    @Results({
            @Result(id = true, property = "specialId", column = "special_id", javaType = String.class),
            @Result(property = "title", column = "title", javaType = String.class),
            @Result(property = "introduction", column = "introduction", javaType = String.class),
            @Result(property = "banner", column = "banner", javaType = String.class),
            @Result(property = "viewCount", column = "view_count", javaType = Integer.class),
            @Result(property = "followersCount", column = "followers_count", javaType = Integer.class),
            @Result(property = "updated", column = "updated", javaType = Date.class),
            @Result(property = "sections", column = "special_id",
                    many = @Many(select = "com.scs.mobile.zhihu.api.mapper.SectionMapper.getSectionsBySpecialId")),
    })
    List<Map> selectAll();
}
