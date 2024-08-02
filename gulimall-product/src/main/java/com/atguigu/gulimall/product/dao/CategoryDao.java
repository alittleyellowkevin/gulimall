package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author huangkaiwen
 * @email 1648053382@qq.com
 * @date 2024-03-16 08:46:44
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
