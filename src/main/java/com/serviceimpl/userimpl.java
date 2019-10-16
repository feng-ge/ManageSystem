package com.serviceimpl;

import com.bean.t_user;
import com.dao.t_userMapper;
import com.service.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class userimpl implements user {
    @Autowired
    t_userMapper t_userMapper;


    @Override
    public int insertuser(String username, String email, String password) {
        t_user t_user = new t_user();
        t_user.setUsername(username);
        t_user.setEmail(email);
        t_user.setPassword(password);
        int result = t_userMapper.insertSelective(t_user);
        return result;
    }
}
