package com.ly.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ly.bean.Goods;
import com.ly.bean.GoodsExample;
import com.ly.dao.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsService {
    @Autowired
    GoodsMapper goodsMapper;
    public PageInfo getGoods(int pageNum, int pageSize, Goods goods){

        GoodsExample example = new GoodsExample();
        GoodsExample.Criteria criteria = example.createCriteria();
        if (goods.getGbarcode()!=null){
            criteria.andGbarcodeLike('%'+goods.getGbarcode()+'%');
        }
        if (goods.getGid()!=null){
            criteria.andGidLike('%'+goods.getGid()+'%');
        }
        if (goods.getGsupply()!=null){
            criteria.andGsupplyEqualTo(goods.getGsupply());
        }
        PageHelper.startPage(pageNum,pageSize);
        List<Goods> goodsList = goodsMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(goodsList);
        return pageInfo;
    }
}
