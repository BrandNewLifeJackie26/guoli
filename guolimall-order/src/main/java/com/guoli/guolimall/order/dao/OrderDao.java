package com.guoli.guolimall.order.dao;

import com.guoli.guolimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author brandnewlifejackie26
 * @email test@gmail.com
 * @date 2020-09-30 13:25:08
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
