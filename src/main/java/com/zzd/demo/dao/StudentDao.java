package com.zzd.demo.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zzd.demo.entity.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
@DS("slave")
public interface StudentDao extends BaseMapper<Student> {
}
