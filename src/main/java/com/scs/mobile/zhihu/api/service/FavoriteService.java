package com.scs.mobile.zhihu.api.service;

import com.scs.mobile.zhihu.api.entity.Favorite;

import java.util.List;

/**
 * @author ke_zhang
 * @create 2020/1/21 17:15
 */
public interface FavoriteService {
    /**
     * 查询热门收藏夹
     *
     * @return List<Favorite>
     */
    List<Favorite> selectHot();

    /**
     * 查询所有收藏夹
     *
     * @return List<Favorite>
     */
    List<Favorite> selectAll();
}
