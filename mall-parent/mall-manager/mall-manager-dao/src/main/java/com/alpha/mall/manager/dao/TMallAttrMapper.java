package com.alpha.mall.manager.dao;

import com.alpha.mall.manager.pojo.TMallAttr;
import com.alpha.mall.manager.pojo.TMallAttrExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TMallAttrMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_attr
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    int countByExample(TMallAttrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_attr
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    int deleteByExample(TMallAttrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_attr
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_attr
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    int insert(TMallAttr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_attr
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    int insertSelective(TMallAttr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_attr
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    List<TMallAttr> selectByExample(TMallAttrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_attr
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    TMallAttr selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_attr
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    int updateByExampleSelective(@Param("record") TMallAttr record, @Param("example") TMallAttrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_attr
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    int updateByExample(@Param("record") TMallAttr record, @Param("example") TMallAttrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_attr
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    int updateByPrimaryKeySelective(TMallAttr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_attr
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    int updateByPrimaryKey(TMallAttr record);
}