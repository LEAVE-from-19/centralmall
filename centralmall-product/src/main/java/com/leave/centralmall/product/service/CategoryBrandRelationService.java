package com.leave.centralmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.leave.centralmall.product.entity.CategoryBrandRelationEntity;
import com.leave.common.utils.PageUtils;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author dengwenqiang
 * @email 1214148984@qq.com
 * @date 2023-03-24 16:50:52
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

