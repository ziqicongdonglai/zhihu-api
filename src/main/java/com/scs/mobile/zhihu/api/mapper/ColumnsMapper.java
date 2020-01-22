package com.scs.mobile.zhihu.api.mapper;

import com.scs.mobile.zhihu.api.entity.Columns;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author ke_zhang
 * @create 2020/1/22 20:58
 */
public interface ColumnsMapper {
    /**
     * 查询专栏
     *
     * @return List<Columns>
     */
    @Select("SELECT * FROM t_columns LIMIT 0,4")
    List<Columns> selectHot();

    /**
     * 查询所有专栏 随机
     *
     * @return List<Columns>
     */
    @Select("SELECT * FROM t_columns LIMIT 0,8")
    List<Columns> selectAll();
}
