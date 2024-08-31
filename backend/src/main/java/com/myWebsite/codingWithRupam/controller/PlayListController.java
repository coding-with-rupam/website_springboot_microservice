package com.myWebsite.codingWithRupam.controller;

import com.myWebsite.codingWithRupam.model.PlayList;
import com.myWebsite.codingWithRupam.service.PlayListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/playlist")
@CrossOrigin(origins = "http://localhost:63342")
public class PlayListController {

    @Autowired
    private PlayListService playListService;

    @GetMapping
    public List<PlayList> getPlayList() {
        return playListService.getAllPlayLists();
    }
}
