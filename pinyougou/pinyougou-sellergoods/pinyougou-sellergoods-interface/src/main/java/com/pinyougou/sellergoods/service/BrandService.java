package com.pinyougou.sellergoods.service;

import com.pinyougou.pojo.TbBrand;

import java.util.List;

/**
 * 创建接口 暴露的接口
 */
public interface BrandService {


    /**
     * 查询查询所有信息
     */
    public List<TbBrand> findAll();
}
