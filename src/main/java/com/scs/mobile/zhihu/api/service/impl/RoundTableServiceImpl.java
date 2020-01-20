package com.scs.mobile.zhihu.api.service.impl;

import com.scs.mobile.zhihu.api.entity.RoundTable;
import com.scs.mobile.zhihu.api.mapper.RoundTableMapper;
import com.scs.mobile.zhihu.api.service.RoundTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ke_zhang
 * @create 2020/1/17 15:28
 */
@Service
public class RoundTableServiceImpl implements RoundTableService {
    @Resource
    private RoundTableMapper roundTableMapper;

    @Override
    public List<RoundTable> selectHot() {
        return roundTableMapper.selectHot();
    }

    @Override
    public List<RoundTable> selectAll() {
        return roundTableMapper.selectAll();
    }
}
