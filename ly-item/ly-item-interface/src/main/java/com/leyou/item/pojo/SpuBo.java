package com.leyou.item.pojo;

import lombok.Data;

/**
 * @author: lifalong
 * @create: 2019-10-26 13:09
 * @description: 扩展spu类
 **/
@Data
public class SpuBo extends Spu {
    String cname; //商品分类名称
    String bname; //品牌名称
}
