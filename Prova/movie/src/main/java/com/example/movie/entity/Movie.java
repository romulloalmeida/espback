package com.example.movie.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="movie")
@Data
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String genero;
    private String url;
}
