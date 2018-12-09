package com.example.ytalo.Controller;

import com.example.ytalo.Configuration.CustomDate;
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
    public List<Data> listar(){

        List<Data> data = dataService.findAll();
        for (Data data1 : data){
            if (data1.getFecha() != null){
                data1.setFecha(CustomDate
                        .customFormat(data1.getFecha(),-5));
            }
        }

        return data;
    }

    @GetMapping("/all")
    public List<Data> orden(){return dataService.findAllByOrderByFechaDesc();}

    @GetMapping("/list/{id}")
    public Data retrieveData(@PathVariable String id){
        Optional<Data> data = dataService.findDataById(id);
        data.get().setFecha(CustomDate.customFormat(data.get().getFecha(),5));
        if(!data.isPresent()){
            return null;
        }else{
            return data.get();
        }
    }

    @GetMapping("/max")
    public Data mayor(){return dataService.findTopByOrderByIdDesc();}

/* Este funciona*/
    @PostMapping("/new")
    public String newData(@RequestBody Data data){
        Data data1 = dataService.save(data);
        return "Creado Exitosamente ID:"+data.getId()+"-->";
    }
/**/
    @DeleteMapping("/delete/{id}")
    public String deleteData(@PathVariable String id){
        dataService.delete(id);
        return "Elemento eliminado";
    }
//Esto es un mamaracho -PENDIENTE PARA REDUCCIÖN-
    @PutMapping("/actualizar/{id}")
    public String updateData(@RequestBody Data data,@PathVariable String id){
        Optional<Data> data1 = dataService.findDataById(id);
        Data data2 = data1.get();
        if(!data1.isPresent()){
            return "Lo siento no existe ese documento";
        }else {
            data2=dataService.save(data);
        }
        return "Actualizacion completada";
    }
}
