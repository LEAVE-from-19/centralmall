package com.leave.centralmall.order.dao;

import com.leave.centralmall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author dengwenqiang
 * @email 1214148984@qq.com
 * @date 2023-03-25 17:56:07
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
