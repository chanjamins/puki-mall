package com.jamin.jamin.order.dao;

import com.jamin.jamin.order.entity.OmsPaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author chanjamin
 * @email jamin7597@163.com
 * @date 2022-09-10 12:58:35
 */
@Mapper
public interface OmsPaymentInfoDao extends BaseMapper<OmsPaymentInfoEntity> {
	
}
