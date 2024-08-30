package com.myWebsite.codingWithRupam.model;

public class Video {
    private String title;
    private String youtubeId;
    private String description;

    public Video(String title, String youtubeId, String description) {
        this.title = title;
        this.youtubeId = youtubeId;
        this.description = description;
    }

    // Getters and setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getYoutubeId() { return youtubeId; }
    public void setYoutubeId(String youtubeId) { this.youtubeId = youtubeId; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
