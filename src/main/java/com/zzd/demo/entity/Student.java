package com.zzd.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@TableName(value = "t_student")
@Getter
@Setter
@ToString
@Data
@ApiModel(value = "com.zzd.demo.entity.Student", description = "student库中的student表")
public class Student implements Serializable {

    private Long id;

    private String name;

    private Integer age;

}
