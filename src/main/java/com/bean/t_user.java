package com.bean;

import java.util.Date;

public class t_user {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.id
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.username
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.PASSWORD
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.email
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.p_type
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    private Integer pType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.c_time
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    private Date cTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.id
     *
     * @return the value of t_user.id
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.id
     *
     * @param id the value for t_user.id
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.username
     *
     * @return the value of t_user.username
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.username
     *
     * @param username the value for t_user.username
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.PASSWORD
     *
     * @return the value of t_user.PASSWORD
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.PASSWORD
     *
     * @param password the value for t_user.PASSWORD
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.email
     *
     * @return the value of t_user.email
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.email
     *
     * @param email the value for t_user.email
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.p_type
     *
     * @return the value of t_user.p_type
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    public Integer getpType() {
        return pType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.p_type
     *
     * @param pType the value for t_user.p_type
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    public void setpType(Integer pType) {
        this.pType = pType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.c_time
     *
     * @return the value of t_user.c_time
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    public Date getcTime() {
        return cTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.c_time
     *
     * @param cTime the value for t_user.c_time
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }
}