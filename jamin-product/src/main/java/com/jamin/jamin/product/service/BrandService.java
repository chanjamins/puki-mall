package com.jamin.jamin.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jamin.jamin.common.utils.PageUtils;
import com.jamin.jamin.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author chanjamin
 * @email jamin7597@163.com
 * @date 2022-09-10 12:00:55
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

