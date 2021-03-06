package com.bean;

import java.util.Date;

public class Essay {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column essay.eid
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    private Integer eid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column essay.ename
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    private String ename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column essay.eclass_id
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    private Integer eclassId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column essay.c_time
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    private Date cTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column essay.modified
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    private Integer modified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column essay.e_score
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    private Integer eScore;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column essay.publish
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    private Date publish;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column essay.writer_id
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    private Integer writerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column essay.e_introduce
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    private String eIntroduce;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column essay.canpublish
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    private Boolean canpublish;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column essay.ifpublish
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    private Boolean ifpublish;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column essay.eid
     *
     * @return the value of essay.eid
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    public Integer getEid() {
        return eid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column essay.eid
     *
     * @param eid the value for essay.eid
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    public void setEid(Integer eid) {
        this.eid = eid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column essay.ename
     *
     * @return the value of essay.ename
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    public String getEname() {
        return ename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column essay.ename
     *
     * @param ename the value for essay.ename
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column essay.eclass_id
     *
     * @return the value of essay.eclass_id
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    public Integer getEclassId() {
        return eclassId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column essay.eclass_id
     *
     * @param eclassId the value for essay.eclass_id
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    public void setEclassId(Integer eclassId) {
        this.eclassId = eclassId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column essay.c_time
     *
     * @return the value of essay.c_time
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    public Date getcTime() {
        return cTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column essay.c_time
     *
     * @param cTime the value for essay.c_time
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column essay.modified
     *
     * @return the value of essay.modified
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    public Integer getModified() {
        return modified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column essay.modified
     *
     * @param modified the value for essay.modified
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    public void setModified(Integer modified) {
        this.modified = modified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column essay.e_score
     *
     * @return the value of essay.e_score
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    public Integer geteScore() {
        return eScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column essay.e_score
     *
     * @param eScore the value for essay.e_score
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    public void seteScore(Integer eScore) {
        this.eScore = eScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column essay.publish
     *
     * @return the value of essay.publish
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    public Date getPublish() {
        return publish;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column essay.publish
     *
     * @param publish the value for essay.publish
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    public void setPublish(Date publish) {
        this.publish = publish;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column essay.writer_id
     *
     * @return the value of essay.writer_id
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    public Integer getWriterId() {
        return writerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column essay.writer_id
     *
     * @param writerId the value for essay.writer_id
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    public void setWriterId(Integer writerId) {
        this.writerId = writerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column essay.e_introduce
     *
     * @return the value of essay.e_introduce
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    public String geteIntroduce() {
        return eIntroduce;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column essay.e_introduce
     *
     * @param eIntroduce the value for essay.e_introduce
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    public void seteIntroduce(String eIntroduce) {
        this.eIntroduce = eIntroduce == null ? null : eIntroduce.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column essay.canpublish
     *
     * @return the value of essay.canpublish
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    public Boolean getCanpublish() {
        return canpublish;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column essay.canpublish
     *
     * @param canpublish the value for essay.canpublish
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    public void setCanpublish(Boolean canpublish) {
        this.canpublish = canpublish;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column essay.ifpublish
     *
     * @return the value of essay.ifpublish
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    public Boolean getIfpublish() {
        return ifpublish;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column essay.ifpublish
     *
     * @param ifpublish the value for essay.ifpublish
     *
     * @mbg.generated Thu Oct 24 14:58:09 CST 2019
     */
    public void setIfpublish(Boolean ifpublish) {
        this.ifpublish = ifpublish;
    }
}