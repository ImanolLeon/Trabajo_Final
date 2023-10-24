package com.enciclopedia.animales.conexion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Conexion {
    List<Animal> datos= new ArrayList<>();

    File file =new File("Animales.csv");
    public void leerCsv (){
        try{
            FileReader FileRider= new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(FileRider);
            bufferedReader.readLine();
            String fila;

            while((fila=bufferedReader.readLine()) != null){
                String valores[]= fila.split(",");
                datos.add(new Animal(valores[0],valores[1],valores[2],valores[3],valores[4]));
            }
        } catch (IOException e ){}
    }

    public List<Animal> getDatos() {
        return datos;
    }
}
