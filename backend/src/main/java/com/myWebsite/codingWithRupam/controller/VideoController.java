package com.myWebsite.codingWithRupam.controller;



import com.myWebsite.codingWithRupam.model.Video;
import com.myWebsite.codingWithRupam.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/videos")
@CrossOrigin(origins = "http://localhost:63342")
public class VideoController {

    @Autowired
    private VideoService videoService;

    @GetMapping
    public List<Video> getVideos() {
        return videoService.getAllVideos();
    }
}
