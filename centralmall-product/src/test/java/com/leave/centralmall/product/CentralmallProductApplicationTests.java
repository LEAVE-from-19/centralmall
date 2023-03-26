package com.leave.centralmall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.leave.centralmall.product.entity.BrandEntity;
import com.leave.centralmall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CentralmallProductApplicationTests {
    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {
        /*BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");
        brandService.save(brandEntity);*/

        /*brandEntity.setBrandId(1L);
        brandEntity.setDescript("华为");
        brandService.updateById(brandEntity);*/

        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        for (BrandEntity entity : list) {
            System.out.println(entity);
        }
    }

}
