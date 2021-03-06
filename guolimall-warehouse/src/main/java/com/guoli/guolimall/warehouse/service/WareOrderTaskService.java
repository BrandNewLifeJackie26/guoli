package com.guoli.guolimall.warehouse.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guoli.common.utils.PageUtils;
import com.guoli.guolimall.warehouse.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author brandnewlifejackie26
 * @email test@gmail.com
 * @date 2020-09-30 13:47:27
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

