package com.scs.mobile.zhihu.api.service;

import java.util.List;
import java.util.Map;

/**
 * @author ke_zhang
 * @create 2020/1/16 17:11
 */
public interface SpecialService {
    /**
     * 查询所有专题
     *
     * @return List<Map>
     */
    List<Map> selectAll();

    /**
     * 查询最新专题
     *
     * @return List<Special>
     */
    List<Map> selectRecent();
}
