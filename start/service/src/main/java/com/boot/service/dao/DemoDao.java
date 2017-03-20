package com.boot.service.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/3/20 0020.
 */
@Mapper
@Repository
public interface DemoDao {
    @Select("select 1 from profile")
    int getCount();
}
