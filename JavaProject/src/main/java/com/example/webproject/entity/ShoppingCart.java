package com.example.webproject.entity;

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
@TableName("shopcart")
@ApiModel(value = "ShoppingCart对象", description = "")
public class ShoppingCart implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("db_userid")
    private Integer userId;

    @TableField("db_drugid")
    private Integer drugId;

    @TableField("db_ypname")
    private String drugName;

    @TableField("db_amount")
    private Integer count;

    @TableField("db_price")
    private BigDecimal price;

    @TableField("db_img")
    private String photo;

    @TableField("db_state")
    private String state;
}
