package com.example.catalog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogService {

    @Autowired
    private MovieFeign movie;

    public String getMovie(String genero){
        return movie.findMovie(genero);
    }
}
