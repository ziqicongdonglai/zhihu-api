package com.scs.mobile.zhihu.api.mapper;

import com.scs.mobile.zhihu.api.ZhihuApiApplication;
import com.scs.mobile.zhihu.api.entity.RoundTable;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author ke_zhang
 * @create 2020/1/17 15:44
 */
@SpringBootTest(classes = ZhihuApiApplication.class)
class RoundTableMapperTest {
    @Resource
    private RoundTableMapper roundTableMapper;

    @Test
    void selectHot() {
        List<RoundTable> roundTables = roundTableMapper.selectHot();
        roundTables.forEach(System.out::println);
    }

    @Test
    void selectAll() {
        List<RoundTable> roundTables = roundTableMapper.selectAll();
        roundTables.forEach(System.out::println);
    }
}