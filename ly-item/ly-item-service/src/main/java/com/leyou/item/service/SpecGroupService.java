package com.leyou.item.service;

import com.leyou.item.pojo.SpecGroup;

import java.util.List;

/**
 * @author: lifalong
 * @create: 2019-10-26 10:23
 * @description:
 **/
public interface SpecGroupService  {
    /**
     * 根据分类id 查询规格分类组
     * @param cid
     * @return
     */
    List<SpecGroup> querySpecGroups(Long cid);
}
