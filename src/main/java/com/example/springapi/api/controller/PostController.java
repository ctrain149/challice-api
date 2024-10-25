package com.example.springapi.api.controller;

import com.example.springapi.api.model.Post;
import com.example.springapi.repository.PostRepository;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class PostController {
  private final PostRepository postRepository;

  public PostController(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  @PostMapping("/api/posts/create")
  public ResponseEntity<Post> createPost(@RequestBody Post post) {
    Post savedPost = postRepository.save(post);

    return ResponseEntity.ok(savedPost);
  }

  @GetMapping("/api/posts")
  public ResponseEntity<List<Post>> getPosts(@RequestParam String param) {
    List<Post> posts = postRepository.findAll();

    return ResponseEntity.ok(posts);
  }
}
