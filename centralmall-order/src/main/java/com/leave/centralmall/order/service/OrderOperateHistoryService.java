package com.leave.centralmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.leave.common.utils.PageUtils;
import com.leave.centralmall.order.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author dengwenqiang
 * @email 1214148984@qq.com
 * @date 2023-03-25 17:56:07
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

