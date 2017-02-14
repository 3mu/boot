/**
 * Created by Administrator on 2017/2/12 0012.
 */
package com.boot.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class invoker {

    @ResponseBody
    @RequestMapping(value="/")
    String location(){
        return "北京";
    }

    @ResponseBody
    @RequestMapping(value = "/api/{name}/{age}")
    User User(@PathVariable(name = "name") String  name, @PathVariable(name = "age") int age){
        User u=new User();
        u.setName(name);
        u.setAge(age);
        return  u;
    }
}

class  User{

    private  int age;

    private  String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
