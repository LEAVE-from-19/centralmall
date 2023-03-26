package com.leave.centralmall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leave.centralmall.product.dao.AttrDao;
import com.leave.centralmall.product.entity.AttrEntity;
import com.leave.centralmall.product.service.AttrService;
import com.leave.common.utils.PageUtils;
import com.leave.common.utils.Query;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("attrService")
public class AttrServiceImpl extends ServiceImpl<AttrDao, AttrEntity> implements AttrService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AttrEntity> page = this.page(
                new Query<AttrEntity>().getPage(params),
                new QueryWrapper<AttrEntity>()
        );

        return new PageUtils(page);
    }

}