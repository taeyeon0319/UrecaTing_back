package com.uting.urecating.dto;

import com.uting.urecating.domain.Category;
import com.uting.urecating.domain.Post;

import java.time.LocalDateTime;

public record PostDetailDto(String username, String title, String content, String image, Category category, LocalDateTime meetingDate, String place, int maxCapacity, LocalDateTime createdAt, LocalDateTime updatedAt) {

    public static PostDetailDto fromPost(Post p) {
        return new PostDetailDto(
                p.getUser().getUserName(),
                p.getTitle(),
                p.getContent(),
                p.getImage(),
                p.getCategory(),
                p.getMeetingDate(),
                p.getPlace(),
                p.getMaxCapacity(),
                p.getCreatedAt(),
                p.getUpdatedAt());
    }
}