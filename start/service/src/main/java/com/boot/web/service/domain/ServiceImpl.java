package com.boot.web.service.domain;

import com.boot.web.service.dao.DemoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/2/18 0018.
 */

@Service
//@Scope("prototype")
public class ServiceImpl implements IService {
    @Autowired
    private DemoDao demoDao;
    @Override
    public String getMessage() {
        return String.valueOf(demoDao.getCount());
    }
}
