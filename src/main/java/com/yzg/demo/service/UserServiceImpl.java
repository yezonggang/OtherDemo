package com.yzg.demo.service;

import com.yzg.demo.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl {

    // 模拟查询库操作
    public List<User> initUserData(){
        User user1=new User("fdla","yzg","123456");
        User user2=new User("fjewpq","zgy","654321");
        User user3=new User("lgag2","gyz","152346");

        List<User> userList=new ArrayList<User>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        return userList;
    }

    public User findByUsername(User user){
        return initUserData().stream().filter(i->i.getUsername().equals(user.getUsername())).collect(Collectors.toList()).get(0);
    }
    public User findUserById(String userId) {

        return initUserData().stream().filter(i->i.getId().equals(userId)).collect(Collectors.toList()).get(0);
    }
}
