package com.jamin.jamin.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jamin.jamin.common.utils.PageUtils;
import com.jamin.jamin.order.entity.OmsOrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author chanjamin
 * @email jamin7597@163.com
 * @date 2022-09-10 12:58:36
 */
public interface OmsOrderService extends IService<OmsOrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

