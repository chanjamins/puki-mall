package com.jamin.jamin.product.dao;

import com.jamin.jamin.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author chanjamin
 * @email jamin7597@163.com
 * @date 2022-09-10 11:46:17
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
