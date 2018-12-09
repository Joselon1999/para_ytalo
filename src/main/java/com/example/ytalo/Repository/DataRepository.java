package com.example.ytalo.Repository;

import com.example.ytalo.Entity.Data;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface DataRepository extends MongoRepository<Data,String> {

    List<Data> findAllByOrderByFechaDesc();
    Data findTopByOrderByIdDesc();


    //void delete(Data deleted);


}
