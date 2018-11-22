package com.pinyougou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou.mapper.BrandMapper;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 创建接口的实现类
 */
//使用的阿里的service注解==并且标记实现的接口=暴露服务=将该服务注册到注册中心
@Service(interfaceClass =BrandService.class )
public class BrandServiceImpl implements BrandService{

    //可以使用该注解的原因是==该工程依赖了dao 都在spring容器下
    @Autowired
    private BrandMapper brandMapper;

    /**
     * 查询所有的品牌信息
     */
    public List<TbBrand> findAll(){
        return brandMapper.findAll();
    }
}
