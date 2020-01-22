package com.scs.mobile.zhihu.api.mapper;

import com.scs.mobile.zhihu.api.entity.Favorite;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author ke_zhang
 * @create 2020/1/21 17:09
 */
public interface FavoriteMapper {
    /**
     * 查询热门收藏夹
     *
     * @return List<Favorite>
     */
    @Select("SELECT * FROM t_favorite LIMIT 0,4 ")
    List<Favorite> selectHot();

    /**
     * 查询所有收藏夹
     *
     * @return List<Favorite>
     */
    @Select("SELECT * FROM t_favorite")
    List<Favorite> selectAll();
}
