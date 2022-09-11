package com.jamin.jamin.ware.dao;

import com.jamin.jamin.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author chanjamin
 * @email jamin7597@163.com
 * @date 2022-09-10 14:29:07
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
