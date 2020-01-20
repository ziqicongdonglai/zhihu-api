package com.scs.mobile.zhihu.api.controller;

import com.scs.mobile.zhihu.api.common.Result;
import com.scs.mobile.zhihu.api.service.RoundTableService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ke_zhang
 * @create 2020/1/17 15:23
 */
@RestController
@RequestMapping(value = "/api/roundtable")
public class RoundTableController {
    @Resource
    private RoundTableService roundTableService;

    @GetMapping(value = "/hot")
    public Result getHot() {
        return Result.success(roundTableService.selectHot());
    }

    @GetMapping
    public Result getAll() {
        return Result.success(roundTableService.selectAll());
    }
}
