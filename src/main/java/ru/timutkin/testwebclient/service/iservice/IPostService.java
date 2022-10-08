package ru.timutkin.testwebclient.service.iservice;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import ru.timutkin.testwebclient.dto.Post;
import ru.timutkin.testwebclient.dto.User;
import ru.timutkin.testwebclient.service.PostService;

import java.nio.charset.StandardCharsets;

@Slf4j
@Service
@AllArgsConstructor
public class IPostService implements PostService {

    WebClient webClient;

    @Override
    public Mono<Post> getPostByIdAsync(Long id) {
        return webClient.get()
                .uri("/posts/{id}", id)
                .accept(MediaType.APPLICATION_JSON)
                .acceptCharset(StandardCharsets.UTF_8)
                .retrieve()
                .bodyToMono(Post.class)
                .doOnError(error->  log.error("An error has occurred {}", error.getMessage()));
    }
}
