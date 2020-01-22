package com.scs.mobile.zhihu.api.controller;

import com.scs.mobile.zhihu.api.common.Result;
import com.scs.mobile.zhihu.api.service.ColumnsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ke_zhang
 * @create 2020/1/22 21:09
 */
@RestController
@RequestMapping(value = "/api/columns")
public class ColumnsController {
    @Resource
    private ColumnsService columnsService;

    @GetMapping(value = "/hot")
    public Result getHot() {
        return Result.success(columnsService.selectHot());
    }
    @GetMapping
    public Result getAll() {
        return Result.success(columnsService.selectAll());
    }
}
