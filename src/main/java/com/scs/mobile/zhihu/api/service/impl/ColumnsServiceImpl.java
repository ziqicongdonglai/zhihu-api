package com.scs.mobile.zhihu.api.service.impl;

import com.scs.mobile.zhihu.api.entity.Columns;
import com.scs.mobile.zhihu.api.mapper.ColumnsMapper;
import com.scs.mobile.zhihu.api.service.ColumnsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ke_zhang
 * @create 2020/1/22 21:07
 */
@Service
public class ColumnsServiceImpl implements ColumnsService {
    @Resource
    private ColumnsMapper columnsMapper;


    @Override
    public List<Columns> selectHot() {
        return columnsMapper.selectHot();
    }

    @Override
    public List<Columns> selectAll() {
        return columnsMapper.selectAll();
    }
}
