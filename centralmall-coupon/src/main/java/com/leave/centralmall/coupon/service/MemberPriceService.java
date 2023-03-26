package com.leave.centralmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.leave.common.utils.PageUtils;
import com.leave.centralmall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author dengwenqiang
 * @email 1214148984@qq.com
 * @date 2023-03-25 17:04:13
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

