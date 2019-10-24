package com.service;

import com.bean.Power;
import com.bean.PowerExample;
import com.dao.PowerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class powerimple implements PowerMapper {

    @Autowired
    PowerMapper powerMapper;

    @Override
    public long countByExample(PowerExample example) {
        return powerMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(PowerExample example) {
        return powerMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer pId) {
        return powerMapper.deleteByPrimaryKey(pId);
    }

    @Override
    public int insert(Power record) {
        return powerMapper.insert(record);
    }

    @Override
    public int insertSelective(Power record) {
        return powerMapper.insertSelective(record);
    }

    @Override
    public List<Power> selectByExample(PowerExample example) {
        return powerMapper.selectByExample(example);
    }

    @Override
    public Power selectByPrimaryKey(Integer pId) {
        return powerMapper.selectByPrimaryKey(pId);
    }

    @Override
    public int updateByExampleSelective(Power record, PowerExample example) {
        return powerMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Power record, PowerExample example) {
        return powerMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Power record) {
        return powerMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Power record) {
        return powerMapper.updateByPrimaryKey(record);
    }
}
