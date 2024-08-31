package com.myWebsite.codingWithRupam.service;

import com.myWebsite.codingWithRupam.model.PlayList;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PlayListService {
    public List<PlayList> getAllPlayLists() {
        return Arrays.asList(
                new PlayList("Welcome to the course!", "UCuURKwY2dqm8dT1od6myZJg", "Learn Spring Boot basics."),
                new PlayList("JavaScript Basics", "UCuURKwY2dqm8dT1od6myZJg", "Introduction to JavaScript."),
                new PlayList("HTML & CSS", "UCuURKwY2dqm8dT1od6myZJg", "Learn how to build webpages with HTML and CSS.")
        );
    }
}
