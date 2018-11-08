package com.zhucan.exm.controller;

import com.zhucan.exm.domain.TestZc;
import com.zhucan.exm.service.TestZcService;
import com.zhucan.exm.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableAutoConfiguration
public class LoginController {

    @Autowired
    private VideoService videoService;
    @Autowired
    private TestZcService testZcService;

    @RequestMapping("/Login")
    public String Login(){
        List<TestZc> testZcs=testZcService.findAll();
        for (TestZc t:testZcs
             ) {
            System.err.println(t.toString());
        }
        System.err.println("./startup.sh");
        return testZcs.toString();
    }
}
