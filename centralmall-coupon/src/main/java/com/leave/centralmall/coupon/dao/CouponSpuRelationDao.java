package com.leave.centralmall.coupon.dao;

import com.leave.centralmall.coupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author dengwenqiang
 * @email 1214148984@qq.com
 * @date 2023-03-25 17:04:13
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}
