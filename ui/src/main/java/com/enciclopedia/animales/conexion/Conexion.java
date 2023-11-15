package com.enciclopedia.animales.conexion;

import com.enciclopedia.animales.models.Animal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Conexion {
    List<Animal> datos= new ArrayList<>();

    public void leerCsv (){
        // Establecemos la ruta absoluta del CSV
        String ruta = System.getProperty("user.dir") +
                "/ui/src/main/java/com/enciclopedia/animales/conexion/Animales.csv";

        File file =new File(ruta);

        try{
            // Cargamos en memoria el archivo
            FileReader FileRider= new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(FileRider);

            // Evitamos leer los cabezales
            bufferedReader.readLine();

            String fila;

            while((fila = bufferedReader.readLine()) != null){
                String[] valores = fila.split(",");  // Separamos los valores por comas

                // Añadimos los valores a la lista
              /* datos.add(new Animal(valores[0],valores[1],valores[2],valores[3],valores[4],valores[5],valores[6],
                        valores[7],valores[8],valores[9]));*/
            }

        } catch (IOException e ){
            System.out.println("Ha ocurrido un error al cargar el CSV");
        }
    }

    public List<Animal> getDatos() {
        return datos;
    }


}
