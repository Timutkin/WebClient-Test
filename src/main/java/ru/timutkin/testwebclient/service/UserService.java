package ru.timutkin.testwebclient.service;

import reactor.core.publisher.Mono;
import ru.timutkin.testwebclient.dto.User;

public interface UserService {
    Mono<User> getUserByIdAsync(Long id);
}
