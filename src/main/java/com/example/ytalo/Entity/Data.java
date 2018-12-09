package com.example.ytalo.Entity;


import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class Data {

    @Id
    public String id;
    public String foto;
    public String titulo;
    public String resumen;
    public String link;
    @CreatedDate
    public Date fecha;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Data(String id, String foto, String titulo, String resumen, String link, Date fecha) {
        this.id = id;
        this.foto = foto;
        this.titulo = titulo;
        this.resumen = resumen;
        this.link = link;
        this.fecha = fecha;

    }

    public Data(String titulo,String resumen,String link,Date fecha) {
        this.titulo = titulo;
        this.resumen = resumen;
        this.link = link;
        this.fecha = fecha;
    }


    public Data() {
    }
}
