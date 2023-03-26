package com.leave.centralmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.leave.centralmall.product.entity.CommentReplayEntity;
import com.leave.common.utils.PageUtils;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author dengwenqiang
 * @email 1214148984@qq.com
 * @date 2023-03-24 16:50:52
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

