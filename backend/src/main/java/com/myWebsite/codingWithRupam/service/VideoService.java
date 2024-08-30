package com.myWebsite.codingWithRupam.service;

import com.myWebsite.codingWithRupam.model.Video;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class VideoService {
    public List<Video> getAllVideos() {
        return Arrays.asList(
                new Video("Spring Boot Tutorial", "t1x9xypX", "Learn Spring Boot basics."),
                new Video("JavaScript Basics", "abc123", "Introduction to JavaScript."),
                new Video("HTML & CSS", "xyz456", "Learn how to build webpages with HTML and CSS.")
        );
    }
}
