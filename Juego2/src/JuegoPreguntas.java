import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JuegoPreguntas extends JFrame {
    ImagenFondo Fondo = new ImagenFondo();
    private static final long serialVersionUID = 1L;
    private int puntuacion = 0;
    private int preguntaActual = 0;

    private String[] preguntas = {
            "¿Cuántas patas tiene una araña?",
            "¿Cuál es el mamífero más grande del mundo?",
            "¿Qué animal es conocido por su capacidad de camuflaje?",
            "¿Cuántos corazones tiene un pulpo?",
            "¿Qué sonido hace el león?",
    };

    private String[] opciones = {
            "A) 6 patas, B) 8 patas, C) 10 patas",
            "A) Elefante, B) Ballena azul, C) Jirafa",
            "A) Camaleón, B) León, C) Elefante",
            "A) 1 corazón, B) 2 corazones, C) 3 corazones",
            "A) Maulla, B) Ruge, C) Ronronea"
    };

    private char[] respuestas = {'B', 'B', 'C', 'B','B'};

    private JLabel labelPregunta;
    private JRadioButton opcionA, opcionB, opcionC;
    private ButtonGroup grupoOpciones;
    private JButton botonSiguiente;

    public JuegoPreguntas() {
        this.setContentPane(Fondo);
        setTitle("Juego de Preguntas de Animales");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear componentes
        labelPregunta = new JLabel(preguntas[preguntaActual]);
        opcionA = new JRadioButton(opciones[preguntaActual].split(",")[0]);
        opcionB = new JRadioButton(opciones[preguntaActual].split(",")[1]);
        opcionC = new JRadioButton(opciones[preguntaActual].split(",")[2]);
        grupoOpciones = new ButtonGroup();
        botonSiguiente = new JButton("Siguiente");

        // Configurar el diseño
        setLayout(new GridLayout(6, 1));

        // Agregar componentes al contenedor
        add(labelPregunta);
        add(opcionA);
        add(opcionB);
        add(opcionC);
        add(botonSiguiente);

        // Agregar radio buttons al grupo
        grupoOpciones.add(opcionA);
        grupoOpciones.add(opcionB);
        grupoOpciones.add(opcionC);

        // Configurar acciones de los botones
        botonSiguiente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verificarRespuesta();
                mostrarSiguientePregunta();
            }
        });
    }

    private void verificarRespuesta() {
        char respuestaSeleccionada = ' ';
        if (opcionA.isSelected()) {
            respuestaSeleccionada = 'A';
        } else if (opcionB.isSelected()) {
            respuestaSeleccionada = 'B';
        } else if (opcionC.isSelected()) {
            respuestaSeleccionada = 'C';
        }

        if (respuestaSeleccionada == respuestas[preguntaActual]) {
            puntuacion++;
        }
    }

    private void mostrarSiguientePregunta() {
        preguntaActual++;

        if (preguntaActual < preguntas.length) {
            labelPregunta.setText(preguntas[preguntaActual]);
            opcionA.setText(opciones[preguntaActual].split(",")[0]);
            opcionB.setText(opciones[preguntaActual].split(",")[1]);
            opcionC.setText(opciones[preguntaActual].split(",")[2]);
            grupoOpciones.clearSelection();
        } else {
            // Fin del juego
            JOptionPane.showMessageDialog(this, "Fin del juego. Puntuación: " + puntuacion + "/" + preguntas.length);
            System.exit(0);
        }
    }

}
