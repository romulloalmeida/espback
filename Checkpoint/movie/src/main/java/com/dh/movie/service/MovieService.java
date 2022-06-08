package com.dh.movie.service;

import com.dh.movie.entity.Movie;

public interface MovieService {
    void save(Movie movie);
    String findByGenero(String genero);
}
