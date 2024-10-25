package com.example.springapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapi.api.model.Post;
import com.example.springapi.repository.PostRepository;

@SpringBootApplication
@RestController
@EnableMongoRepositories
public class SpringapiApplication implements CommandLineRunner {
	@Autowired
	PostRepository postRepo;

	List<Post> itemList = new ArrayList<Post>();

	public static void main(String[] args) {
		SpringApplication.run(SpringapiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {}

	@GetMapping("/")
	public String hello() {
		return "Hello World!";
	}
}
