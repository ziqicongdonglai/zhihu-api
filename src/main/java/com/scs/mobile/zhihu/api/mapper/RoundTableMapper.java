package com.scs.mobile.zhihu.api.mapper;

import com.scs.mobile.zhihu.api.entity.RoundTable;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author ke_zhang
 * @create 2020/1/17 14:56
 */
public interface RoundTableMapper {
    /**
     * 查询热门圆桌 浏览次数
     *
     * @return List<RoundTable>
     */
    @Select("SELECT * FROM t_round_table LIMIT 0,4 ")
    List<RoundTable> selectHot();

    /**
     * 查询所有圆桌
     *
     * @return List<RoundTable>
     */
    @Select("SELECT * FROM t_round_table")
    List<RoundTable> selectAll();
}
