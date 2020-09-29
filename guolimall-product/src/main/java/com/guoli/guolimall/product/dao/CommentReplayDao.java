package com.guoli.guolimall.product.dao;

import com.guoli.guolimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author brandnewlifejackie26
 * @email test@gmail.com
 * @date 2020-09-29 19:52:16
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
