package com.leyou.item.service;

import com.leyou.item.pojo.Category;

import java.util.List;

/**
 * @author: lifalong
 * @create: 2019-10-25 20:19
 * @description:
 **/
public interface CategoryService {

    List<Category> queryListByParent(Long pid);
}
