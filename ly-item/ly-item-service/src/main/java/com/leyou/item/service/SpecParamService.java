package com.leyou.item.service;

import com.leyou.item.pojo.SpecParam;

import java.util.List;

/**
 * @author: lifalong
 * @create: 2019-10-26 10:44
 * @description:
 **/

public interface SpecParamService {

    /**
     * 根据规格组id 查询具体规格
     * @param gid
     * @return
     */
    List<SpecParam> querySpecParam(Long gid);
}
