package com.dao;

import com.bean.t_user;
import com.bean.t_userExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface t_userMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    long countByExample(t_userExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    int deleteByExample(t_userExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    int insert(t_user record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    int insertSelective(t_user record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    List<t_user> selectByExample(t_userExample example);



    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    t_user selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    int updateByExampleSelective(@Param("record") t_user record, @Param("example") t_userExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    int updateByExample(@Param("record") t_user record, @Param("example") t_userExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    int updateByPrimaryKeySelective(t_user record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    int updateByPrimaryKey(t_user record);
}