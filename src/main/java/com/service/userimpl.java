package com.service;

import com.bean.t_user;
import com.bean.t_userExample;
import com.dao.t_userMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class userimpl implements t_userMapper {
    @Autowired
    t_userMapper t_userMapper;


    @Override
    public long countByExample(t_userExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(t_userExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(t_user record) {
        return 0;
    }

    @Override
    public int insertSelective(t_user record) {
        t_userMapper.insertSelective(record);
        return 0;
    }

    @Override
    public List<t_user> selectByExample(t_userExample example) {
        return t_userMapper.selectByExample(example);
    }

    @Override
    public t_user selectByPrimaryKey(Integer id) {
        return t_userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(t_user record, t_userExample example) {
        return 0;
    }

    @Override
    public int updateByExample(t_user record, t_userExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(t_user record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(t_user record) {
        return 0;
    }
}
