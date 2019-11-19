package com.git.api.service.impl;

import com.git.api.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Override
    public List getUserList() {
        ArrayList<String> arrayList = new ArrayList();

        arrayList.add("张三");
        return arrayList;
    }
}
