package com.zzd.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
//import com.wordnik.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@TableName(value = "user")
@Getter
@Setter
@ToString
@Data
@ApiModel(value = "com.zzd.demo.entity.User", description = "test库中的user表")
public class User implements Serializable {

    private Long id;

    private String name;

    private Integer age;

    private String email;
}
