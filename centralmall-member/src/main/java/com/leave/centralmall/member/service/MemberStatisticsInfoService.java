package com.leave.centralmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.leave.common.utils.PageUtils;
import com.leave.centralmall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author dengwenqiang
 * @email 1214148984@qq.com
 * @date 2023-03-25 17:27:46
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

