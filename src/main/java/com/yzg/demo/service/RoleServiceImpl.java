package com.yzg.demo.service;

import com.yzg.demo.model.user.Role;
import com.yzg.demo.utils.TokenUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import springfox.documentation.spring.web.json.Json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RoleServiceImpl {
    public Role getRoleFromToken(String token){

        List<String> roleList =new ArrayList<String>();
        roleList.add("admin");
        String introductions="I am a super administrator";
        String avatar="https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif";
        String name="Super Admin";
/*
        Map<String,Object> objectMap=new HashMap<>();
        objectMap.put("name",name);
        objectMap.put("avatra",avatar);
        objectMap.put("introductions",introductions);
        objectMap.put("roles",roleList);*/
/*        JSONObject json=new JSONObject();
        try {
            json.put("name",name);
            json.put("introductions",introductions);
            json.put("avatar",avatar);
            json.put("rolse",roleList);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return json;
        */

        return  new Role(name,roleList,introductions,avatar);


    }





}
