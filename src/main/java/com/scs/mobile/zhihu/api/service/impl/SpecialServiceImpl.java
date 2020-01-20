package com.scs.mobile.zhihu.api.service.impl;

import com.scs.mobile.zhihu.api.mapper.SpecialMapper;
import com.scs.mobile.zhihu.api.service.SpecialService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author ke_zhang
 * @create 2020/1/16 17:14
 */
@Service
public class SpecialServiceImpl implements SpecialService {
    @Resource
    private SpecialMapper specialMapper;

    @Override
    public List<Map> selectAll() {
        return specialMapper.selectAll();
    }

    @Override
    public List<Map> selectRecent() {
        return specialMapper.selectRecent();
    }
}
