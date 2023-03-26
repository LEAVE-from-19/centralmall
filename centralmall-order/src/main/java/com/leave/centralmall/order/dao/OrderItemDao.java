package com.leave.centralmall.order.dao;

import com.leave.centralmall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author dengwenqiang
 * @email 1214148984@qq.com
 * @date 2023-03-25 17:56:07
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
