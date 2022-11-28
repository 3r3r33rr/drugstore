package com.example.webproject.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 
 * </p>
 *
 * @author Dylan
 * @since 2022-11-26
 */
@Data
@TableName("yaopin")
@ApiModel(value = "Drug对象", description = "")
public class Drug implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "db_drugid", type = IdType.AUTO)
    private Integer id;

    @TableField("db_price")
    private Double price;

    @TableField("db_name")
    private String name;

    @TableField("db_zuoyong")
    private String function;

    @TableField("db_tupian")
    private String photo;

    @TableField("db_kucun")
    private Integer stock;

    @TableField("db_xiangxi")
    private String details;

    @ApiModelProperty("规格")
    @TableField("db_guige")
    private String specification;

    @ApiModelProperty("保质期")
    @TableField("db_baozhi")
    private String shelflife;

    @ApiModelProperty("剂型")
    @TableField("db_jixing")
    private String formulations;

    @ApiModelProperty("科室")
    @TableField("db_keshi")
    private String department;

    @TableField("db_zhuangtai")
    private Boolean state;

    @ApiModelProperty("说明书id")
    @TableField("db_shuoming")
    private String instructionbookid;
}
