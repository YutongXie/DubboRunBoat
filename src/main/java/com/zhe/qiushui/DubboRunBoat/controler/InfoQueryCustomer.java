package com.zhe.qiushui.DubboRunBoat.controler;

import com.qiushui.module.Info;
import com.qiushui.service.InfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class InfoQueryCustomer {
    @Resource
    private InfoService infoService;

    @RequestMapping("/findInfoByTypeAndName")
    public void findInfoByTypeAndName() {
        String type = "Person";
        String name = "Java";
        Info info = infoService.queryByTypeAndName(type, name);
        System.out.println(info.getType() + "|" + info.getName());

    }
}
