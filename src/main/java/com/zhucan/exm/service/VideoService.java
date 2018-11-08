package com.zhucan.exm.service;

import com.zhucan.exm.domain.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService {

    @Autowired
    private VideoRepository videoRepository;

    public List<Object> findAll(){
        return videoRepository.findAllByVideoSNNotNull();
    }
}
