package ru.timutkin.testwebclient.service.iservice;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import ru.timutkin.testwebclient.dto.User;
import ru.timutkin.testwebclient.service.UserService;

import java.nio.charset.StandardCharsets;

@Slf4j
@Service
@AllArgsConstructor
public class IUserService implements UserService {

    WebClient webClient;

    @Override
    public Mono<User> getUserByIdAsync(Long id) {
        return webClient.get()
                .uri("/users/{id}", id)
                .accept(MediaType.APPLICATION_JSON)
                .acceptCharset(StandardCharsets.UTF_8)
                .retrieve()
                .bodyToMono(User.class)
                .doOnError(error->  log.error("An error has occurred {}", error.getMessage()));
    }
}
