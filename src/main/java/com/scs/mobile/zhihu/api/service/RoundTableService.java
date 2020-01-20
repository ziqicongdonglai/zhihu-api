package com.scs.mobile.zhihu.api.service;

import com.scs.mobile.zhihu.api.entity.RoundTable;

import java.util.List;

/**
 * @author ke_zhang
 * @create 2020/1/17 15:31
 */
public interface RoundTableService {
    /**
     * 查询最热圆桌
     *
     * @return List<RoundTable>
     */
    List<RoundTable> selectHot();

    /**
     * 查询所有圆桌
     *
     * @return List<RoundTable>
     */
    List<RoundTable> selectAll();
}
