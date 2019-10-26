package com.leyou.item.service.impl;

import com.leyou.item.mapper.SpecGroupMapper;
import com.leyou.item.pojo.SpecGroup;
import com.leyou.item.service.SpecGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: lifalong
 * @create: 2019-10-26 10:27
 * @description:
 **/
@Service
public class SpecGroupServiceImpl implements SpecGroupService {
    @Autowired
    private SpecGroupMapper specGroupMapper;

    @Override
    public List<SpecGroup> querySpecGroups(Long cid) {
        SpecGroup specGroup = new SpecGroup();
        specGroup.setCid(cid);
        return this.specGroupMapper.select(specGroup);
    }
}
