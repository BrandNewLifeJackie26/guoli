package com.guoli.guolimall.coupon.dao;

import com.guoli.guolimall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author brandnewlifejackie26
 * @email test@gmail.com
 * @date 2020-09-30 12:57:56
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
