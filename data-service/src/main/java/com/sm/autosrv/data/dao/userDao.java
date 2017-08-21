package com.sm.autosrv.data.dao;

import com.sm.autosrv.service.interfaces.entity.ApplicationUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface UserDao {
    ArrayList<ApplicationUser> getUserList();
    ApplicationUser findByUsername(String userName);
    void save(ApplicationUser user);
}
