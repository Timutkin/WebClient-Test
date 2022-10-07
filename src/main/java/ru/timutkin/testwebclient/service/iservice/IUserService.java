package ru.timutkin.testwebclient.service.iservice;

import reactor.core.publisher.Mono;
import ru.timutkin.testwebclient.dto.User;
import ru.timutkin.testwebclient.service.UserService;

public class IUserService implements UserService {
    @Override
    public Mono<User> getUserByIdAsync() {
        return null;
    }
}
