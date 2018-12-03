package com.example.ytalo.Service;

import com.example.ytalo.Entity.Data;
import com.example.ytalo.Repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DataService {

    @Autowired
    private DataRepository dataRepository;

    public List<Data> findAll(){return dataRepository.findAll();}
    public Data save(Data data){return dataRepository.save(data);}
    public void delete(String id){dataRepository.deleteById(id);}
    public Optional<Data> findDataById(String id){return dataRepository.findById(id);}
}
