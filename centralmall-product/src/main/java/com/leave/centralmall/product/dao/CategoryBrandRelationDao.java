package com.leave.centralmall.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leave.centralmall.product.entity.CategoryBrandRelationEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌分类关联
 * 
 * @author dengwenqiang
 * @email 1214148984@qq.com
 * @date 2023-03-24 16:50:52
 */
@Mapper
public interface CategoryBrandRelationDao extends BaseMapper<CategoryBrandRelationEntity> {
	
}
