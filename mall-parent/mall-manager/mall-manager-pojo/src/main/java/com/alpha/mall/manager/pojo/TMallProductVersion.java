package com.alpha.mall.manager.pojo;

import java.util.Date;

public class TMallProductVersion {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mall_product_version.id
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mall_product_version.shp_id
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    private Integer shpId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mall_product_version.shp_bb
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    private String shpBb;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mall_product_version.shfqy
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    private Integer shfqy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mall_product_version.chj_time
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    private Date chjTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mall_product_version.id
     *
     * @return the value of t_mall_product_version.id
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mall_product_version.id
     *
     * @param id the value for t_mall_product_version.id
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mall_product_version.shp_id
     *
     * @return the value of t_mall_product_version.shp_id
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public Integer getShpId() {
        return shpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mall_product_version.shp_id
     *
     * @param shpId the value for t_mall_product_version.shp_id
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public void setShpId(Integer shpId) {
        this.shpId = shpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mall_product_version.shp_bb
     *
     * @return the value of t_mall_product_version.shp_bb
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public String getShpBb() {
        return shpBb;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mall_product_version.shp_bb
     *
     * @param shpBb the value for t_mall_product_version.shp_bb
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public void setShpBb(String shpBb) {
        this.shpBb = shpBb == null ? null : shpBb.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mall_product_version.shfqy
     *
     * @return the value of t_mall_product_version.shfqy
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public Integer getShfqy() {
        return shfqy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mall_product_version.shfqy
     *
     * @param shfqy the value for t_mall_product_version.shfqy
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public void setShfqy(Integer shfqy) {
        this.shfqy = shfqy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mall_product_version.chj_time
     *
     * @return the value of t_mall_product_version.chj_time
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public Date getChjTime() {
        return chjTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mall_product_version.chj_time
     *
     * @param chjTime the value for t_mall_product_version.chj_time
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public void setChjTime(Date chjTime) {
        this.chjTime = chjTime;
    }
}