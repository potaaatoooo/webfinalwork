package com.ly.test;

import com.github.pagehelper.PageInfo;
import com.ly.bean.Goods;
import com.ly.dao.GoodsMapper;
import com.ly.service.GoodsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application.xml"})
public class NewsTest {
    @Autowired
    GoodsMapper goodsMapper;
    @Autowired
    GoodsService goodsService;

    @Test
    public void testGet(){
        Goods goods = new Goods();

        PageInfo goods1 = goodsService.getGoods(1, 100, goods);
        System.out.println(goods1.getList().size());

    }

}
