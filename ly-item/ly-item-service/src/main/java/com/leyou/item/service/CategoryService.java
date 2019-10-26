package com.leyou.item.service;

import com.leyou.item.pojo.Category;

import java.util.List;

/**
 * @author: lifalong
 * @create: 2019-10-25 20:19
 * @description:
 **/
public interface CategoryService {

    /**
     * 根据父Id查询
     * @param pid
     * @return
     */
    List<Category> queryListByParent(Long pid);

    /**
     * 根据ids 查询 names
     * @param ids
     * @return
     */
    List<String> queryNamesByIds(List<Long> ids);
}
