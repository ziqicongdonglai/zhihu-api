package com.scs.mobile.zhihu.api.mapper;

import com.scs.mobile.zhihu.api.entity.Section;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author ke_zhang
 * @create 2020/1/16 16:13
 */
public interface SectionMapper {
    /**
     * 根据专题id查询标签列表
     *
     * @param specialId
     * @return List<Section>
     */
    @Select("SELECT * FROM t_section WHERE special_id = #{specialId}")
//    List<Section> getSelectionsBySpecialId(String specialId);
    List<Section> getSectionsBySpecialId(String specialId);

}
