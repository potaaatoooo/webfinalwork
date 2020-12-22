package com.ly.controller;

import com.ly.bean.Goods;
import com.ly.bean.msg;
import com.ly.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsController {
    @Autowired
    GoodsService goodsService;

    @PostMapping("getGoods.do")
    public msg getGoods(int pageNum, int pageSize,@RequestBody Goods goods){
        return msg.success().add("goodsList",goodsService.getGoods(pageNum,pageSize,goods));
    }

}
