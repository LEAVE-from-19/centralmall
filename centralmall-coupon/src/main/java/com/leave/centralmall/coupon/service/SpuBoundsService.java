package com.leave.centralmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.leave.common.utils.PageUtils;
import com.leave.centralmall.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author dengwenqiang
 * @email 1214148984@qq.com
 * @date 2023-03-25 17:04:12
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

