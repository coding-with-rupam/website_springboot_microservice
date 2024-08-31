package com.myWebsite.codingWithRupam.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class PlayList {
    private String title;
    private String playlistId;
    private String description;
}