package com.guoli.guolimall.coupon.dao;

import com.guoli.guolimall.coupon.entity.HomeSubjectEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 首页专题表[jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息]
 * 
 * @author brandnewlifejackie26
 * @email test@gmail.com
 * @date 2020-09-30 12:57:57
 */
@Mapper
public interface HomeSubjectDao extends BaseMapper<HomeSubjectEntity> {
	
}
