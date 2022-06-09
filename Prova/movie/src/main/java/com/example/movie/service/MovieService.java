package com.example.movie.service;

import com.example.movie.entity.Movie;
import com.example.movie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private MovieRepository repository;

    public void save(Movie movie) {
        repository.save(movie);
    }

    public String findByGenero(String genero) {
        return repository.findByGenero(genero).getNome();
    }
}
