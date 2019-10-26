package com.leyou.item.pojo;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author: lifalong
 * @create: 2019-10-24 15:16
 * @description: 商品品牌
 **/
@Table(name = "tb_brand")
@Data
public class Brand implements Serializable {
    private static final long serialVersionUID = -985888528237202101L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;// 品牌名称
    private String image;// 品牌图片
    private Character letter;
}
