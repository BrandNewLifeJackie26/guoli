package com.guoli.guolimall.product.dao;

import com.guoli.guolimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author brandnewlifejackie26
 * @email test@gmail.com
 * @date 2020-09-29 19:52:16
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
