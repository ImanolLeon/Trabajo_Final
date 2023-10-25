package com.enciclopedia.animales.conexion;

public class Animal {
    private String Categoria;
    private String Animal;
    private String alimentacion;
    private String familia;
    private String tamano;
    private String genero;
    private String numeroPatas;

    public String getCategoria() {
        return Categoria;
    }

    public String getAnimal() {
        return Animal;
    }

    public Animal(String categoria, String animal, String alimentacion, String familia, String tamano) {
        this.Categoria = categoria;
        this.Animal = animal;
        this.alimentacion = alimentacion;
        this.familia = familia;
        this.tamano = tamano;


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

    private String numeroOjos;


}
