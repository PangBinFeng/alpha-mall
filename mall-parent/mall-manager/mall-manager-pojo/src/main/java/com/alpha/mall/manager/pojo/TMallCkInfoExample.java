package com.alpha.mall.manager.pojo;

import java.util.ArrayList;
import java.util.List;

public class TMallCkInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_mall_ck_info
     *
     * @mbggenerated Thu Jan 25 17:08:30 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_mall_ck_info
     *
     * @mbggenerated Thu Jan 25 17:08:30 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_mall_ck_info
     *
     * @mbggenerated Thu Jan 25 17:08:30 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_ck_info
     *
     * @mbggenerated Thu Jan 25 17:08:30 CST 2018
     */
    public TMallCkInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_ck_info
     *
     * @mbggenerated Thu Jan 25 17:08:30 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_ck_info
     *
     * @mbggenerated Thu Jan 25 17:08:30 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_ck_info
     *
     * @mbggenerated Thu Jan 25 17:08:30 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_ck_info
     *
     * @mbggenerated Thu Jan 25 17:08:30 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_ck_info
     *
     * @mbggenerated Thu Jan 25 17:08:30 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_ck_info
     *
     * @mbggenerated Thu Jan 25 17:08:30 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_ck_info
     *
     * @mbggenerated Thu Jan 25 17:08:30 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_ck_info
     *
     * @mbggenerated Thu Jan 25 17:08:30 CST 2018
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
     * This method corresponds to the database table t_mall_ck_info
     *
     * @mbggenerated Thu Jan 25 17:08:30 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_ck_info
     *
     * @mbggenerated Thu Jan 25 17:08:30 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_mall_ck_info
     *
     * @mbggenerated Thu Jan 25 17:08:30 CST 2018
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
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCkMchIsNull() {
            addCriterion("ck_mch is null");
            return (Criteria) this;
        }

        public Criteria andCkMchIsNotNull() {
            addCriterion("ck_mch is not null");
            return (Criteria) this;
        }

        public Criteria andCkMchEqualTo(String value) {
            addCriterion("ck_mch =", value, "ckMch");
            return (Criteria) this;
        }

        public Criteria andCkMchNotEqualTo(String value) {
            addCriterion("ck_mch <>", value, "ckMch");
            return (Criteria) this;
        }

        public Criteria andCkMchGreaterThan(String value) {
            addCriterion("ck_mch >", value, "ckMch");
            return (Criteria) this;
        }

        public Criteria andCkMchGreaterThanOrEqualTo(String value) {
            addCriterion("ck_mch >=", value, "ckMch");
            return (Criteria) this;
        }

        public Criteria andCkMchLessThan(String value) {
            addCriterion("ck_mch <", value, "ckMch");
            return (Criteria) this;
        }

        public Criteria andCkMchLessThanOrEqualTo(String value) {
            addCriterion("ck_mch <=", value, "ckMch");
            return (Criteria) this;
        }

        public Criteria andCkMchLike(String value) {
            addCriterion("ck_mch like", value, "ckMch");
            return (Criteria) this;
        }

        public Criteria andCkMchNotLike(String value) {
            addCriterion("ck_mch not like", value, "ckMch");
            return (Criteria) this;
        }

        public Criteria andCkMchIn(List<String> values) {
            addCriterion("ck_mch in", values, "ckMch");
            return (Criteria) this;
        }

        public Criteria andCkMchNotIn(List<String> values) {
            addCriterion("ck_mch not in", values, "ckMch");
            return (Criteria) this;
        }

        public Criteria andCkMchBetween(String value1, String value2) {
            addCriterion("ck_mch between", value1, value2, "ckMch");
            return (Criteria) this;
        }

        public Criteria andCkMchNotBetween(String value1, String value2) {
            addCriterion("ck_mch not between", value1, value2, "ckMch");
            return (Criteria) this;
        }

        public Criteria andCkDzIsNull() {
            addCriterion("ck_dz is null");
            return (Criteria) this;
        }

        public Criteria andCkDzIsNotNull() {
            addCriterion("ck_dz is not null");
            return (Criteria) this;
        }

        public Criteria andCkDzEqualTo(String value) {
            addCriterion("ck_dz =", value, "ckDz");
            return (Criteria) this;
        }

        public Criteria andCkDzNotEqualTo(String value) {
            addCriterion("ck_dz <>", value, "ckDz");
            return (Criteria) this;
        }

        public Criteria andCkDzGreaterThan(String value) {
            addCriterion("ck_dz >", value, "ckDz");
            return (Criteria) this;
        }

        public Criteria andCkDzGreaterThanOrEqualTo(String value) {
            addCriterion("ck_dz >=", value, "ckDz");
            return (Criteria) this;
        }

        public Criteria andCkDzLessThan(String value) {
            addCriterion("ck_dz <", value, "ckDz");
            return (Criteria) this;
        }

        public Criteria andCkDzLessThanOrEqualTo(String value) {
            addCriterion("ck_dz <=", value, "ckDz");
            return (Criteria) this;
        }

        public Criteria andCkDzLike(String value) {
            addCriterion("ck_dz like", value, "ckDz");
            return (Criteria) this;
        }

        public Criteria andCkDzNotLike(String value) {
            addCriterion("ck_dz not like", value, "ckDz");
            return (Criteria) this;
        }

        public Criteria andCkDzIn(List<String> values) {
            addCriterion("ck_dz in", values, "ckDz");
            return (Criteria) this;
        }

        public Criteria andCkDzNotIn(List<String> values) {
            addCriterion("ck_dz not in", values, "ckDz");
            return (Criteria) this;
        }

        public Criteria andCkDzBetween(String value1, String value2) {
            addCriterion("ck_dz between", value1, value2, "ckDz");
            return (Criteria) this;
        }

        public Criteria andCkDzNotBetween(String value1, String value2) {
            addCriterion("ck_dz not between", value1, value2, "ckDz");
            return (Criteria) this;
        }

        public Criteria andCkLxIsNull() {
            addCriterion("ck_lx is null");
            return (Criteria) this;
        }

        public Criteria andCkLxIsNotNull() {
            addCriterion("ck_lx is not null");
            return (Criteria) this;
        }

        public Criteria andCkLxEqualTo(String value) {
            addCriterion("ck_lx =", value, "ckLx");
            return (Criteria) this;
        }

        public Criteria andCkLxNotEqualTo(String value) {
            addCriterion("ck_lx <>", value, "ckLx");
            return (Criteria) this;
        }

        public Criteria andCkLxGreaterThan(String value) {
            addCriterion("ck_lx >", value, "ckLx");
            return (Criteria) this;
        }

        public Criteria andCkLxGreaterThanOrEqualTo(String value) {
            addCriterion("ck_lx >=", value, "ckLx");
            return (Criteria) this;
        }

        public Criteria andCkLxLessThan(String value) {
            addCriterion("ck_lx <", value, "ckLx");
            return (Criteria) this;
        }

        public Criteria andCkLxLessThanOrEqualTo(String value) {
            addCriterion("ck_lx <=", value, "ckLx");
            return (Criteria) this;
        }

        public Criteria andCkLxLike(String value) {
            addCriterion("ck_lx like", value, "ckLx");
            return (Criteria) this;
        }

        public Criteria andCkLxNotLike(String value) {
            addCriterion("ck_lx not like", value, "ckLx");
            return (Criteria) this;
        }

        public Criteria andCkLxIn(List<String> values) {
            addCriterion("ck_lx in", values, "ckLx");
            return (Criteria) this;
        }

        public Criteria andCkLxNotIn(List<String> values) {
            addCriterion("ck_lx not in", values, "ckLx");
            return (Criteria) this;
        }

        public Criteria andCkLxBetween(String value1, String value2) {
            addCriterion("ck_lx between", value1, value2, "ckLx");
            return (Criteria) this;
        }

        public Criteria andCkLxNotBetween(String value1, String value2) {
            addCriterion("ck_lx not between", value1, value2, "ckLx");
            return (Criteria) this;
        }

        public Criteria andCkMjIsNull() {
            addCriterion("ck_mj is null");
            return (Criteria) this;
        }

        public Criteria andCkMjIsNotNull() {
            addCriterion("ck_mj is not null");
            return (Criteria) this;
        }

        public Criteria andCkMjEqualTo(Double value) {
            addCriterion("ck_mj =", value, "ckMj");
            return (Criteria) this;
        }

        public Criteria andCkMjNotEqualTo(Double value) {
            addCriterion("ck_mj <>", value, "ckMj");
            return (Criteria) this;
        }

        public Criteria andCkMjGreaterThan(Double value) {
            addCriterion("ck_mj >", value, "ckMj");
            return (Criteria) this;
        }

        public Criteria andCkMjGreaterThanOrEqualTo(Double value) {
            addCriterion("ck_mj >=", value, "ckMj");
            return (Criteria) this;
        }

        public Criteria andCkMjLessThan(Double value) {
            addCriterion("ck_mj <", value, "ckMj");
            return (Criteria) this;
        }

        public Criteria andCkMjLessThanOrEqualTo(Double value) {
            addCriterion("ck_mj <=", value, "ckMj");
            return (Criteria) this;
        }

        public Criteria andCkMjIn(List<Double> values) {
            addCriterion("ck_mj in", values, "ckMj");
            return (Criteria) this;
        }

        public Criteria andCkMjNotIn(List<Double> values) {
            addCriterion("ck_mj not in", values, "ckMj");
            return (Criteria) this;
        }

        public Criteria andCkMjBetween(Double value1, Double value2) {
            addCriterion("ck_mj between", value1, value2, "ckMj");
            return (Criteria) this;
        }

        public Criteria andCkMjNotBetween(Double value1, Double value2) {
            addCriterion("ck_mj not between", value1, value2, "ckMj");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_mall_ck_info
     *
     * @mbggenerated do_not_delete_during_merge Thu Jan 25 17:08:30 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_mall_ck_info
     *
     * @mbggenerated Thu Jan 25 17:08:30 CST 2018
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