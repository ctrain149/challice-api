package com.example.springapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.springapi.api.model.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, Integer> {
	@Query("{caption:'?0'}")
	Post findItemByCaption(String caption);

	public long count();
}