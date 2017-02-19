package com.boot.inter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/2/18 0018.
 */
//@Repository
@Component
public class ServiceImpl implements IService {
    @Override
    public String GetMessage() {
        return  "this is ioc app";
    }
}
