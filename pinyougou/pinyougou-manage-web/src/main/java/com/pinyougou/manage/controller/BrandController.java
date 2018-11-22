package com.pinyougou.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 创建品牌controller
 * @RestController==相当于@Controller 以及@ResponseMapping结合体
 *  代表的是 返回的是json数据 并且是controller
 */

@RequestMapping("/brand")
@RestController
public class BrandController {

    /**
     * 因为处理器中没有service中的数据 所以需要从阿里巴巴提供的service中取出service对象
     * 就是从远程服务器中取出对象
     */
    @Reference
    private BrandService brandService;
    /**
     * ：http://localhost:9100/brand/findAll.do
     * 访问的地址
     * @RequestMapping("/findAll.do")
     @ResponseBody==原始写法
     @GetMapping 相当于requestMapping
     */
    @GetMapping("/findAll.do")
    public List<TbBrand> findAll(){
        return brandService.findAll();
    }
}
