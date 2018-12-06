package com.example.ytalo.Repository;

import com.example.ytalo.Entity.Data;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DataRepository extends MongoRepository<Data,String> {

    List<Data> findAllByOrderByFechaDesc();


}
