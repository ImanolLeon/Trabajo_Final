package com.enciclopedia.animales.models;

public abstract class Animal {
    private String habitad;
    private String nombreAnimal; // nombre animal
    private String alimentacion;
    private String familia;
    private String genero;
    private String numeroPatas;
    private String numeroOjos;
    private String respiacion;
    private String reproduccion;
    private String rutaImagen;
    private String rutaGif;
    private String rutaSonido;

    // constructor
    public Animal(String habitad, String nombreAnimal, String alimentacion,
            String familia, String genero, String numeroPatas, String numeroOjos,
            String respiacion, String reproduccion, String rutaImagen, String rutaGif, String rutaSonido) {
        this.habitad = habitad;
        this.nombreAnimal = nombreAnimal;
        this.alimentacion = alimentacion;
        this.familia = familia;
        this.genero = genero;
        this.numeroPatas = numeroPatas;
        this.numeroOjos = numeroOjos;
        this.respiacion = respiacion;
        this.reproduccion = reproduccion;
        this.rutaImagen = rutaImagen;
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

    public String getHabitad() {
        return habitad;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public String getRutaGif() {
        return rutaGif;
    }

    public String getRutaSonido() {
        return rutaSonido;
    }
}
