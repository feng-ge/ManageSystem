package com.service;

import com.bean.Classify;
import com.bean.ClassifyExample;
import com.dao.ClassifyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class classifytypeimple implements ClassifyMapper {

    @Autowired
    ClassifyMapper classifyMapper;

    @Override
    public long countByExample(ClassifyExample example) {
        return classifyMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ClassifyExample example) {
        return classifyMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer cid) {
        return classifyMapper.deleteByPrimaryKey(cid);
    }

    @Override
    public int insert(Classify record) {
        return classifyMapper.insert(record);
    }

    @Override
    public int insertSelective(Classify record) {
        return classifyMapper.insertSelective(record);
    }

    @Override
    public List<Classify> selectByExample(ClassifyExample example) {
        return classifyMapper.selectByExample(example);
    }

    @Override
    public Classify selectByPrimaryKey(Integer cid) {
        return classifyMapper.selectByPrimaryKey(cid);
    }

    @Override
    public int updateByExampleSelective(Classify record, ClassifyExample example) {
        return classifyMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Classify record, ClassifyExample example) {
        return classifyMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Classify record) {
        return classifyMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Classify record) {
        return classifyMapper.updateByPrimaryKey(record);
    }
}
