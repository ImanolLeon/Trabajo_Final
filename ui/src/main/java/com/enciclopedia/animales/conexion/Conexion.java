package com.enciclopedia.animales.conexion;

import com.enciclopedia.animales.models.*;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Conexion {
    private static Conexion instancia = null;

    // Establecemos la ruta absoluta del CSV
    private String ruta = System.getProperty("user.dir") +
            "/ui/src/main/java/com/enciclopedia/animales/conexion/Animales.csv";

    private File file = new File(ruta);

    List<Usuario> usuarios = new ArrayList<>();

    List<Anelido> anelidos = new ArrayList<>();
    List<Anfibio> anfibios = new ArrayList<>();
    List<Aracnido> aracnidos = new ArrayList<>();
    List<Ave> aves = new ArrayList<>();
    List<Crustaceo> crustaceos = new ArrayList<>();
    List<Insecto> insectos = new ArrayList<>();
    List<Mamifero> mamiferos = new ArrayList<>();
    List<Pez> peces = new ArrayList<>();
    List<Reptil> reptiles = new ArrayList<>();

    List<Animal> favoritos = new ArrayList<>();

    private Connection connection = null;

    private Conexion() {
        leerAnimales();
        leerUsuarios();
    }

    private static String URL = "jdbc:mysql://uvhf51x4ncr7pkep:QooGQjNgn9XZkh9iFLcp@b6g6tan4fbjow1j1fztn-mysql.services.clever-cloud.com:3306/b6g6tan4fbjow1j1fztn";
    private static String USER = "uvhf51x4ncr7pkep";
    private static String PASSWORD = "QooGQjNgn9XZkh9iFLcp";

    public Connection getConnection() {
        try {
            if (connection != null && connection.isClosed()) {
                return connection;
            }
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to database");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return connection;
    }

    public static Conexion getInstancia() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }

    public void leerAnimales() {
        Connection connection = getConnection();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("""
                        SELECT categoria.nombre_categoria, animal.*
                        FROM animal
                        INNER JOIN categoria
                        ON animal.id_categoria = categoria.id_categoria
                        ORDER BY categoria.nombre_categoria
                    """);

            while (resultSet.next()) {
                String nombreAnimal = resultSet.getString("nombre_animal");
                String numeroDePatas = resultSet.getString("numero_patas");
                String numeroOjos = resultSet.getString("numero_ojos");
                String familia = resultSet.getString("familia");
                String genero = resultSet.getString("genero");
                String respiracion = resultSet.getString("respiracion");
                String reproduccion = resultSet.getString("reproduccion");
                String habitat = resultSet.getString("habitad");
                String alimentacion = resultSet.getString("alimentacion");
                String urlImagen = resultSet.getString("rutaImagen");
                String urlGift = resultSet.getString("rutaGif");
                String urlSonido = resultSet.getString("rutaAudio");

                Animal animal = null;

                switch (resultSet.getString("nombre_categoria")) {
                    case "Anelidos":
                        animal = new Anelido(habitat, nombreAnimal, alimentacion, familia, genero, numeroDePatas,
                                numeroOjos, respiracion, reproduccion, urlImagen, urlGift, urlSonido);
                        anelidos.add((Anelido) animal);
                        break;
                    case "Anfibios":
                        animal = new Anfibio(habitat, nombreAnimal, alimentacion, familia, genero, numeroDePatas,
                                numeroOjos, respiracion, reproduccion, urlImagen, urlGift, urlSonido);
                        anfibios.add((Anfibio) animal);
                        break;
                    case "Aracnidos":
                        animal = new Aracnido(habitat, nombreAnimal, alimentacion, familia, genero, numeroDePatas,
                                numeroOjos, respiracion, reproduccion, urlImagen, urlGift, urlSonido);
                        aracnidos.add((Aracnido) animal);
                        break;
                    case "Aves":
                        animal = new Ave(habitat, nombreAnimal, alimentacion, familia, genero, numeroDePatas,
                                numeroOjos, respiracion, reproduccion, urlImagen, urlGift, urlSonido);
                        aves.add((Ave) animal);
                        break;
                    case "Crustaceos":
                        animal = new Crustaceo(habitat, nombreAnimal, alimentacion, familia, genero, numeroDePatas,
                                numeroOjos, respiracion, reproduccion, urlImagen, urlGift, urlSonido);
                        crustaceos.add((Crustaceo) animal);
                        break;
                    case "Insectos":
                        animal = new Insecto(habitat, nombreAnimal, alimentacion, familia, genero, numeroDePatas,
                                numeroOjos, respiracion, reproduccion, urlImagen, urlGift, urlSonido);
                        insectos.add((Insecto) animal);
                        break;
                    case "Mamiferos":
                        animal = new Mamifero(habitat, nombreAnimal, alimentacion, familia, genero, numeroDePatas,
                                numeroOjos, respiracion, reproduccion, urlImagen, urlGift, urlSonido);
                        mamiferos.add((Mamifero) animal);
                        break;
                    case "Peces":
                        animal = new Pez(habitat, nombreAnimal, alimentacion, familia, genero, numeroDePatas,
                                numeroOjos, respiracion, reproduccion, urlImagen, urlGift, urlSonido);
                        peces.add((Pez) animal);
                        break;
                    case "Reptiles":
                        animal = new Reptil(habitat, nombreAnimal, alimentacion, familia, genero, numeroDePatas,
                                numeroOjos, respiracion, reproduccion, urlImagen, urlGift, urlSonido);
                        reptiles.add((Reptil) animal);
                        break;
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void leerUsuarios() {
        Connection connection = getConnection();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM usuario");

            while (resultSet.next()) {
                String username = resultSet.getString("nombre_usuario");
                String contrasena = resultSet.getString("password");

                Usuario usuario = new Usuario(username, contrasena);
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
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
