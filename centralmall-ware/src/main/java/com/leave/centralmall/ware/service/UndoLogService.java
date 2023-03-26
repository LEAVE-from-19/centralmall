package com.leave.centralmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.leave.common.utils.PageUtils;
import com.leave.centralmall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author dengwenqiang
 * @email 1214148984@qq.com
 * @date 2023-03-25 18:02:52
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

