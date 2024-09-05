package com.fastcampus.sns.controller.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PostCreateRequset {
    private String title;
    private String body;
}
