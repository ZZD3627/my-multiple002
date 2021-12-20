package com.zzd.demo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zzd.demo.entity.Student;
import com.zzd.demo.entity.User;
import com.zzd.demo.service.DynamicDataSourceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@Api(tags = "测试swagger接口",description = "User模块")//描述
public class DynamicDataSourceController {

    @Autowired
    private DynamicDataSourceService dynamicDataSourceService;

    @ApiOperation(value = "我的第一个swagger接口")
    @PostMapping("/swagger")
    public Page<Student> testUser(
//            @ApiParam(value = "用户实体",required = true) @RequestBody User user, HttpServletRequest request
    ){
//        System.out.println(request.getHeader("token"));
        System.out.println("调用student");
        return dynamicDataSourceService.testSlave();
    }

    @ApiOperation(value = "我的第二个swagger接口")
    @PostMapping("/user")
    public List<User> users(
//            @ApiParam(value = "用户实体",required = true) @RequestBody User user, HttpServletRequest request
    ){
        System.out.println("调用test");
        return dynamicDataSourceService.testMaster();
    }

}