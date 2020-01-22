package com.scs.mobile.zhihu.api.controller;

import com.scs.mobile.zhihu.api.common.Result;
import com.scs.mobile.zhihu.api.service.FavoriteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ke_zhang
 * @create 2020/1/21 17:20
 */
@RestController
@RequestMapping(value = "/api/favorite")
public class FavoriteController {
    @Resource
    private FavoriteService favoriteService;

    @GetMapping(value = "/hot")
    public Result getHot() {
        return Result.success(favoriteService.selectHot());
    }

    @GetMapping
    public Result getAll() {
        return Result.success(favoriteService.selectAll());
    }
}
