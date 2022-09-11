package com.jamin.jamin.coupon.dao;

import com.jamin.jamin.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author chanjamin
 * @email jamin7597@163.com
 * @date 2022-09-10 14:18:55
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
