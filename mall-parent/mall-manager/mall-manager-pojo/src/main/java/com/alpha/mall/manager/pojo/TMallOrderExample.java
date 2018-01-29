package com.alpha.mall.manager.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TMallOrderExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_mall_order
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_mall_order
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_mall_order
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_order
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public TMallOrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_order
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_order
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_order
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_order
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_order
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_order
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_order
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
     * This method corresponds to the database table t_mall_order
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
     * This method corresponds to the database table t_mall_order
     *
     * @mbggenerated Mon Jan 29 10:55:34 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mall_order
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
     * This class corresponds to the database table t_mall_order
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

        public Criteria andShhrIsNull() {
            addCriterion("shhr is null");
            return (Criteria) this;
        }

        public Criteria andShhrIsNotNull() {
            addCriterion("shhr is not null");
            return (Criteria) this;
        }

        public Criteria andShhrEqualTo(String value) {
            addCriterion("shhr =", value, "shhr");
            return (Criteria) this;
        }

        public Criteria andShhrNotEqualTo(String value) {
            addCriterion("shhr <>", value, "shhr");
            return (Criteria) this;
        }

        public Criteria andShhrGreaterThan(String value) {
            addCriterion("shhr >", value, "shhr");
            return (Criteria) this;
        }

        public Criteria andShhrGreaterThanOrEqualTo(String value) {
            addCriterion("shhr >=", value, "shhr");
            return (Criteria) this;
        }

        public Criteria andShhrLessThan(String value) {
            addCriterion("shhr <", value, "shhr");
            return (Criteria) this;
        }

        public Criteria andShhrLessThanOrEqualTo(String value) {
            addCriterion("shhr <=", value, "shhr");
            return (Criteria) this;
        }

        public Criteria andShhrLike(String value) {
            addCriterion("shhr like", value, "shhr");
            return (Criteria) this;
        }

        public Criteria andShhrNotLike(String value) {
            addCriterion("shhr not like", value, "shhr");
            return (Criteria) this;
        }

        public Criteria andShhrIn(List<String> values) {
            addCriterion("shhr in", values, "shhr");
            return (Criteria) this;
        }

        public Criteria andShhrNotIn(List<String> values) {
            addCriterion("shhr not in", values, "shhr");
            return (Criteria) this;
        }

        public Criteria andShhrBetween(String value1, String value2) {
            addCriterion("shhr between", value1, value2, "shhr");
            return (Criteria) this;
        }

        public Criteria andShhrNotBetween(String value1, String value2) {
            addCriterion("shhr not between", value1, value2, "shhr");
            return (Criteria) this;
        }

        public Criteria andZjeIsNull() {
            addCriterion("zje is null");
            return (Criteria) this;
        }

        public Criteria andZjeIsNotNull() {
            addCriterion("zje is not null");
            return (Criteria) this;
        }

        public Criteria andZjeEqualTo(Short value) {
            addCriterion("zje =", value, "zje");
            return (Criteria) this;
        }

        public Criteria andZjeNotEqualTo(Short value) {
            addCriterion("zje <>", value, "zje");
            return (Criteria) this;
        }

        public Criteria andZjeGreaterThan(Short value) {
            addCriterion("zje >", value, "zje");
            return (Criteria) this;
        }

        public Criteria andZjeGreaterThanOrEqualTo(Short value) {
            addCriterion("zje >=", value, "zje");
            return (Criteria) this;
        }

        public Criteria andZjeLessThan(Short value) {
            addCriterion("zje <", value, "zje");
            return (Criteria) this;
        }

        public Criteria andZjeLessThanOrEqualTo(Short value) {
            addCriterion("zje <=", value, "zje");
            return (Criteria) this;
        }

        public Criteria andZjeIn(List<Short> values) {
            addCriterion("zje in", values, "zje");
            return (Criteria) this;
        }

        public Criteria andZjeNotIn(List<Short> values) {
            addCriterion("zje not in", values, "zje");
            return (Criteria) this;
        }

        public Criteria andZjeBetween(Short value1, Short value2) {
            addCriterion("zje between", value1, value2, "zje");
            return (Criteria) this;
        }

        public Criteria andZjeNotBetween(Short value1, Short value2) {
            addCriterion("zje not between", value1, value2, "zje");
            return (Criteria) this;
        }

        public Criteria andJdhIsNull() {
            addCriterion("jdh is null");
            return (Criteria) this;
        }

        public Criteria andJdhIsNotNull() {
            addCriterion("jdh is not null");
            return (Criteria) this;
        }

        public Criteria andJdhEqualTo(Integer value) {
            addCriterion("jdh =", value, "jdh");
            return (Criteria) this;
        }

        public Criteria andJdhNotEqualTo(Integer value) {
            addCriterion("jdh <>", value, "jdh");
            return (Criteria) this;
        }

        public Criteria andJdhGreaterThan(Integer value) {
            addCriterion("jdh >", value, "jdh");
            return (Criteria) this;
        }

        public Criteria andJdhGreaterThanOrEqualTo(Integer value) {
            addCriterion("jdh >=", value, "jdh");
            return (Criteria) this;
        }

        public Criteria andJdhLessThan(Integer value) {
            addCriterion("jdh <", value, "jdh");
            return (Criteria) this;
        }

        public Criteria andJdhLessThanOrEqualTo(Integer value) {
            addCriterion("jdh <=", value, "jdh");
            return (Criteria) this;
        }

        public Criteria andJdhIn(List<Integer> values) {
            addCriterion("jdh in", values, "jdh");
            return (Criteria) this;
        }

        public Criteria andJdhNotIn(List<Integer> values) {
            addCriterion("jdh not in", values, "jdh");
            return (Criteria) this;
        }

        public Criteria andJdhBetween(Integer value1, Integer value2) {
            addCriterion("jdh between", value1, value2, "jdh");
            return (Criteria) this;
        }

        public Criteria andJdhNotBetween(Integer value1, Integer value2) {
            addCriterion("jdh not between", value1, value2, "jdh");
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

        public Criteria andYjsdTimeIsNull() {
            addCriterion("yjsd_time is null");
            return (Criteria) this;
        }

        public Criteria andYjsdTimeIsNotNull() {
            addCriterion("yjsd_time is not null");
            return (Criteria) this;
        }

        public Criteria andYjsdTimeEqualTo(Date value) {
            addCriterion("yjsd_time =", value, "yjsdTime");
            return (Criteria) this;
        }

        public Criteria andYjsdTimeNotEqualTo(Date value) {
            addCriterion("yjsd_time <>", value, "yjsdTime");
            return (Criteria) this;
        }

        public Criteria andYjsdTimeGreaterThan(Date value) {
            addCriterion("yjsd_time >", value, "yjsdTime");
            return (Criteria) this;
        }

        public Criteria andYjsdTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("yjsd_time >=", value, "yjsdTime");
            return (Criteria) this;
        }

        public Criteria andYjsdTimeLessThan(Date value) {
            addCriterion("yjsd_time <", value, "yjsdTime");
            return (Criteria) this;
        }

        public Criteria andYjsdTimeLessThanOrEqualTo(Date value) {
            addCriterion("yjsd_time <=", value, "yjsdTime");
            return (Criteria) this;
        }

        public Criteria andYjsdTimeIn(List<Date> values) {
            addCriterion("yjsd_time in", values, "yjsdTime");
            return (Criteria) this;
        }

        public Criteria andYjsdTimeNotIn(List<Date> values) {
            addCriterion("yjsd_time not in", values, "yjsdTime");
            return (Criteria) this;
        }

        public Criteria andYjsdTimeBetween(Date value1, Date value2) {
            addCriterion("yjsd_time between", value1, value2, "yjsdTime");
            return (Criteria) this;
        }

        public Criteria andYjsdTimeNotBetween(Date value1, Date value2) {
            addCriterion("yjsd_time not between", value1, value2, "yjsdTime");
            return (Criteria) this;
        }

        public Criteria andDzhIdIsNull() {
            addCriterion("dzh_id is null");
            return (Criteria) this;
        }

        public Criteria andDzhIdIsNotNull() {
            addCriterion("dzh_id is not null");
            return (Criteria) this;
        }

        public Criteria andDzhIdEqualTo(Integer value) {
            addCriterion("dzh_id =", value, "dzhId");
            return (Criteria) this;
        }

        public Criteria andDzhIdNotEqualTo(Integer value) {
            addCriterion("dzh_id <>", value, "dzhId");
            return (Criteria) this;
        }

        public Criteria andDzhIdGreaterThan(Integer value) {
            addCriterion("dzh_id >", value, "dzhId");
            return (Criteria) this;
        }

        public Criteria andDzhIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dzh_id >=", value, "dzhId");
            return (Criteria) this;
        }

        public Criteria andDzhIdLessThan(Integer value) {
            addCriterion("dzh_id <", value, "dzhId");
            return (Criteria) this;
        }

        public Criteria andDzhIdLessThanOrEqualTo(Integer value) {
            addCriterion("dzh_id <=", value, "dzhId");
            return (Criteria) this;
        }

        public Criteria andDzhIdIn(List<Integer> values) {
            addCriterion("dzh_id in", values, "dzhId");
            return (Criteria) this;
        }

        public Criteria andDzhIdNotIn(List<Integer> values) {
            addCriterion("dzh_id not in", values, "dzhId");
            return (Criteria) this;
        }

        public Criteria andDzhIdBetween(Integer value1, Integer value2) {
            addCriterion("dzh_id between", value1, value2, "dzhId");
            return (Criteria) this;
        }

        public Criteria andDzhIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dzh_id not between", value1, value2, "dzhId");
            return (Criteria) this;
        }

        public Criteria andDzhNameIsNull() {
            addCriterion("dzh_name is null");
            return (Criteria) this;
        }

        public Criteria andDzhNameIsNotNull() {
            addCriterion("dzh_name is not null");
            return (Criteria) this;
        }

        public Criteria andDzhNameEqualTo(String value) {
            addCriterion("dzh_name =", value, "dzhName");
            return (Criteria) this;
        }

        public Criteria andDzhNameNotEqualTo(String value) {
            addCriterion("dzh_name <>", value, "dzhName");
            return (Criteria) this;
        }

        public Criteria andDzhNameGreaterThan(String value) {
            addCriterion("dzh_name >", value, "dzhName");
            return (Criteria) this;
        }

        public Criteria andDzhNameGreaterThanOrEqualTo(String value) {
            addCriterion("dzh_name >=", value, "dzhName");
            return (Criteria) this;
        }

        public Criteria andDzhNameLessThan(String value) {
            addCriterion("dzh_name <", value, "dzhName");
            return (Criteria) this;
        }

        public Criteria andDzhNameLessThanOrEqualTo(String value) {
            addCriterion("dzh_name <=", value, "dzhName");
            return (Criteria) this;
        }

        public Criteria andDzhNameLike(String value) {
            addCriterion("dzh_name like", value, "dzhName");
            return (Criteria) this;
        }

        public Criteria andDzhNameNotLike(String value) {
            addCriterion("dzh_name not like", value, "dzhName");
            return (Criteria) this;
        }

        public Criteria andDzhNameIn(List<String> values) {
            addCriterion("dzh_name in", values, "dzhName");
            return (Criteria) this;
        }

        public Criteria andDzhNameNotIn(List<String> values) {
            addCriterion("dzh_name not in", values, "dzhName");
            return (Criteria) this;
        }

        public Criteria andDzhNameBetween(String value1, String value2) {
            addCriterion("dzh_name between", value1, value2, "dzhName");
            return (Criteria) this;
        }

        public Criteria andDzhNameNotBetween(String value1, String value2) {
            addCriterion("dzh_name not between", value1, value2, "dzhName");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_mall_order
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
     * This class corresponds to the database table t_mall_order
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