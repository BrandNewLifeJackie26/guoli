package com.guoli.guolimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guoli.common.utils.PageUtils;
import com.guoli.guolimall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author brandnewlifejackie26
 * @email test@gmail.com
 * @date 2020-09-30 13:16:54
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

