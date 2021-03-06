package com.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EssayExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table essay
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table essay
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table essay
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table essay
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    public EssayExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table essay
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table essay
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table essay
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table essay
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table essay
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table essay
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table essay
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table essay
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
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
     * This method corresponds to the database table essay
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table essay
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table essay
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
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

        public List<Criterion> getAllCriteria() {
            return criteria;
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

        public Criteria andEidIsNull() {
            addCriterion("eid is null");
            return (Criteria) this;
        }

        public Criteria andEidIsNotNull() {
            addCriterion("eid is not null");
            return (Criteria) this;
        }

        public Criteria andEidEqualTo(Integer value) {
            addCriterion("eid =", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotEqualTo(Integer value) {
            addCriterion("eid <>", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThan(Integer value) {
            addCriterion("eid >", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThanOrEqualTo(Integer value) {
            addCriterion("eid >=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThan(Integer value) {
            addCriterion("eid <", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThanOrEqualTo(Integer value) {
            addCriterion("eid <=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidIn(List<Integer> values) {
            addCriterion("eid in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotIn(List<Integer> values) {
            addCriterion("eid not in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidBetween(Integer value1, Integer value2) {
            addCriterion("eid between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotBetween(Integer value1, Integer value2) {
            addCriterion("eid not between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andEnameIsNull() {
            addCriterion("ename is null");
            return (Criteria) this;
        }

        public Criteria andEnameIsNotNull() {
            addCriterion("ename is not null");
            return (Criteria) this;
        }

        public Criteria andEnameEqualTo(String value) {
            addCriterion("ename =", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotEqualTo(String value) {
            addCriterion("ename <>", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameGreaterThan(String value) {
            addCriterion("ename >", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameGreaterThanOrEqualTo(String value) {
            addCriterion("ename >=", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLessThan(String value) {
            addCriterion("ename <", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLessThanOrEqualTo(String value) {
            addCriterion("ename <=", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLike(String value) {
            addCriterion("ename like", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotLike(String value) {
            addCriterion("ename not like", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameIn(List<String> values) {
            addCriterion("ename in", values, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotIn(List<String> values) {
            addCriterion("ename not in", values, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameBetween(String value1, String value2) {
            addCriterion("ename between", value1, value2, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotBetween(String value1, String value2) {
            addCriterion("ename not between", value1, value2, "ename");
            return (Criteria) this;
        }

        public Criteria andEclassIdIsNull() {
            addCriterion("eclass_id is null");
            return (Criteria) this;
        }

        public Criteria andEclassIdIsNotNull() {
            addCriterion("eclass_id is not null");
            return (Criteria) this;
        }

        public Criteria andEclassIdEqualTo(Integer value) {
            addCriterion("eclass_id =", value, "eclassId");
            return (Criteria) this;
        }

        public Criteria andEclassIdNotEqualTo(Integer value) {
            addCriterion("eclass_id <>", value, "eclassId");
            return (Criteria) this;
        }

        public Criteria andEclassIdGreaterThan(Integer value) {
            addCriterion("eclass_id >", value, "eclassId");
            return (Criteria) this;
        }

        public Criteria andEclassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("eclass_id >=", value, "eclassId");
            return (Criteria) this;
        }

        public Criteria andEclassIdLessThan(Integer value) {
            addCriterion("eclass_id <", value, "eclassId");
            return (Criteria) this;
        }

        public Criteria andEclassIdLessThanOrEqualTo(Integer value) {
            addCriterion("eclass_id <=", value, "eclassId");
            return (Criteria) this;
        }

        public Criteria andEclassIdIn(List<Integer> values) {
            addCriterion("eclass_id in", values, "eclassId");
            return (Criteria) this;
        }

        public Criteria andEclassIdNotIn(List<Integer> values) {
            addCriterion("eclass_id not in", values, "eclassId");
            return (Criteria) this;
        }

        public Criteria andEclassIdBetween(Integer value1, Integer value2) {
            addCriterion("eclass_id between", value1, value2, "eclassId");
            return (Criteria) this;
        }

        public Criteria andEclassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("eclass_id not between", value1, value2, "eclassId");
            return (Criteria) this;
        }

        public Criteria andCTimeIsNull() {
            addCriterion("c_time is null");
            return (Criteria) this;
        }

        public Criteria andCTimeIsNotNull() {
            addCriterion("c_time is not null");
            return (Criteria) this;
        }

        public Criteria andCTimeEqualTo(Date value) {
            addCriterion("c_time =", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeNotEqualTo(Date value) {
            addCriterion("c_time <>", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeGreaterThan(Date value) {
            addCriterion("c_time >", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("c_time >=", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeLessThan(Date value) {
            addCriterion("c_time <", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeLessThanOrEqualTo(Date value) {
            addCriterion("c_time <=", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeIn(List<Date> values) {
            addCriterion("c_time in", values, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeNotIn(List<Date> values) {
            addCriterion("c_time not in", values, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeBetween(Date value1, Date value2) {
            addCriterion("c_time between", value1, value2, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeNotBetween(Date value1, Date value2) {
            addCriterion("c_time not between", value1, value2, "cTime");
            return (Criteria) this;
        }

        public Criteria andModifiedIsNull() {
            addCriterion("modified is null");
            return (Criteria) this;
        }

        public Criteria andModifiedIsNotNull() {
            addCriterion("modified is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedEqualTo(Integer value) {
            addCriterion("modified =", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotEqualTo(Integer value) {
            addCriterion("modified <>", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedGreaterThan(Integer value) {
            addCriterion("modified >", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedGreaterThanOrEqualTo(Integer value) {
            addCriterion("modified >=", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedLessThan(Integer value) {
            addCriterion("modified <", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedLessThanOrEqualTo(Integer value) {
            addCriterion("modified <=", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedIn(List<Integer> values) {
            addCriterion("modified in", values, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotIn(List<Integer> values) {
            addCriterion("modified not in", values, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedBetween(Integer value1, Integer value2) {
            addCriterion("modified between", value1, value2, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotBetween(Integer value1, Integer value2) {
            addCriterion("modified not between", value1, value2, "modified");
            return (Criteria) this;
        }

        public Criteria andEScoreIsNull() {
            addCriterion("e_score is null");
            return (Criteria) this;
        }

        public Criteria andEScoreIsNotNull() {
            addCriterion("e_score is not null");
            return (Criteria) this;
        }

        public Criteria andEScoreEqualTo(Integer value) {
            addCriterion("e_score =", value, "eScore");
            return (Criteria) this;
        }

        public Criteria andEScoreNotEqualTo(Integer value) {
            addCriterion("e_score <>", value, "eScore");
            return (Criteria) this;
        }

        public Criteria andEScoreGreaterThan(Integer value) {
            addCriterion("e_score >", value, "eScore");
            return (Criteria) this;
        }

        public Criteria andEScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("e_score >=", value, "eScore");
            return (Criteria) this;
        }

        public Criteria andEScoreLessThan(Integer value) {
            addCriterion("e_score <", value, "eScore");
            return (Criteria) this;
        }

        public Criteria andEScoreLessThanOrEqualTo(Integer value) {
            addCriterion("e_score <=", value, "eScore");
            return (Criteria) this;
        }

        public Criteria andEScoreIn(List<Integer> values) {
            addCriterion("e_score in", values, "eScore");
            return (Criteria) this;
        }

        public Criteria andEScoreNotIn(List<Integer> values) {
            addCriterion("e_score not in", values, "eScore");
            return (Criteria) this;
        }

        public Criteria andEScoreBetween(Integer value1, Integer value2) {
            addCriterion("e_score between", value1, value2, "eScore");
            return (Criteria) this;
        }

        public Criteria andEScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("e_score not between", value1, value2, "eScore");
            return (Criteria) this;
        }

        public Criteria andPublishIsNull() {
            addCriterion("publish is null");
            return (Criteria) this;
        }

        public Criteria andPublishIsNotNull() {
            addCriterion("publish is not null");
            return (Criteria) this;
        }

        public Criteria andPublishEqualTo(Date value) {
            addCriterion("publish =", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishNotEqualTo(Date value) {
            addCriterion("publish <>", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishGreaterThan(Date value) {
            addCriterion("publish >", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishGreaterThanOrEqualTo(Date value) {
            addCriterion("publish >=", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishLessThan(Date value) {
            addCriterion("publish <", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishLessThanOrEqualTo(Date value) {
            addCriterion("publish <=", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishIn(List<Date> values) {
            addCriterion("publish in", values, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishNotIn(List<Date> values) {
            addCriterion("publish not in", values, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishBetween(Date value1, Date value2) {
            addCriterion("publish between", value1, value2, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishNotBetween(Date value1, Date value2) {
            addCriterion("publish not between", value1, value2, "publish");
            return (Criteria) this;
        }

        public Criteria andWriterIdIsNull() {
            addCriterion("writer_id is null");
            return (Criteria) this;
        }

        public Criteria andWriterIdIsNotNull() {
            addCriterion("writer_id is not null");
            return (Criteria) this;
        }

        public Criteria andWriterIdEqualTo(Integer value) {
            addCriterion("writer_id =", value, "writerId");
            return (Criteria) this;
        }

        public Criteria andWriterIdNotEqualTo(Integer value) {
            addCriterion("writer_id <>", value, "writerId");
            return (Criteria) this;
        }

        public Criteria andWriterIdGreaterThan(Integer value) {
            addCriterion("writer_id >", value, "writerId");
            return (Criteria) this;
        }

        public Criteria andWriterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("writer_id >=", value, "writerId");
            return (Criteria) this;
        }

        public Criteria andWriterIdLessThan(Integer value) {
            addCriterion("writer_id <", value, "writerId");
            return (Criteria) this;
        }

        public Criteria andWriterIdLessThanOrEqualTo(Integer value) {
            addCriterion("writer_id <=", value, "writerId");
            return (Criteria) this;
        }

        public Criteria andWriterIdIn(List<Integer> values) {
            addCriterion("writer_id in", values, "writerId");
            return (Criteria) this;
        }

        public Criteria andWriterIdNotIn(List<Integer> values) {
            addCriterion("writer_id not in", values, "writerId");
            return (Criteria) this;
        }

        public Criteria andWriterIdBetween(Integer value1, Integer value2) {
            addCriterion("writer_id between", value1, value2, "writerId");
            return (Criteria) this;
        }

        public Criteria andWriterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("writer_id not between", value1, value2, "writerId");
            return (Criteria) this;
        }

        public Criteria andEIntroduceIsNull() {
            addCriterion("e_introduce is null");
            return (Criteria) this;
        }

        public Criteria andEIntroduceIsNotNull() {
            addCriterion("e_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andEIntroduceEqualTo(String value) {
            addCriterion("e_introduce =", value, "eIntroduce");
            return (Criteria) this;
        }

        public Criteria andEIntroduceNotEqualTo(String value) {
            addCriterion("e_introduce <>", value, "eIntroduce");
            return (Criteria) this;
        }

        public Criteria andEIntroduceGreaterThan(String value) {
            addCriterion("e_introduce >", value, "eIntroduce");
            return (Criteria) this;
        }

        public Criteria andEIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("e_introduce >=", value, "eIntroduce");
            return (Criteria) this;
        }

        public Criteria andEIntroduceLessThan(String value) {
            addCriterion("e_introduce <", value, "eIntroduce");
            return (Criteria) this;
        }

        public Criteria andEIntroduceLessThanOrEqualTo(String value) {
            addCriterion("e_introduce <=", value, "eIntroduce");
            return (Criteria) this;
        }

        public Criteria andEIntroduceLike(String value) {
            addCriterion("e_introduce like", value, "eIntroduce");
            return (Criteria) this;
        }

        public Criteria andEIntroduceNotLike(String value) {
            addCriterion("e_introduce not like", value, "eIntroduce");
            return (Criteria) this;
        }

        public Criteria andEIntroduceIn(List<String> values) {
            addCriterion("e_introduce in", values, "eIntroduce");
            return (Criteria) this;
        }

        public Criteria andEIntroduceNotIn(List<String> values) {
            addCriterion("e_introduce not in", values, "eIntroduce");
            return (Criteria) this;
        }

        public Criteria andEIntroduceBetween(String value1, String value2) {
            addCriterion("e_introduce between", value1, value2, "eIntroduce");
            return (Criteria) this;
        }

        public Criteria andEIntroduceNotBetween(String value1, String value2) {
            addCriterion("e_introduce not between", value1, value2, "eIntroduce");
            return (Criteria) this;
        }

        public Criteria andCanpublishIsNull() {
            addCriterion("canpublish is null");
            return (Criteria) this;
        }

        public Criteria andCanpublishIsNotNull() {
            addCriterion("canpublish is not null");
            return (Criteria) this;
        }

        public Criteria andCanpublishEqualTo(Boolean value) {
            addCriterion("canpublish =", value, "canpublish");
            return (Criteria) this;
        }

        public Criteria andCanpublishNotEqualTo(Boolean value) {
            addCriterion("canpublish <>", value, "canpublish");
            return (Criteria) this;
        }

        public Criteria andCanpublishGreaterThan(Boolean value) {
            addCriterion("canpublish >", value, "canpublish");
            return (Criteria) this;
        }

        public Criteria andCanpublishGreaterThanOrEqualTo(Boolean value) {
            addCriterion("canpublish >=", value, "canpublish");
            return (Criteria) this;
        }

        public Criteria andCanpublishLessThan(Boolean value) {
            addCriterion("canpublish <", value, "canpublish");
            return (Criteria) this;
        }

        public Criteria andCanpublishLessThanOrEqualTo(Boolean value) {
            addCriterion("canpublish <=", value, "canpublish");
            return (Criteria) this;
        }

        public Criteria andCanpublishIn(List<Boolean> values) {
            addCriterion("canpublish in", values, "canpublish");
            return (Criteria) this;
        }

        public Criteria andCanpublishNotIn(List<Boolean> values) {
            addCriterion("canpublish not in", values, "canpublish");
            return (Criteria) this;
        }

        public Criteria andCanpublishBetween(Boolean value1, Boolean value2) {
            addCriterion("canpublish between", value1, value2, "canpublish");
            return (Criteria) this;
        }

        public Criteria andCanpublishNotBetween(Boolean value1, Boolean value2) {
            addCriterion("canpublish not between", value1, value2, "canpublish");
            return (Criteria) this;
        }

        public Criteria andIfpublishIsNull() {
            addCriterion("ifpublish is null");
            return (Criteria) this;
        }

        public Criteria andIfpublishIsNotNull() {
            addCriterion("ifpublish is not null");
            return (Criteria) this;
        }

        public Criteria andIfpublishEqualTo(Boolean value) {
            addCriterion("ifpublish =", value, "ifpublish");
            return (Criteria) this;
        }

        public Criteria andIfpublishNotEqualTo(Boolean value) {
            addCriterion("ifpublish <>", value, "ifpublish");
            return (Criteria) this;
        }

        public Criteria andIfpublishGreaterThan(Boolean value) {
            addCriterion("ifpublish >", value, "ifpublish");
            return (Criteria) this;
        }

        public Criteria andIfpublishGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ifpublish >=", value, "ifpublish");
            return (Criteria) this;
        }

        public Criteria andIfpublishLessThan(Boolean value) {
            addCriterion("ifpublish <", value, "ifpublish");
            return (Criteria) this;
        }

        public Criteria andIfpublishLessThanOrEqualTo(Boolean value) {
            addCriterion("ifpublish <=", value, "ifpublish");
            return (Criteria) this;
        }

        public Criteria andIfpublishIn(List<Boolean> values) {
            addCriterion("ifpublish in", values, "ifpublish");
            return (Criteria) this;
        }

        public Criteria andIfpublishNotIn(List<Boolean> values) {
            addCriterion("ifpublish not in", values, "ifpublish");
            return (Criteria) this;
        }

        public Criteria andIfpublishBetween(Boolean value1, Boolean value2) {
            addCriterion("ifpublish between", value1, value2, "ifpublish");
            return (Criteria) this;
        }

        public Criteria andIfpublishNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ifpublish not between", value1, value2, "ifpublish");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table essay
     *
     * @mbg.generated do_not_delete_during_merge Thu Oct 24 14:58:09 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table essay
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

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

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}