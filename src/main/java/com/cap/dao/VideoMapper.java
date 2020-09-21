package com.cap.dao;

import com.cap.entity.Video;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VideoMapper {
    List<Video> queryList();
    List<Video> Videotop10();
    List<Video> VideoType();
}
