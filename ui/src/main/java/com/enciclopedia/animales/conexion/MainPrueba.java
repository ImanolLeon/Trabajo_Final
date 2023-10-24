package com.enciclopedia.animales.conexion;

public class MainPrueba {
    public static void main(String[] args) {

        Conexion conexion = new Conexion();
        conexion.leerCsv();


        for(Animal animal : conexion.getDatos() ){
            System.out.println(animal.getAnimal()+ " " + animal.getCategoria());
        }
    }
}
