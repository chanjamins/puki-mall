package com.jamin.jamin.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jamin.jamin.common.utils.PageUtils;
import com.jamin.jamin.order.entity.OmsOrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author chanjamin
 * @email jamin7597@163.com
 * @date 2022-09-10 12:58:35
 */
public interface OmsOrderReturnApplyService extends IService<OmsOrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

