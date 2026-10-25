package ru.yandex.practicum.catsgram.model;

import lombok.Data;

import java.time.Instant;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of = "id")
public class Post {
    private Long id;
    private long authorId;
    private String description;
    private Instant postDate;
}
