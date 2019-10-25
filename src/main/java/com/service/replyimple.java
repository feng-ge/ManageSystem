package com.service;

import com.bean.Reply;
import com.bean.ReplyExample;
import com.dao.ReplyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class replyimple implements ReplyMapper {

    @Autowired
    ReplyMapper replyMapper;

    @Override
    public long countByExample(ReplyExample example) {
        return replyMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ReplyExample example) {
        return replyMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer rid) {
        return replyMapper.deleteByPrimaryKey(rid);
    }

    @Override
    public int insert(Reply record) {
        return replyMapper.insert(record);
    }

    @Override
    public int insertSelective(Reply record) {
        return replyMapper.insertSelective(record);
    }

    @Override
    public List<Reply> selectByExample(ReplyExample example) {
        return replyMapper.selectByExample(example);
    }

    @Override
    public Reply selectByPrimaryKey(Integer rid) {
        return replyMapper.selectByPrimaryKey(rid);
    }

    @Override
    public int updateByExampleSelective(Reply record, ReplyExample example) {
        return replyMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Reply record, ReplyExample example) {
        return replyMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Reply record) {
        return replyMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Reply record) {
        return replyMapper.updateByPrimaryKey(record);
    }
}
