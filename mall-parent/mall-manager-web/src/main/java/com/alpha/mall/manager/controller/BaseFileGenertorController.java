package com.alpha.mall.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alpha.mall.manager.service.BaseFileGenertorService;
import com.alpha.mall.manager.transpojo.TMallClassDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author : alphad1
 * @date : 2018/1/27 0027
 */
@Controller
public class BaseFileGenertorController {

    @Autowired
    private BaseFileGenertorService baseFileGenertorService;

    @RequestMapping("/queryAllTMallClassInfo")
    @ResponseBody
    public List<TMallClassDTO> queryAllTMallClassInfo(){
        List<TMallClassDTO> tMallClassDTOS = baseFileGenertorService.queryAllTMallClassInfo();
        System.out.println(tMallClassDTOS);
        return tMallClassDTOS;
    }

}
