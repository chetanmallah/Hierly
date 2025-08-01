package com.chetan.hierly.repository;


import com.chetan.hierly.entity.Recruiter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RecruiterRepository extends MongoRepository<Recruiter, ObjectId> {
    Optional<Recruiter> findByEmail(String email);
}
