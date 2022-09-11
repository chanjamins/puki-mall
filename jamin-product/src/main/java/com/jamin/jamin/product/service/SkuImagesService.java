package com.jamin.jamin.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jamin.jamin.common.utils.PageUtils;
import com.jamin.jamin.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author chanjamin
 * @email jamin7597@163.com
 * @date 2022-09-10 11:46:17
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

