package com.jamin.jamin.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jamin.jamin.common.utils.PageUtils;
import com.jamin.jamin.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author chanjamin
 * @email jamin7597@163.com
 * @date 2022-09-10 12:00:55
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

