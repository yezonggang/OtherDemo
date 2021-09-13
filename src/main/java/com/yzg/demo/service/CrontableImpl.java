package com.yzg.demo.service;

import com.yzg.demo.model.Crontable;
import org.springframework.stereotype.Service;

@Service
public class CrontableImpl {

    Crontable cron=new Crontable(1,"0/7 * * * * ?");
    public String getCronInfo(){
        return cron.getInfo();
    }
}