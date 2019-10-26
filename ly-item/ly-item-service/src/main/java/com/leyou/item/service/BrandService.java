package com.leyou.item.service;

import com.leyou.common.pojo.PageResult;
import com.leyou.item.pojo.Brand;

/**
 * @author: lifalong
 * @create: 2019-10-25 20:18
 * @description:
 **/
public interface BrandService {

     PageResult<Brand> queryBrandByPageAndSort(
            Integer page, Integer rows, String sortBy, Boolean desc,
            String key);


}
