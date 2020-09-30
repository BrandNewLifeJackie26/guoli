package com.guoli.guolimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guoli.common.utils.PageUtils;
import com.guoli.guolimall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author brandnewlifejackie26
 * @email test@gmail.com
 * @date 2020-09-30 13:25:08
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

