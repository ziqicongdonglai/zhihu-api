package com.scs.mobile.zhihu.api.mapper;

import com.scs.mobile.zhihu.api.entity.Special;
import com.scs.mobile.zhihu.api.ZhihuApiApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author ke_zhang
 * @create 2020/1/16 16:33
 */
@SpringBootTest(classes = ZhihuApiApplication.class)
class SpecialMapperTest {
    @Resource
    private SpecialMapper specialMapper;

    @Test
    void selectRecent() {
        List<Special> specials = specialMapper.selectRecent();
        specials.forEach(System.out::println);
    }

    @Test
    void selectAll() {
        List<Map> specials = specialMapper.selectAll();
        specials.forEach(System.out::println);
    }
}