package com.jamin.jamin.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jamin.jamin.common.utils.PageUtils;
import com.jamin.jamin.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author chanjamin
 * @email jamin7597@163.com
 * @date 2022-09-10 14:19:50
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

