package com.enciclopedia.animales.conexion;

public class Animal {
    private String Categoria;
    private String nombreAnimal; //nombre animal
    private String alimentacion;
    private String familia;
    private String tamano;
    private String genero;
    private String numeroPatas;
    private String numeroOjos;

    public String getCategoria() {
        return Categoria;
    }

    public String getnombreAnimal() {
        return nombreAnimal;
    }

    public Animal(String categoria, String nombreAnimal, String alimentacion, String familia,
                  String tamano, String genero, String numeroPatas, String numeroOjos) {
        this.Categoria = categoria;
        this.nombreAnimal = nombreAnimal;
        this.alimentacion = alimentacion;
        this.familia = familia;
        this.tamano = tamano;
        this.genero = genero;
        this.numeroPatas = numeroPatas;
        this.numeroOjos = numeroOjos;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public String getFamilia() {
        return familia;
    }

    public String getTamano() {
        return tamano;
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




}
