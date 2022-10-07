package ru.timutkin.testwebclient.service;

import reactor.core.publisher.Mono;
import ru.timutkin.testwebclient.dto.User;

public interface PostService {
    Mono<User> getPostByIdAsync();
}
