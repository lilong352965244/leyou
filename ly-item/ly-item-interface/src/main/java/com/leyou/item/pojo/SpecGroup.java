package com.leyou.item.pojo;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author: lifalong
 * @create: 2019-10-26 10:18
 * @description: 规格模板组
 **/
@Table(name = "tb_spec_group")
@Data
public class SpecGroup implements Serializable {
    private static final long serialVersionUID = -302207528852931562L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long cid;

    private String name;
}
