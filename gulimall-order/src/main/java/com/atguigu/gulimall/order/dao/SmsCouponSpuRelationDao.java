package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.SmsCouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author huangkaiwen
 * @email 1648053382@qq.com
 * @date 2024-03-16 11:36:46
 */
@Mapper
public interface SmsCouponSpuRelationDao extends BaseMapper<SmsCouponSpuRelationEntity> {
	
}
