package com.example.ytalo.Controller;

import com.example.ytalo.Entity.Data;
import com.example.ytalo.Service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DataController {
    @Autowired
    private DataService dataService;

    @GetMapping("/list")
    public List<Data> listar(){return dataService.findAll();}

    @GetMapping("/list/{id}")
    public Data retrieveData(@PathVariable String id){
        Optional<Data> data = dataService.findDataById(id);
        if(!data.isPresent()){
            return null;
        }else{
            return data.get();
        }
    }

    @PostMapping("/new")
    public String newData(@RequestBody Data data){
        Data data1 = dataService.save(data);
        return "Creado Exitosamente";
    }

    @DeleteMapping("/list/{id}")
    public String deleteData(@PathVariable String id){
        dataService.delete(id);
        return "Elemento eliminado";
    }

    @PutMapping("/actualizar/{id}")
    public String updateData(@RequestBody Data data){
        dataService.save(data);
        return "Actualizacion completada";
    }

}
