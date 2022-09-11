package com.jamin.jamin.coupon.dao;

import com.jamin.jamin.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author chanjamin
 * @email jamin7597@163.com
 * @date 2022-09-10 14:19:50
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
