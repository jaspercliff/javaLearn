package com.jasper;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.baomidou.mybatisplus.generator.fill.Column;
import java.util.Collections;

public class AutoGenerator {
    public static void main(String[] args) {

    // 配置模板
    FastAutoGenerator.create(
            "jdbc:mysql://49.234.34.109:3307/subEvaluation?useSSL=false&autoReconnect=true&characterEncoding=utf8", // 这里选择数据库表
            "root", // 这里写username
            "passwd") // 这里写password
        // 全局配置，生成的代码路径
        .globalConfig(
            builder ->
                builder
                    .author("jasper") // 设置作者
                    .enableSpringdoc() // 开启 swagger 模式
                    .outputDir("C:\\code\\javaLearn\\generator\\generator") // 指定输出目录 最好是绝对路径
                    .commentDate("yyyy-MM-dd"))
        // 包配置
        .templateEngine(new FreemarkerTemplateEngine())
        .packageConfig(
            builder ->
                builder
                    .parent("com.jasper") // 配置包路径
                    .entity("domains.po")
                    .pathInfo(
                        Collections.singletonMap(
                            OutputFile.entity,
                            "C:\\code\\javaLearn\\generator\\generator")) // 设置entity
                    .service("service") // 设置服务包名，默认service
                    .serviceImpl("service.Impl") // 设置服务实现类包名，默认service.impl
                    .controller("controller") // 设置控制器包名，默认controller
                    .mapper("mapper") // 设置mapper包名，默认mapper
                    .xml("mapper") // 设置xml包名，默认mapper.xml
                    .pathInfo(
                        Collections.singletonMap(
                            OutputFile.xml,
                            "C:\\code\\javaLearn\\generator\\generator")) // 设置mapper.xml生成路径
            )
        // 策略配置
        .strategyConfig(
            builder ->
                // 设置需要生成的表名
                builder
                    .addInclude("User")
                    .entityBuilder()
                    .enableLombok()
                    .enableFileOverride()
                    .columnNaming(NamingStrategy.underline_to_camel)
                    .enableFileOverride()
                    .addTableFills(new Column("CREATED_AT", FieldFill.INSERT))
                    .addTableFills(new Column("CREATED_BY", FieldFill.INSERT))
                    .addTableFills(new Column("UPDATED_AT", FieldFill.INSERT_UPDATE))
                    .addTableFills(new Column("UPDATED_BY", FieldFill.INSERT_UPDATE))
                    .logicDeleteColumnName("status")
                    .controllerBuilder()
                    .enableFileOverride()
                    .enableRestStyle()
                    .enableFileOverride()
                    .serviceBuilder()
                    .enableFileOverride()
                    .mapperBuilder()
                    .enableFileOverride()
                    .enableBaseColumnList()
                    .enableBaseResultMap())
        // 自定义文件输出配置
        .injectionConfig(
            builder ->
                new InjectionConfig.Builder()
                    // 自定义配置会被优先输出
                    // 加载模板文件并指定输出文件
                    // 模板文件名称最好和自定义文件名称一致，方便管理，同时建议统一使用controller等命令，防止出现错误。
                    .customFile(
                        Collections.singletonMap("controller.java", "template/controller.java"))
                    .customFile(Collections.singletonMap("entity.java", "template/entity.java"))
                    .customFile(Collections.singletonMap("mapper.java", "template/mapper.java"))
                    .customFile(Collections.singletonMap("service.java", "template/service.java"))
                    .customFile(
                        Collections.singletonMap("serviceImpl.java", "template/serviceImpl.java"))
                    .customFile(Collections.singletonMap("mapper.xml", "template/mapper.xml"))
                    .build())
        /*
         .injectionConfig：Mybatisplus-generator 的一个配置项，用于指定要使用的自定义配置。
          builder ->  new InjectionConfig.Builder()：Lambda 表达式，用于创建并返回一个 InjectionConfig.Builder 对象。
         .customFile(Collections.singletonMap("controller.java","template/controller.java"))：调用 Builder 对象的 .customFile 方法，
         用于添加一个自定义的模板文件，键值对 "controller.java" 和 "template/controller.java" 分别表示该模板的文件名和路径。
        */
        .execute();
            }
        }
