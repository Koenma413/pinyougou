package com.hell.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hell.provider.api.IService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserService {

    @Reference
    IService iService;

    @RequestMapping(name = "/")
    public String hello() {
        String ticket = iService.getTicket();
        System.out.println("买到票了: " + ticket);
        return "买到票了: " + ticket;
    }
}
