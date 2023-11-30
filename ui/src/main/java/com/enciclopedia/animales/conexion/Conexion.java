package com.enciclopedia.animales.conexion;

import com.enciclopedia.animales.models.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Conexion {
    private static Conexion instancia = null;

    // Establecemos la ruta absoluta del CSV
    private String ruta = System.getProperty("user.dir") +
            "/ui/src/main/java/com/enciclopedia/animales/conexion/Animales.csv";

    private File file =new File(ruta);

    List<Usuario> usuarios = new ArrayList<>();

    List<Anelido> anelidos= new ArrayList<>();
    List<Anfibio> anfibios = new ArrayList<>();
    List<Aracnido> aracnidos= new ArrayList<>();
    List<Ave> aves= new ArrayList<>();
    List<Crustaceo> crustaceos= new ArrayList<>();
    List<Insecto> insectos= new ArrayList<>();
    List<Mamifero> mamiferos= new ArrayList<>();
    List<Pez> peces= new ArrayList<>();
    List<Reptil> reptiles= new ArrayList<>();

    List<Animal> favoritos = new ArrayList<>();

    private Conexion() {
        leerAnimales();
        leerUsuarios();
    }

    public static Conexion getInstancia(){
        if (instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }

    public void leerAnimales(){
        try{
            // Cargamos en memoria el archivo
            FileReader FileRider= new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(FileRider);

            // Evitamos leer los cabezales
            bufferedReader.readLine();

            String fila;

            while((fila = bufferedReader.readLine()) != null){
                String[] valores = fila.replace("\"", "").split("\\|");  // Separamos los valores por comas

                // Leemos la categoría
                switch (valores[0]) {
                    case "Anélidos" -> {
                        Anelido anelido = new Anelido(valores[2], valores[1], valores[3], valores[4], valores[5], valores[6], valores[7], valores[8], valores[9], valores[10]);
                        anelidos.add(anelido);
                        if (valores[11].equals("1")) {
                            favoritos.add(anelido);
                        }
                    }
                    case "Anfibios" -> {
                        Anfibio anfibio = new Anfibio(valores[2], valores[1], valores[3], valores[4], valores[5], valores[6], valores[7], valores[8], valores[9], valores[10]);
                        anfibios.add(anfibio);
                        if (valores[11].equals("1")) {
                            favoritos.add(anfibio);
                        }
                    }
                    case "Arácnidos" -> {
                        Aracnido aracnido = new Aracnido(valores[2], valores[1], valores[3], valores[4], valores[5], valores[6], valores[7], valores[8], valores[9], valores[10]);
                        aracnidos.add(aracnido);
                        if (valores[11].equals("1")) {
                            favoritos.add(aracnido);
                        }
                    }
                    case "Aves" -> {
                        Ave ave = new Ave(valores[2], valores[1], valores[3], valores[4], valores[5], valores[6], valores[7], valores[8], valores[9], valores[10]);
                        aves.add(ave);
                        if (valores[11].equals("1")) {
                            favoritos.add(ave);
                        }
                    }
                    case "Crustáceos" -> {
                        Crustaceo crustaceo = new Crustaceo(valores[2], valores[1], valores[3], valores[4], valores[5], valores[6], valores[7], valores[8], valores[9], valores[10]);
                        crustaceos.add(crustaceo);
                        if (valores[11].equals("1")) {
                            favoritos.add(crustaceo);
                        }
                    }
                    case "Insectos" -> {
                        Insecto insecto = new Insecto(valores[2], valores[1], valores[3], valores[4], valores[5], valores[6], valores[7], valores[8], valores[9], valores[10]);
                        insectos.add(insecto);
                        if (valores[11].equals("1")) {
                            favoritos.add(insecto);
                        }
                    }
                    case "Mamíferos" -> {
                        Mamifero mamifero = new Mamifero(valores[2], valores[1], valores[3], valores[4], valores[5], valores[6], valores[7], valores[8], valores[9], valores[10]);
                        mamiferos.add(mamifero);
                        if (valores[11].equals("1")) {
                            favoritos.add(mamifero);
                        }
                    }
                    case "Peces" -> {
                        Pez pez = new Pez(valores[2], valores[1], valores[3], valores[4], valores[5], valores[6], valores[7], valores[8], valores[9], valores[10]);
                        peces.add(pez);
                        if (valores[11].equals("1")) {
                            favoritos.add(pez);
                        }
                    }
                    case "Reptiles" -> {
                        Reptil reptil = new Reptil(valores[2], valores[1], valores[3], valores[4], valores[5], valores[6], valores[7], valores[8], valores[9], valores[10]);
                        reptiles.add(reptil);
                        if (valores[11].equals("1")) {
                            favoritos.add(reptil);
                        }
                    }
                }
            }

        } catch (IOException e ){
            System.out.println("Ha ocurrido un error al cargar los animales");
        }
    }

    private void leerUsuarios() {
        // Establecemos la ruta absoluta del CSV
        String ruta = System.getProperty("user.dir") +
                "/ui/src/main/java/com/enciclopedia/animales/conexion/usuarios.csv";

        File file =new File(ruta);

        try{
            // Cargamos en memoria el archivo
            FileReader FileRider= new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(FileRider);

            // Evitamos leer los cabezales
            bufferedReader.readLine();

            String fila;

            while((fila = bufferedReader.readLine()) != null){
                String[] valores = fila.replaceAll("\"", "").split("\\|");  // Separamos los valores por comas

                Usuario usuario = new Usuario(valores[0], valores[1]);

                usuarios.add(usuario);
            }

        } catch (IOException e ){
            System.out.println("Ha ocurrido un error al cargar los usuarios");
        }
    }

    public List<Anelido> getAnelidos() {
        return anelidos;
    }

    public List<Anfibio> getAnfibios() {
        return anfibios;
    }

    public List<Aracnido> getAracnidos() {
        return aracnidos;
    }

    public List<Ave> getAves() {
        return aves;
    }

    public List<Crustaceo> getCrustaceos() {
        return crustaceos;
    }

    public List<Insecto> getInsectos() {
        return insectos;
    }

    public List<Mamifero> getMamiferos() {
        return mamiferos;
    }

    public List<Pez> getPeces() {
        return peces;
    }

    public List<Reptil> getReptiles() {
        return reptiles;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public List<Animal> getFavoritos() {
        return favoritos;
    }

    public void anadirFavorito(Animal animal) {
        if (!favoritos.contains(animal)) {
            favoritos.add(animal);

            // Cargamos en memoria el archivo
            try {
                FileReader FileRider = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(FileRider);

                // Evitamos leer los cabezales
                String cabezal = bufferedReader.readLine();

                String fila;

                List<String> filas = new ArrayList<>();
                filas.add(cabezal);

                while ((fila = bufferedReader.readLine()) != null) {
                    if (fila.contains(animal.getNombreAnimal())) {
                        fila = fila.replaceAll("0", "1");
                    }
                    filas.add(fila);
                }

                // Escribimos en el archivo
                bufferedReader.close();
                FileRider.close();

                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                bufferedWriter.write(String.join("\n", filas));
                bufferedWriter.close();

            } catch (IOException e) {
                System.out.println("Ha ocurrido un error al cargar los animales");
            }
        }
    }

    public void eliminarFavorito(Animal animal) {
        if (favoritos.contains(animal)) {
            favoritos.remove(animal);

            // Cargamos en memoria el archivo
            try {
                FileReader FileRider = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(FileRider);

                // Evitamos leer los cabezales
                String cabezal = bufferedReader.readLine();

                String fila;

                List<String> filas = new ArrayList<>();
                filas.add(cabezal);

                while ((fila = bufferedReader.readLine()) != null) {
                    if (fila.contains(animal.getNombreAnimal())) {
                        fila = fila.replace('1', '0');
                    }
                    filas.add(fila);
                }

                // Escribimos en el archivo
                bufferedReader.close();
                FileRider.close();

                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                bufferedWriter.write(String.join("\n", filas));
                bufferedWriter.close();

            } catch (IOException e) {
                System.out.println("Ha ocurrido un error al cargar los animales");
            }
        }
    }
}
