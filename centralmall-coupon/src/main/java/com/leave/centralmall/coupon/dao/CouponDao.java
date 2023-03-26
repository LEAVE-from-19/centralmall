package com.leave.centralmall.coupon.dao;

import com.leave.centralmall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author dengwenqiang
 * @email 1214148984@qq.com
 * @date 2023-03-25 17:04:13
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
