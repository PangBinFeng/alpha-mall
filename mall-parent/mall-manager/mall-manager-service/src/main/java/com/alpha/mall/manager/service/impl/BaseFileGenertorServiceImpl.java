package com.alpha.mall.manager.service.impl;

import com.alpha.mall.manager.dao.TMallClass1Mapper;
import com.alpha.mall.manager.dao.TMallClass2Mapper;
import com.alpha.mall.manager.pojo.TMallClass1;
import com.alpha.mall.manager.pojo.TMallClass1Example;
import com.alpha.mall.manager.pojo.TMallClass2;
import com.alpha.mall.manager.pojo.TMallClass2Example;
import com.alpha.mall.manager.service.BaseFileGenertorService;
import com.alpha.mall.manager.transpojo.TMallClassDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author : alphad1
 * @date : 2018/1/27 0027
 */
public class BaseFileGenertorServiceImpl implements BaseFileGenertorService {

    private final Logger logger = LoggerFactory.getLogger(BaseFileGenertorServiceImpl.class);

    final
    TMallClass1Mapper tMallClass1Mapper;
    TMallClass2Mapper tMallClass2Mapper;

    @Autowired
    public BaseFileGenertorServiceImpl(TMallClass1Mapper tMallClass1Mapper,TMallClass2Mapper tMallClass2Mapper) {
        this.tMallClass1Mapper = tMallClass1Mapper;
        this.tMallClass2Mapper = tMallClass2Mapper;
    }

    @Override
    public List<TMallClassDTO> queryAllTMallClassInfo() {
        TMallClass1Example tMallClass1Example = new TMallClass1Example();
        tMallClass1Example.createCriteria()
                .andFlmch1IsNotNull();
        List<TMallClass1> tMallClass1s = tMallClass1Mapper.selectByExample(tMallClass1Example);
        for (TMallClass1 tMallClass1 : tMallClass1s) {
            Integer id = tMallClass1.getId();
            TMallClass2Example tMallClass2Example = new TMallClass2Example();
            tMallClass2Example.createCriteria()
                    .andFlbh1EqualTo(id);
            List<TMallClass2> tMallClass2s = tMallClass2Mapper.selectByExample(tMallClass2Example);
            TMallClassDTO tMallClassDTO = new TMallClassDTO();

        }
        return null;
    }
}
