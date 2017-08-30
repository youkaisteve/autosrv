package com.sm.autosrv.data.serviceimpl;

import com.sm.autosrv.data.dao.UserDao;
import com.sm.autosrv.service.interfaces.dataservice.UserService;
import com.sm.autosrv.service.interfaces.entity.ApplicationUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public ArrayList<ApplicationUser> getUserList() {
        return userDao.getUserList();
    }

    @Override
    public ApplicationUser findByUsername(String userName) {
        return userDao.findByUsername(userName);
    }

    @Override
    public void save(ApplicationUser user) {
        //TODO:precheck
        userDao.save(user);
    }
}
