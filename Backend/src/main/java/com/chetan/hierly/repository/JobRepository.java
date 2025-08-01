package com.chetan.hierly.repository;


import com.chetan.hierly.entity.Job;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends MongoRepository<Job, ObjectId> {
}
