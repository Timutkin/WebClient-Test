package ru.timutkin.testwebclient.service.iservice;

import reactor.core.publisher.Mono;
import ru.timutkin.testwebclient.dto.User;
import ru.timutkin.testwebclient.service.PostService;

public class IPostService implements PostService {
    @Override
    public Mono<User> getPostByIdAsync() {
        return null;
    }
}
