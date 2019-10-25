package com.service;

import com.bean.Essay;
import com.bean.EssayExample;
import com.dao.EssayMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class essayimple implements EssayMapper {

    @Autowired
    EssayMapper essayMapper;


    @Override
    public long countByExample(EssayExample example) {
        return essayMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(EssayExample example) {
        return essayMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer eid) {
        return essayMapper.deleteByPrimaryKey(eid);
    }

    @Override
    public int insert(Essay record) {
        return essayMapper.insert(record);
    }

    @Override
    public int insertSelective(Essay record) {
        return essayMapper.insertSelective(record);
    }

    @Override
    public List<Essay> selectByExample(EssayExample example) {
        return essayMapper.selectByExample(example);
    }

    @Override
    public Essay selectByPrimaryKey(Integer eid) {
        return essayMapper.selectByPrimaryKey(eid);
    }

    @Override
    public int updateByExampleSelective(Essay record, EssayExample example) {
        return essayMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Essay record, EssayExample example) {
        return essayMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Essay record) {
        return essayMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Essay record) {
        return essayMapper.updateByPrimaryKey(record);
    }
}
