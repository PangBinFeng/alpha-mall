package com.alpha.mall.manager.pojo;

import java.util.Date;

public class TMallCommentImage {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mall_comment_image.id
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mall_comment_image.pl_id
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    private Integer plId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mall_comment_image.url
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mall_comment_image.create_time
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mall_comment_image.id
     *
     * @return the value of t_mall_comment_image.id
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mall_comment_image.id
     *
     * @param id the value for t_mall_comment_image.id
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mall_comment_image.pl_id
     *
     * @return the value of t_mall_comment_image.pl_id
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public Integer getPlId() {
        return plId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mall_comment_image.pl_id
     *
     * @param plId the value for t_mall_comment_image.pl_id
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public void setPlId(Integer plId) {
        this.plId = plId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mall_comment_image.url
     *
     * @return the value of t_mall_comment_image.url
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mall_comment_image.url
     *
     * @param url the value for t_mall_comment_image.url
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mall_comment_image.create_time
     *
     * @return the value of t_mall_comment_image.create_time
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mall_comment_image.create_time
     *
     * @param createTime the value for t_mall_comment_image.create_time
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}