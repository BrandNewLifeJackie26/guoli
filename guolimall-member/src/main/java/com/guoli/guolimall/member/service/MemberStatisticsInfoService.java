package com.guoli.guolimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guoli.common.utils.PageUtils;
import com.guoli.guolimall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author brandnewlifejackie26
 * @email test@gmail.com
 * @date 2020-09-30 13:16:54
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

