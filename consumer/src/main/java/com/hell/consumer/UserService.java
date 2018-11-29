package com.hell.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hell.provider.api.IService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class UserService {

    @Reference
    IService iService;

    @RequestMapping(name = "/hello")
    public void hello() {
        String ticket = iService.getTicket();
        System.out.println("买到票了: " + ticket);
    }
}
