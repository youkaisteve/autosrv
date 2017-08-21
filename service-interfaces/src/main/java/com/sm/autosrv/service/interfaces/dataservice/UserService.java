package com.sm.autosrv.service.interfaces.dataservice;

import com.sm.autosrv.service.interfaces.entity.ApplicationUser;

import java.util.ArrayList;

/**
 * Created by youkai on 2017/8/18.
 */
public interface UserService {
    ArrayList<ApplicationUser> getUserList();
    ApplicationUser findByUsername(String userName);
    void save(ApplicationUser user);
}
