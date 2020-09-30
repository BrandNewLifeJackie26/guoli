package com.guoli.guolimall.order.dao;

import com.guoli.guolimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author brandnewlifejackie26
 * @email test@gmail.com
 * @date 2020-09-30 13:25:08
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
