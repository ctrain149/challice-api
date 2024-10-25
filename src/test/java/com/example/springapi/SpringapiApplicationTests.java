package com.example.springapi;

import org.junit.jupiter.api.Test;

import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.springapi.repository.PostRepository;

@SpringBootTest
@AutoConfigureBefore(MongoAutoConfiguration.class)
class SpringapiApplicationTests {
    @MockBean
    private PostRepository postRepository;

    @Test
    void contextLoads() {
        // Optionally test your repository methods here
    }
}

