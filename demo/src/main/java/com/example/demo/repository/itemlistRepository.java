package com.example.demo.repository;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.itemlist;
@Repository

public interface itemlistRepository extends MongoRepository<itemlist, ObjectId> {
	Optional<itemlist> findById(ObjectId _id);

	void deleteById(ObjectId _id);
    
	
}
