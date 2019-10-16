package com.dao;

import com.bean.reply;
import com.bean.replyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface replyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reply
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    long countByExample(replyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reply
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    int deleteByExample(replyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reply
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    int deleteByPrimaryKey(Integer rid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reply
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    int insert(reply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reply
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    int insertSelective(reply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reply
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    List<reply> selectByExample(replyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reply
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    reply selectByPrimaryKey(Integer rid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reply
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    int updateByExampleSelective(@Param("record") reply record, @Param("example") replyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reply
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    int updateByExample(@Param("record") reply record, @Param("example") replyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reply
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    int updateByPrimaryKeySelective(reply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reply
     *
     * @mbg.generated Sat Oct 12 16:22:20 CST 2019
     */
    int updateByPrimaryKey(reply record);
}