package com.dh.catalog;

import com.dh.catalog.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/playlist")
public class catalogController {

    @Autowired
    private CatalogService service;

    @GetMapping("/{genero}")
    public String findMusica(@PathVariable String genero){
        return service.getMovie(genero);
    }
}
