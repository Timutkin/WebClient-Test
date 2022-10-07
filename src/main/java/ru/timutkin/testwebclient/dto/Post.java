package ru.timutkin.testwebclient.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Post {
    private Integer id;
    private Integer userId;
    private String title;
    private String body;
}
