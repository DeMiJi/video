package com.cap.service;

import com.cap.entity.Video;

import java.util.List;

public interface VideoService {
    List<Video> queryList();
    List<Video> queryVideotop10();
    List<Video> queryVideoType();
}
