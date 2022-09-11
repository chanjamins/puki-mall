package com.jamin.jamin.member.feign;/*
 *create by jamin on ${date}
 *@Descrip
 *@Return
 */

import com.jamin.jamin.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("jamin-coupon")//要调用的微服务
public interface CouponFeignService {

    @RequestMapping("coupon/coupon/member/list")
    public R membercoupons();
}
