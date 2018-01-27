package com.alpha.mall.manager.transpojo;

import com.alpha.mall.manager.pojo.TMallClass1;
import com.alpha.mall.manager.pojo.TMallClass2;

import java.util.List;

/**
 * @author : alphad1
 * @date : 2018/1/27 0027
 */
public class TMallClassDTO extends TMallClass1{

    private List<TMallClass2> class2List = null;

    public List<TMallClass2> getClass2List() {
        return class2List;
    }

    public void setClass2List(List<TMallClass2> class2List) {
        this.class2List = class2List;
    }

}
