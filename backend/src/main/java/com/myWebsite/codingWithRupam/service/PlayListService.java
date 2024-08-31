package com.myWebsite.codingWithRupam.service;

import com.myWebsite.codingWithRupam.model.PlayList;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PlayListService {
    public List<PlayList> getAllPlayLists() {
        return Arrays.asList(
                new PlayList("Welcome To the Course", "PLknNIHOfOwSZCtvZmDWDrtsLrYjuf6YlC&si=DU7P1JtEklfFQJVk", "Learn the basics of Python"),
                new PlayList("JavaScript Basics", "PL4cUxeGkcC9hIa-j1FwZWHhaQb3LSCOI6", "Introduction to JavaScript fundamentals."),
                new PlayList("HTML & CSS", "PL4cUxeGkcC9gZD-Tvwfod2gaISzfRiP9d", "Learn how to build webpages with HTML and CSS."),
                new PlayList("Advanced Java Concepts", "PL4cUxeGkcC9h8mPb2Fl0Qp3l9dI7V9SxW", "Deep dive into advanced Java programming concepts."),
                new PlayList("ReactJS for Beginners", "PL4cUxeGkcC9jTsgmOteibcF-t_yE4pKrQ", "Start building interactive UIs with ReactJS.")
        );
    }
}
