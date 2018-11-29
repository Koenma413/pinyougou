package com.hell.provider.impl;

import com.hell.provider.api.IService;
import org.springframework.stereotype.Component;

@Component
@com.alibaba.dubbo.config.annotation.Service
public class Service implements IService {

    @Override
    public String getTicket() {
        return "毒液";
    }
}
