package com.example.webproject.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
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
@TableName("directions")
@ApiModel(value = "InstructionBook对象", description = "")
public class InstructionBook implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("db_drugid")
    private Integer drugId;

    @ApiModelProperty("用量")
    @TableField("db_useage")
    private String dosage;

    @ApiModelProperty("禁忌")
    @TableField("db_taboo")
    private String taboo;

    @ApiModelProperty("功能主治")
    @TableField("db_functions")
    private String function;

    @TableField("db_title")
    private String name;
}
