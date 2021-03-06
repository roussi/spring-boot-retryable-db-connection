package com.aroussi.retryabledbconnection.resource;

import com.aroussi.retryabledbconnection.model.Post;
import com.aroussi.retryabledbconnection.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author aroussi
 * @version %I% %G%
 */
@RequestMapping(value = "/posts")
@RestController
@RequiredArgsConstructor
public class PostResource {

    private final PostRepository postRepository;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Post>> getAllPosts() {
        return ResponseEntity.ok(postRepository.findAll());
    }

}
