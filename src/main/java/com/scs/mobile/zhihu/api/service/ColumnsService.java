package com.scs.mobile.zhihu.api.service;

import com.scs.mobile.zhihu.api.entity.Columns;

import java.util.List;

/**
 * @author ke_zhang
 * @create 2020/1/22 21:04
 */
public interface ColumnsService {
    /**
     * 查询四个专栏
     *
     * @return List<Columns>
     */
    List<Columns> selectHot();

    /**
     * 查询所有专栏
     *
     * @return List<Columns>
     */
    List<Columns> selectAll();
}
