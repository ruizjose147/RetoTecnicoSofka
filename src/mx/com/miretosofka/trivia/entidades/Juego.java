package mx.com.miretosofka.trivia.entidades;

import mx.com.miretosofka.trivia.bancopregunta.*;
import mx.com.miretosofka.trivia.servicio.TriviaImplementacion;

import java.util.Scanner;

public class Juego {

    public int puntajeFinal;

    public int iniciarJuego(String usuario) {

        this.puntajeFinal = 0;
        System.out.println("Primera Pregunta");
        int nivelUno = this.nivelUno();
        if (nivelUno == 0) {
            this.puntajeFinal = 0;
            this.puntuacion(usuario, this.puntajeFinal);
            return 0;
        }

        if (nivelUno == 2) {
            this.puntuacion(usuario, this.puntajeFinal);
            return 0;
        }
        this.puntajeFinal += 100;

        System.out.println("Segunda Pregunta");
        int nivelDos = this.nivelDos();
        if (nivelDos == 0) {
            this.puntajeFinal = 0;
            this.puntuacion(usuario, this.puntajeFinal);
            return 0;
        }
        if (nivelDos == 2) {
            this.puntajeFinal += 0;
            this.puntuacion(usuario, this.puntajeFinal);
            return 0;
        } else {
            this.puntajeFinal += 150;
        }

        System.out.println("Tercera Pregunta");
        int nivelTres = this.nivelTres();
        if (nivelTres == 0) {
            this.puntajeFinal = 0;
            this.puntuacion(usuario, this.puntajeFinal);
            return 0;
        }
        if (nivelTres == 2) {
            this.puntajeFinal += 0;
            this.puntuacion(usuario, this.puntajeFinal);
            return 0;
        } else {
            this.puntajeFinal += 200;
        }

        System.out.println("Cuarta Pregunta");
        int nivelCuatro = this.nivelCuatro();
        if (nivelCuatro == 0) {
            this.puntajeFinal = 0;
            this.puntuacion(usuario, this.puntajeFinal);
            return 0;
        }
        if (nivelCuatro == 2) {
            this.puntajeFinal += 0;
            this.puntuacion(usuario, this.puntajeFinal);
            return 0;
        } else {
            this.puntajeFinal += 250;
        }

        System.out.println("Ultima Pregunta, Por el Premio Mayor");
        int nivelCinco = this.nivelCinco();
        if (nivelCinco == 0) {
            this.puntajeFinal = 0;
            this.puntuacion(usuario, this.puntajeFinal);
            return 0;
        }
        if (nivelCinco == 2) {
            this.puntajeFinal += 0;
            this.puntuacion(usuario, this.puntajeFinal);
            return 0;
        } else {
            this.puntajeFinal += 300;
        }

        System.out.println("----FELICIDADES GANASTE EL PREMIO MAYOR----");
        this.puntuacion(usuario, this.puntajeFinal);
        return 1;
    }

    public int nivelUno() {

        Scanner usuario = new Scanner(System.in);
        BancoPreguntaUno bancoPreguntaUno = new BancoPreguntaUno();
        String primeraPregunta = bancoPreguntaUno.nivelUno();

        int validadcion = 0;
        int comprobar = -1;
        while (comprobar != 3) {

            String respuesta = usuario.nextLine();
            Pregunta preguntaDos = new Pregunta();
            String resultado = preguntaDos.evaluarRespuesta(primeraPregunta, respuesta);
            System.out.println(resultado);
            validadcion = -1;
            if (resultado.equalsIgnoreCase("Respuesta incorrecta")) {
                validadcion = 0;
            }
            if (resultado.equalsIgnoreCase("El usuario se retira")) {
                validadcion = 2;
            }
            if (resultado.equalsIgnoreCase("Respuesta correcta")) {
                validadcion = 1;
            }
            switch (validadcion) {
                case -1:
                    comprobar = 1;
                    bancoPreguntaUno.imprimirPregunta();
                    break;
                default:
                    comprobar = 3;
                    break;
            }
        }
        return validadcion;
    }

    public int nivelDos() {

        Scanner usuario = new Scanner(System.in);
        BancoPreguntaDos bancoPreguntaDos = new BancoPreguntaDos();
        String segundaPregunta = bancoPreguntaDos.nivelDos();

        int validadcion = -1;
        int comprobar = -1;
        while (comprobar != 3) {
            String respuesta = usuario.nextLine();
            Pregunta preguntaDos = new Pregunta();
            String resultado = preguntaDos.evaluarRespuesta(segundaPregunta, respuesta);
            System.out.println(resultado);
            validadcion = -1;
            if (resultado.equalsIgnoreCase("Respuesta incorrecta")) {
                validadcion = 0;
            }
            if (resultado.equalsIgnoreCase("El usuario se retira")) {
                validadcion = 2;
            }
            if (resultado.equalsIgnoreCase("Respuesta correcta")) {
                validadcion = 1;
            }
            switch (validadcion) {
                case -1:
                    comprobar = 1;
                    bancoPreguntaDos.imprimirPregunta();
                    break;
                default:
                    comprobar = 3;
                    break;
            }
        }
        return validadcion;
    }

    public int nivelTres() {

        Scanner usuario = new Scanner(System.in);
        BancoPreguntaTres bancoPreguntaTres = new BancoPreguntaTres();
        String terceraPregunta = bancoPreguntaTres.nivelTres();

        int validadcion = 0;
        int comprobar = -1;
        while (comprobar != 3) {
            validadcion = -1;
            ;
            String respuesta = usuario.nextLine();
            Pregunta preguntaTres = new Pregunta();
            String resultado = preguntaTres.evaluarRespuesta(terceraPregunta, respuesta);
            System.out.println(resultado);
            if (resultado.equalsIgnoreCase("Respuesta incorrecta")) {
                validadcion = 0;
            }
            if (resultado.equalsIgnoreCase("El usuario se retira")) {
                validadcion = 2;
            }
            if (resultado.equalsIgnoreCase("Respuesta correcta")) {
                validadcion = 1;
            }
            switch (validadcion) {
                case -1:
                    comprobar = 1;
                    bancoPreguntaTres.imprimirPregunta();
                    break;
                default:
                    comprobar = 3;
                    break;
            }
        }
        return validadcion;
    }

    public int nivelCuatro() {

        Scanner usuario = new Scanner(System.in);
        BancoPreguntaCuatro bancoPreguntaCuatro = new BancoPreguntaCuatro();
        String cuartaPregunta = bancoPreguntaCuatro.nivelCuatro();

        int validadcion = 0;
        int comprobar = -1;
        while (comprobar != 3) {
            validadcion = -1;
            String respuesta = usuario.nextLine();
            Pregunta preguntaCuatro = new Pregunta();
            String resultado = preguntaCuatro.evaluarRespuesta(cuartaPregunta, respuesta);
            System.out.println(resultado);
            if (resultado.equalsIgnoreCase("Respuesta incorrecta")) {
                validadcion = 0;
            }
            if (resultado.equalsIgnoreCase("El usuario se retira")) {
                validadcion = 2;
            }
            if (resultado.equalsIgnoreCase("Respuesta correcta")) {
                validadcion = 1;
            }
            switch (validadcion) {
                case -1:
                    comprobar = 1;
                    bancoPreguntaCuatro.imprimirPregunta();
                    break;
                default:
                    comprobar = 3;
                    break;
            }
        }
        return validadcion;
    }

    public int nivelCinco() {

        Scanner usuario = new Scanner(System.in);
        BancoPreguntaCinco bancoPreguntaCinco = new BancoPreguntaCinco();
        String quintaPregunta = bancoPreguntaCinco.nivelCinco();

        int validadcion = 0;
        int comprobar = -1;
        while (comprobar != 3) {
            validadcion = -1;
            String respuesta = usuario.nextLine();
            Pregunta preguntaCinco = new Pregunta();
            String resultado = preguntaCinco.evaluarRespuesta(quintaPregunta, respuesta);
            System.out.println(resultado);
            if (resultado.equalsIgnoreCase("Respuesta incorrecta")) {
                validadcion = 0;
            }
            if (resultado.equalsIgnoreCase("El usuario se retira")) {
                validadcion = 2;
            }
            if (resultado.equalsIgnoreCase("Respuesta correcta")) {
                validadcion = 1;
            }
            if (resultado.equalsIgnoreCase("Selecciona una opcion corecta")) {
                validadcion = -1;
            }

            switch (validadcion) {
                case -1:
                    comprobar = 1;
                    bancoPreguntaCinco.imprimirPregunta();
                    break;
                default:
                    comprobar = 3;
                    break;
            }
        }
        return validadcion;
    }

    public void puntuacion(String usuario, int puntajeFinal) {
        System.out.println(usuario + " Tu puntaje fue de: " + puntajeFinal);
    }

    public void iniciarConexion() {
        TriviaImplementacion triviaImplementacion = new TriviaImplementacion();
        triviaImplementacion.iniciarPersistencia();
    }
}