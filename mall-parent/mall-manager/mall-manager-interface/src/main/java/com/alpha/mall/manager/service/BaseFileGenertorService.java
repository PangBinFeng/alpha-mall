package com.alpha.mall.manager.service;

import com.alpha.mall.manager.pojo.TMallClass1;
import com.alpha.mall.manager.transpojo.TMallClassDTO;

import java.util.List;


/**
 * @author : alphad1
 * @date : 2018/1/27 0027
 */
public interface BaseFileGenertorService {

    /**
     * 获取所有的商品分类信息
     * @return  商品分类信息集合
     */
    List<TMallClassDTO> queryAllTMallClassInfo();
}
