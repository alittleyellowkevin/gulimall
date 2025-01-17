package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * 1.整合mybatis-plus
 *  1）导入依赖
 *  2) 配置
 *      1 配置数据源 导入数据库驱动 在apllicaiton.yml配置数据源相关信息
 *      2 配置mybatis plus 使用mapperscan 告诉mabatisplus ，sql映射文件位置
 *     1.z真
 */
@EnableDiscoveryClient
@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
