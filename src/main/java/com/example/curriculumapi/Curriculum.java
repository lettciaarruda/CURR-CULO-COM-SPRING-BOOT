package com.example.curriculumapi;


public class Curriculum {

    private Long id;

    private String nome;
    private String email;
    private String experiencia;


    public Curriculum(Long id, String nome, String email, String experiencia) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.experiencia = experiencia;
    }
}