package com.example.ytalo.Repository;

import com.example.ytalo.Entity.Data;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepository extends MongoRepository<Data,String> {
}