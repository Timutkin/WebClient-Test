package ru.timutkin.testwebclient.service;

import reactor.core.publisher.Mono;
import ru.timutkin.testwebclient.dto.Post;
import ru.timutkin.testwebclient.dto.User;

public interface PostService {
    Mono<Post> getPostByIdAsync(Long id);
}
