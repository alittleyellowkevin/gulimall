package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author huangkaiwen
 * @email 1648053382@qq.com
 * @date 2024-03-16 21:22:19
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
