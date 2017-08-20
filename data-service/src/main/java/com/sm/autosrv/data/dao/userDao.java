package com.sm.autosrv.data.dao;

import com.sm.autosrv.service.interfaces.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface UserDao {
    ArrayList<User> getUserList();
}
