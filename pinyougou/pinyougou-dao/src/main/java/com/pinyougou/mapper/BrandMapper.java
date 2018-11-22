package com.pinyougou.mapper;

import com.pinyougou.pojo.TbBrand;

import java.util.List;

/**
 * 创建dao层接口
 */
public interface BrandMapper {
    //查询所有的品牌信息
    public List<TbBrand> findAll();
}
