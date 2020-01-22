package com.scs.mobile.zhihu.api.service.impl;

import com.scs.mobile.zhihu.api.entity.Favorite;
import com.scs.mobile.zhihu.api.mapper.FavoriteMapper;
import com.scs.mobile.zhihu.api.service.FavoriteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ke_zhang
 * @create 2020/1/21 17:17
 */
@Service
public class FavoriteServiceImpl implements FavoriteService {
    @Resource
    private FavoriteMapper favoriteMapper;


    @Override
    public List<Favorite> selectHot() {
        return favoriteMapper.selectHot();
    }

    @Override
    public List<Favorite> selectAll() {
        return favoriteMapper.selectAll();
    }
}
