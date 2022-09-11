package com.jamin.jamin.coupon.dao;

import com.jamin.jamin.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author chanjamin
 * @email jamin7597@163.com
 * @date 2022-09-10 14:19:50
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
