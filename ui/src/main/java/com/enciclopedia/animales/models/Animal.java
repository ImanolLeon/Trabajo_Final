package com.enciclopedia.animales.models;

public abstract class Animal{
    private String Categoria;
    private String habitad;
    private String nombreAnimal; //nombre animal
    private String alimentacion;
    private String familia;
    private String genero;
    private String numeroPatas;
    private String numeroOjos;
    private String respiacion;
    private String reproduccion;

    //constructor
    public Animal(String categoria, String habitad, String nombreAnimal, String alimentacion,
                  String familia, String genero, String numeroPatas, String numeroOjos,
                  String respiacion, String reproduccion) {
        this.Categoria = categoria;
        this.habitad = habitad;
        this.nombreAnimal = nombreAnimal;
        this.alimentacion = alimentacion;
        this.familia = familia;
        this.genero = genero;
        this.numeroPatas = numeroPatas;
        this.numeroOjos = numeroOjos;
        this.respiacion = respiacion;
        this.reproduccion = reproduccion;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public String getRespiacion() {
        return respiacion;
    }

    public String getReproduccion() {
        return reproduccion;
    }

    public String getCategoria() {
        return Categoria;
    }

    public String getnombreAnimal() {
        return nombreAnimal;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public String getFamilia() {
        return familia;
    }



    public String getGenero() {
        return genero;
    }

    public String getNumeroPatas() {
        return numeroPatas;
    }

    public String getNumeroOjos() {
        return numeroOjos;
    }
    public String getHabitad() { return habitad ;}



}

