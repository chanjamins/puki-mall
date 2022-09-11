package com.jamin.jamin.member.dao;

import com.jamin.jamin.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author chanjamin
 * @email jamin7597@163.com
 * @date 2022-09-10 13:18:10
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
