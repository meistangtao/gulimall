package com.tangtao.gulimall.portduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tangtao.gulimall.utils.PageUtils;
import com.tangtao.gulimall.portduct.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author chenshun
 * @email tangtao@gmail.com
 * @date 2020-11-07 10:57:48
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

