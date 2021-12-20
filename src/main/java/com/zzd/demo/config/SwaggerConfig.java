package com.zzd.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@Configuration//表示这是一个配置类
@EnableSwagger2//开启Swagger2
public class SwaggerConfig {

//    @Bean
//    public Docket reeateDocket(){
//        List<Parameter> parameterList=new ArrayList<>();
//        ParameterBuilder parameterBuilder=new ParameterBuilder();
//        parameterBuilder.name("token")
//                .description("swagger调试用，模拟传入用户凭证")
//                .modelRef(new ModelRef("String"))
//                .parameterType("header").required(false);
//        parameterList.add(parameterBuilder.build());
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())//创建该Api的基本信息（这些基本信息会展现在文档页面中）
//                .select()//函数返回一个ApiSelectorBuilder实例用来控制哪些接口暴露给Swagger ui来展现
//                .apis(RequestHandlerSelectors.basePackage("com.zzd.demo.controller"))//指定需要扫描的包路路径
//                .paths(PathSelectors.any())
//                .build()
//                .globalOperationParameters(parameterList)
//                ;
//    }
//    //配置swagger的信息
//    private ApiInfo apiInfo(){
//        return new ApiInfoBuilder()
//                .title("spring boot2.x实战")
//                .description("整合swagger")
//                .termsOfServiceUrl("")
//                .version("2.0")
//                .build();
//    }

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                //是否开启 (true 开启  false隐藏。生产环境建议隐藏)
                //.enable(false)
                .select()
                //扫描的路径包,设置basePackage会将包下的所有被@Api标记类的所有方法作为api
                .apis(RequestHandlerSelectors.basePackage("com.zzd.demo.controller"))
                //指定路径处理PathSelectors.any()代表所有的路径
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //设置文档标题(API名称)
                .title("SpringBoot中使用Swagger2接口规范")
                //文档描述
                .description("整合swagger")
                //服务条款URL
                .termsOfServiceUrl("")
                //版本号
                .version("2.0")
                .build();
    }

}