package com.alpha.mall.manager.service.impl;

import com.alpha.mall.manager.dao.TMallClass1Mapper;
import com.alpha.mall.manager.dao.TMallClass2Mapper;
import com.alpha.mall.manager.pojo.TMallClass2;
import com.alpha.mall.manager.transpojo.TMallClassDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author : alphad1
 * @date : 2018/1/29 0029
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/ApplicationContext-dao.xml"})
public class BaseFileGenertorServiceImplTest {

    @Autowired
    TMallClass1Mapper tMallClass1Mapper;

    @Autowired
    TMallClass2Mapper tMallClass2Mapper;

    @Test
    public void queryAllTMallClassInfo() throws Exception {
        TMallClass2 tMallClass2 = tMallClass2Mapper.selectByPrimaryKey(11);
        System.out.println(tMallClass2);
    }

}