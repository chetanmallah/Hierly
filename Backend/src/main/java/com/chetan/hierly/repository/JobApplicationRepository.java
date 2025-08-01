package com.chetan.hierly.repository;

import com.chetan.hierly.entity.JobApplication;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JobApplicationRepository extends MongoRepository<JobApplication, ObjectId> {
    Optional<JobApplication> findByJobId(ObjectId jobId);
}
