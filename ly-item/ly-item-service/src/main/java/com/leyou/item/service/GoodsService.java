package com.leyou.item.service;

import com.github.pagehelper.PageInfo;
import com.leyou.common.pojo.PageResult;
import com.leyou.item.pojo.SpuBo;

/**
 * @author: lifalong
 * @create: 2019-10-26 13:30
 * @description: 根据商品有关的接口包括（spu和sku）
 **/
public interface GoodsService {

    /**
     * 分页查询spu信息
     * @param page
     * @param rows
     * @param saleable
     * @param key
     * @return
     */
    PageResult<SpuBo> querySpuByPageAndSort(Integer page,Integer rows,Boolean saleable,
                String key);
}
