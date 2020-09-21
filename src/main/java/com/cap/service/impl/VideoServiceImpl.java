package com.cap.service.impl;

import com.cap.dao.VideoMapper;
import com.cap.entity.Video;
import com.cap.service.VideoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {
    @Resource
    VideoMapper videoMapper;

    @Override
    public List<Video> queryList() {
        return videoMapper.queryList();
    }

    @Override
    public List<Video> queryVideotop10() {
        return videoMapper.Videotop10();
    }

    @Override
    public List<Video> queryVideoType() {
        return videoMapper.VideoType();
    }
}
