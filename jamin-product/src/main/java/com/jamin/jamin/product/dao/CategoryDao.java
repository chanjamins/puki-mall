package com.jamin.jamin.product.dao;

import com.jamin.jamin.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author chanjamin
 * @email jamin7597@163.com
 * @date 2022-09-10 12:00:55
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
