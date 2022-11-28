package com.example.webproject.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
@TableName("users")
@ApiModel(value = "User对象", description = "")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "db_userid", type = IdType.AUTO)
    private Integer id;

    @TableField("db_pwd")
    private String pwd;

    @TableField("db_username")
    private String name;

    @TableField("db_phonnum")
    private String phone;

    @TableField("db_sex")
    private String sex;

    @TableField("db_flag")
    private String flag;

    @TableField("db_email")
    private String email;

    @TableField("db_address")
    private String address;

    @TableField("db_userage")
    private Integer userage;

    @TableField("db_birth")
    private String birth;

}
