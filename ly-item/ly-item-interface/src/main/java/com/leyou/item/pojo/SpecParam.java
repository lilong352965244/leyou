package com.leyou.item.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.temporal.ValueRange;

/**
 * @author: lifalong
 * @create: 2019-10-25 19:19
 * @description:
 **/
@Table(name ="tb_spec_param")
@Data
public class SpecParam implements Serializable {
    private static final long serialVersionUID = 5298008357924895636L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long cid;
    private Long groupId;
    private String name;
    @Column(name = "`numeric`")
    private Boolean numeric;
    private String unit;
    private Boolean generic;
    private Boolean searching;
    private String segments;
}
