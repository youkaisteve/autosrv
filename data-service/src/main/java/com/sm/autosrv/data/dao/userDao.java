package com.sm.autosrv.data.dao;

import com.sm.autosrv.service.interfaces.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Mapper
@Component
public interface UserDao {
    ArrayList<User> getUserList();
}
