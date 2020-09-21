package com.cap.controller;

import com.cap.entity.Video;
import com.cap.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@CrossOrigin
@Controller
public class VideoController {

    @Autowired
    VideoService videoService;

    //查询全部
    @GetMapping("/queryList")
    @ResponseBody
    public List<Video> query(){
        List<Video> videos = videoService.queryList();
        System.out.println(videos);
        return videos;
    }
    //查询top10
    @GetMapping("/queryVideotop10")
    @ResponseBody
    public List<Video> videotop(){
        List<Video> videos = videoService.queryVideotop10();
        System.out.println(videos);
        return videos;
    }
    //查询类型播放比例
    @GetMapping("/queryVideoType")
    @ResponseBody
    public List<Video> videoType(){
        List<Video> videos = videoService.queryVideoType();
        System.out.println(videos);
        return videos;
    }
}
