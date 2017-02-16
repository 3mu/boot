/**
 * Created by Administrator on 2017/2/16 0016.
 */
package com.boot.web;

import com.boot.service.ServiceApplication;

public class WebApplication {

    public  static  void main(String[] agrs){
     String message=  new ServiceApplication().getHello();
     System.out.print(message);
 }
}
