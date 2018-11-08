package com.zhucan.exm.service;

import com.zhucan.exm.domain.TestZc;
import com.zhucan.exm.domain.TestZcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestZcService {

    @Autowired
    private TestZcRepository testZcRepository;

    public List<TestZc> findAll(){
        return testZcRepository.findAll();
    }
}
