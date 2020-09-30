package com.guoli.guolimall.order.dao;

import com.guoli.guolimall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author brandnewlifejackie26
 * @email test@gmail.com
 * @date 2020-09-30 13:25:08
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
