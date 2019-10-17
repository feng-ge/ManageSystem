package com.dao;

import com.bean.classify;
import com.bean.classifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface classifyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classify
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    long countByExample(classifyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classify
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    int deleteByExample(classifyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classify
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    int deleteByPrimaryKey(Integer cid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classify
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    int insert(classify record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classify
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    int insertSelective(classify record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classify
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    List<classify> selectByExample(classifyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classify
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    classify selectByPrimaryKey(Integer cid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classify
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    int updateByExampleSelective(@Param("record") classify record, @Param("example") classifyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classify
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    int updateByExample(@Param("record") classify record, @Param("example") classifyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classify
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    int updateByPrimaryKeySelective(classify record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classify
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    int updateByPrimaryKey(classify record);
}