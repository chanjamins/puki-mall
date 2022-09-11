package com.jamin.jamin.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jamin.jamin.common.utils.PageUtils;
import com.jamin.jamin.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author chanjamin
 * @email jamin7597@163.com
 * @date 2022-09-10 14:18:55
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

