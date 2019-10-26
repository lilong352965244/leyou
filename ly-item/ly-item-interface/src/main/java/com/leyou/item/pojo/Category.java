package com.leyou.item.pojo;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author: lifalong
 * @create: 2019-10-24 13:32
 * @description: 商品品目类
 **/
@Table(name = "tb_category")
@Data
public class Category implements Serializable {
    private static final long serialVersionUID = 3650623599187039174L;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long parentId;
    private Boolean isParent;
    private Integer sort;
}
