package com.alpha.mall.manager.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TMallFlowExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_mall_flow
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_mall_flow
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_mall_flow
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_flow
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public TMallFlowExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_flow
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_flow
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_flow
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_flow
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_flow
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_flow
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_flow
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_flow
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_flow
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_flow
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_mall_flow
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDistributionModeIsNull() {
            addCriterion("distribution_mode is null");
            return (Criteria) this;
        }

        public Criteria andDistributionModeIsNotNull() {
            addCriterion("distribution_mode is not null");
            return (Criteria) this;
        }

        public Criteria andDistributionModeEqualTo(String value) {
            addCriterion("distribution_mode =", value, "distributionMode");
            return (Criteria) this;
        }

        public Criteria andDistributionModeNotEqualTo(String value) {
            addCriterion("distribution_mode <>", value, "distributionMode");
            return (Criteria) this;
        }

        public Criteria andDistributionModeGreaterThan(String value) {
            addCriterion("distribution_mode >", value, "distributionMode");
            return (Criteria) this;
        }

        public Criteria andDistributionModeGreaterThanOrEqualTo(String value) {
            addCriterion("distribution_mode >=", value, "distributionMode");
            return (Criteria) this;
        }

        public Criteria andDistributionModeLessThan(String value) {
            addCriterion("distribution_mode <", value, "distributionMode");
            return (Criteria) this;
        }

        public Criteria andDistributionModeLessThanOrEqualTo(String value) {
            addCriterion("distribution_mode <=", value, "distributionMode");
            return (Criteria) this;
        }

        public Criteria andDistributionModeLike(String value) {
            addCriterion("distribution_mode like", value, "distributionMode");
            return (Criteria) this;
        }

        public Criteria andDistributionModeNotLike(String value) {
            addCriterion("distribution_mode not like", value, "distributionMode");
            return (Criteria) this;
        }

        public Criteria andDistributionModeIn(List<String> values) {
            addCriterion("distribution_mode in", values, "distributionMode");
            return (Criteria) this;
        }

        public Criteria andDistributionModeNotIn(List<String> values) {
            addCriterion("distribution_mode not in", values, "distributionMode");
            return (Criteria) this;
        }

        public Criteria andDistributionModeBetween(String value1, String value2) {
            addCriterion("distribution_mode between", value1, value2, "distributionMode");
            return (Criteria) this;
        }

        public Criteria andDistributionModeNotBetween(String value1, String value2) {
            addCriterion("distribution_mode not between", value1, value2, "distributionMode");
            return (Criteria) this;
        }

        public Criteria andDistributionTimeIsNull() {
            addCriterion("distribution_time is null");
            return (Criteria) this;
        }

        public Criteria andDistributionTimeIsNotNull() {
            addCriterion("distribution_time is not null");
            return (Criteria) this;
        }

        public Criteria andDistributionTimeEqualTo(Date value) {
            addCriterion("distribution_time =", value, "distributionTime");
            return (Criteria) this;
        }

        public Criteria andDistributionTimeNotEqualTo(Date value) {
            addCriterion("distribution_time <>", value, "distributionTime");
            return (Criteria) this;
        }

        public Criteria andDistributionTimeGreaterThan(Date value) {
            addCriterion("distribution_time >", value, "distributionTime");
            return (Criteria) this;
        }

        public Criteria andDistributionTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("distribution_time >=", value, "distributionTime");
            return (Criteria) this;
        }

        public Criteria andDistributionTimeLessThan(Date value) {
            addCriterion("distribution_time <", value, "distributionTime");
            return (Criteria) this;
        }

        public Criteria andDistributionTimeLessThanOrEqualTo(Date value) {
            addCriterion("distribution_time <=", value, "distributionTime");
            return (Criteria) this;
        }

        public Criteria andDistributionTimeIn(List<Date> values) {
            addCriterion("distribution_time in", values, "distributionTime");
            return (Criteria) this;
        }

        public Criteria andDistributionTimeNotIn(List<Date> values) {
            addCriterion("distribution_time not in", values, "distributionTime");
            return (Criteria) this;
        }

        public Criteria andDistributionTimeBetween(Date value1, Date value2) {
            addCriterion("distribution_time between", value1, value2, "distributionTime");
            return (Criteria) this;
        }

        public Criteria andDistributionTimeNotBetween(Date value1, Date value2) {
            addCriterion("distribution_time not between", value1, value2, "distributionTime");
            return (Criteria) this;
        }

        public Criteria andDistributionDescriprionIsNull() {
            addCriterion("distribution_descriprion is null");
            return (Criteria) this;
        }

        public Criteria andDistributionDescriprionIsNotNull() {
            addCriterion("distribution_descriprion is not null");
            return (Criteria) this;
        }

        public Criteria andDistributionDescriprionEqualTo(String value) {
            addCriterion("distribution_descriprion =", value, "distributionDescriprion");
            return (Criteria) this;
        }

        public Criteria andDistributionDescriprionNotEqualTo(String value) {
            addCriterion("distribution_descriprion <>", value, "distributionDescriprion");
            return (Criteria) this;
        }

        public Criteria andDistributionDescriprionGreaterThan(String value) {
            addCriterion("distribution_descriprion >", value, "distributionDescriprion");
            return (Criteria) this;
        }

        public Criteria andDistributionDescriprionGreaterThanOrEqualTo(String value) {
            addCriterion("distribution_descriprion >=", value, "distributionDescriprion");
            return (Criteria) this;
        }

        public Criteria andDistributionDescriprionLessThan(String value) {
            addCriterion("distribution_descriprion <", value, "distributionDescriprion");
            return (Criteria) this;
        }

        public Criteria andDistributionDescriprionLessThanOrEqualTo(String value) {
            addCriterion("distribution_descriprion <=", value, "distributionDescriprion");
            return (Criteria) this;
        }

        public Criteria andDistributionDescriprionLike(String value) {
            addCriterion("distribution_descriprion like", value, "distributionDescriprion");
            return (Criteria) this;
        }

        public Criteria andDistributionDescriprionNotLike(String value) {
            addCriterion("distribution_descriprion not like", value, "distributionDescriprion");
            return (Criteria) this;
        }

        public Criteria andDistributionDescriprionIn(List<String> values) {
            addCriterion("distribution_descriprion in", values, "distributionDescriprion");
            return (Criteria) this;
        }

        public Criteria andDistributionDescriprionNotIn(List<String> values) {
            addCriterion("distribution_descriprion not in", values, "distributionDescriprion");
            return (Criteria) this;
        }

        public Criteria andDistributionDescriprionBetween(String value1, String value2) {
            addCriterion("distribution_descriprion between", value1, value2, "distributionDescriprion");
            return (Criteria) this;
        }

        public Criteria andDistributionDescriprionNotBetween(String value1, String value2) {
            addCriterion("distribution_descriprion not between", value1, value2, "distributionDescriprion");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andChjTimeIsNull() {
            addCriterion("chj_time is null");
            return (Criteria) this;
        }

        public Criteria andChjTimeIsNotNull() {
            addCriterion("chj_time is not null");
            return (Criteria) this;
        }

        public Criteria andChjTimeEqualTo(Date value) {
            addCriterion("chj_time =", value, "chjTime");
            return (Criteria) this;
        }

        public Criteria andChjTimeNotEqualTo(Date value) {
            addCriterion("chj_time <>", value, "chjTime");
            return (Criteria) this;
        }

        public Criteria andChjTimeGreaterThan(Date value) {
            addCriterion("chj_time >", value, "chjTime");
            return (Criteria) this;
        }

        public Criteria andChjTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("chj_time >=", value, "chjTime");
            return (Criteria) this;
        }

        public Criteria andChjTimeLessThan(Date value) {
            addCriterion("chj_time <", value, "chjTime");
            return (Criteria) this;
        }

        public Criteria andChjTimeLessThanOrEqualTo(Date value) {
            addCriterion("chj_time <=", value, "chjTime");
            return (Criteria) this;
        }

        public Criteria andChjTimeIn(List<Date> values) {
            addCriterion("chj_time in", values, "chjTime");
            return (Criteria) this;
        }

        public Criteria andChjTimeNotIn(List<Date> values) {
            addCriterion("chj_time not in", values, "chjTime");
            return (Criteria) this;
        }

        public Criteria andChjTimeBetween(Date value1, Date value2) {
            addCriterion("chj_time between", value1, value2, "chjTime");
            return (Criteria) this;
        }

        public Criteria andChjTimeNotBetween(Date value1, Date value2) {
            addCriterion("chj_time not between", value1, value2, "chjTime");
            return (Criteria) this;
        }

        public Criteria andDdIdIsNull() {
            addCriterion("dd_id is null");
            return (Criteria) this;
        }

        public Criteria andDdIdIsNotNull() {
            addCriterion("dd_id is not null");
            return (Criteria) this;
        }

        public Criteria andDdIdEqualTo(Integer value) {
            addCriterion("dd_id =", value, "ddId");
            return (Criteria) this;
        }

        public Criteria andDdIdNotEqualTo(Integer value) {
            addCriterion("dd_id <>", value, "ddId");
            return (Criteria) this;
        }

        public Criteria andDdIdGreaterThan(Integer value) {
            addCriterion("dd_id >", value, "ddId");
            return (Criteria) this;
        }

        public Criteria andDdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dd_id >=", value, "ddId");
            return (Criteria) this;
        }

        public Criteria andDdIdLessThan(Integer value) {
            addCriterion("dd_id <", value, "ddId");
            return (Criteria) this;
        }

        public Criteria andDdIdLessThanOrEqualTo(Integer value) {
            addCriterion("dd_id <=", value, "ddId");
            return (Criteria) this;
        }

        public Criteria andDdIdIn(List<Integer> values) {
            addCriterion("dd_id in", values, "ddId");
            return (Criteria) this;
        }

        public Criteria andDdIdNotIn(List<Integer> values) {
            addCriterion("dd_id not in", values, "ddId");
            return (Criteria) this;
        }

        public Criteria andDdIdBetween(Integer value1, Integer value2) {
            addCriterion("dd_id between", value1, value2, "ddId");
            return (Criteria) this;
        }

        public Criteria andDdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dd_id not between", value1, value2, "ddId");
            return (Criteria) this;
        }

        public Criteria andMqddIsNull() {
            addCriterion("mqdd is null");
            return (Criteria) this;
        }

        public Criteria andMqddIsNotNull() {
            addCriterion("mqdd is not null");
            return (Criteria) this;
        }

        public Criteria andMqddEqualTo(String value) {
            addCriterion("mqdd =", value, "mqdd");
            return (Criteria) this;
        }

        public Criteria andMqddNotEqualTo(String value) {
            addCriterion("mqdd <>", value, "mqdd");
            return (Criteria) this;
        }

        public Criteria andMqddGreaterThan(String value) {
            addCriterion("mqdd >", value, "mqdd");
            return (Criteria) this;
        }

        public Criteria andMqddGreaterThanOrEqualTo(String value) {
            addCriterion("mqdd >=", value, "mqdd");
            return (Criteria) this;
        }

        public Criteria andMqddLessThan(String value) {
            addCriterion("mqdd <", value, "mqdd");
            return (Criteria) this;
        }

        public Criteria andMqddLessThanOrEqualTo(String value) {
            addCriterion("mqdd <=", value, "mqdd");
            return (Criteria) this;
        }

        public Criteria andMqddLike(String value) {
            addCriterion("mqdd like", value, "mqdd");
            return (Criteria) this;
        }

        public Criteria andMqddNotLike(String value) {
            addCriterion("mqdd not like", value, "mqdd");
            return (Criteria) this;
        }

        public Criteria andMqddIn(List<String> values) {
            addCriterion("mqdd in", values, "mqdd");
            return (Criteria) this;
        }

        public Criteria andMqddNotIn(List<String> values) {
            addCriterion("mqdd not in", values, "mqdd");
            return (Criteria) this;
        }

        public Criteria andMqddBetween(String value1, String value2) {
            addCriterion("mqdd between", value1, value2, "mqdd");
            return (Criteria) this;
        }

        public Criteria andMqddNotBetween(String value1, String value2) {
            addCriterion("mqdd not between", value1, value2, "mqdd");
            return (Criteria) this;
        }

        public Criteria andMddIsNull() {
            addCriterion("mdd is null");
            return (Criteria) this;
        }

        public Criteria andMddIsNotNull() {
            addCriterion("mdd is not null");
            return (Criteria) this;
        }

        public Criteria andMddEqualTo(String value) {
            addCriterion("mdd =", value, "mdd");
            return (Criteria) this;
        }

        public Criteria andMddNotEqualTo(String value) {
            addCriterion("mdd <>", value, "mdd");
            return (Criteria) this;
        }

        public Criteria andMddGreaterThan(String value) {
            addCriterion("mdd >", value, "mdd");
            return (Criteria) this;
        }

        public Criteria andMddGreaterThanOrEqualTo(String value) {
            addCriterion("mdd >=", value, "mdd");
            return (Criteria) this;
        }

        public Criteria andMddLessThan(String value) {
            addCriterion("mdd <", value, "mdd");
            return (Criteria) this;
        }

        public Criteria andMddLessThanOrEqualTo(String value) {
            addCriterion("mdd <=", value, "mdd");
            return (Criteria) this;
        }

        public Criteria andMddLike(String value) {
            addCriterion("mdd like", value, "mdd");
            return (Criteria) this;
        }

        public Criteria andMddNotLike(String value) {
            addCriterion("mdd not like", value, "mdd");
            return (Criteria) this;
        }

        public Criteria andMddIn(List<String> values) {
            addCriterion("mdd in", values, "mdd");
            return (Criteria) this;
        }

        public Criteria andMddNotIn(List<String> values) {
            addCriterion("mdd not in", values, "mdd");
            return (Criteria) this;
        }

        public Criteria andMddBetween(String value1, String value2) {
            addCriterion("mdd between", value1, value2, "mdd");
            return (Criteria) this;
        }

        public Criteria andMddNotBetween(String value1, String value2) {
            addCriterion("mdd not between", value1, value2, "mdd");
            return (Criteria) this;
        }

        public Criteria andYwyIsNull() {
            addCriterion("ywy is null");
            return (Criteria) this;
        }

        public Criteria andYwyIsNotNull() {
            addCriterion("ywy is not null");
            return (Criteria) this;
        }

        public Criteria andYwyEqualTo(String value) {
            addCriterion("ywy =", value, "ywy");
            return (Criteria) this;
        }

        public Criteria andYwyNotEqualTo(String value) {
            addCriterion("ywy <>", value, "ywy");
            return (Criteria) this;
        }

        public Criteria andYwyGreaterThan(String value) {
            addCriterion("ywy >", value, "ywy");
            return (Criteria) this;
        }

        public Criteria andYwyGreaterThanOrEqualTo(String value) {
            addCriterion("ywy >=", value, "ywy");
            return (Criteria) this;
        }

        public Criteria andYwyLessThan(String value) {
            addCriterion("ywy <", value, "ywy");
            return (Criteria) this;
        }

        public Criteria andYwyLessThanOrEqualTo(String value) {
            addCriterion("ywy <=", value, "ywy");
            return (Criteria) this;
        }

        public Criteria andYwyLike(String value) {
            addCriterion("ywy like", value, "ywy");
            return (Criteria) this;
        }

        public Criteria andYwyNotLike(String value) {
            addCriterion("ywy not like", value, "ywy");
            return (Criteria) this;
        }

        public Criteria andYwyIn(List<String> values) {
            addCriterion("ywy in", values, "ywy");
            return (Criteria) this;
        }

        public Criteria andYwyNotIn(List<String> values) {
            addCriterion("ywy not in", values, "ywy");
            return (Criteria) this;
        }

        public Criteria andYwyBetween(String value1, String value2) {
            addCriterion("ywy between", value1, value2, "ywy");
            return (Criteria) this;
        }

        public Criteria andYwyNotBetween(String value1, String value2) {
            addCriterion("ywy not between", value1, value2, "ywy");
            return (Criteria) this;
        }

        public Criteria andLxModeIsNull() {
            addCriterion("lx_mode is null");
            return (Criteria) this;
        }

        public Criteria andLxModeIsNotNull() {
            addCriterion("lx_mode is not null");
            return (Criteria) this;
        }

        public Criteria andLxModeEqualTo(String value) {
            addCriterion("lx_mode =", value, "lxMode");
            return (Criteria) this;
        }

        public Criteria andLxModeNotEqualTo(String value) {
            addCriterion("lx_mode <>", value, "lxMode");
            return (Criteria) this;
        }

        public Criteria andLxModeGreaterThan(String value) {
            addCriterion("lx_mode >", value, "lxMode");
            return (Criteria) this;
        }

        public Criteria andLxModeGreaterThanOrEqualTo(String value) {
            addCriterion("lx_mode >=", value, "lxMode");
            return (Criteria) this;
        }

        public Criteria andLxModeLessThan(String value) {
            addCriterion("lx_mode <", value, "lxMode");
            return (Criteria) this;
        }

        public Criteria andLxModeLessThanOrEqualTo(String value) {
            addCriterion("lx_mode <=", value, "lxMode");
            return (Criteria) this;
        }

        public Criteria andLxModeLike(String value) {
            addCriterion("lx_mode like", value, "lxMode");
            return (Criteria) this;
        }

        public Criteria andLxModeNotLike(String value) {
            addCriterion("lx_mode not like", value, "lxMode");
            return (Criteria) this;
        }

        public Criteria andLxModeIn(List<String> values) {
            addCriterion("lx_mode in", values, "lxMode");
            return (Criteria) this;
        }

        public Criteria andLxModeNotIn(List<String> values) {
            addCriterion("lx_mode not in", values, "lxMode");
            return (Criteria) this;
        }

        public Criteria andLxModeBetween(String value1, String value2) {
            addCriterion("lx_mode between", value1, value2, "lxMode");
            return (Criteria) this;
        }

        public Criteria andLxModeNotBetween(String value1, String value2) {
            addCriterion("lx_mode not between", value1, value2, "lxMode");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_mall_flow
     *
     * @mbggenerated do_not_delete_during_merge Mon Jan 29 10:55:34 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_mall_flow
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value) {
            super();
            this.condition = condition;
            this.value = value;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.betweenValue = true;
        }
    }
}