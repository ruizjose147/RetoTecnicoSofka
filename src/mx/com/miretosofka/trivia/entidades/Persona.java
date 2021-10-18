package mx.com.miretosofka.trivia.entidades;

import mx.com.miretosofka.trivia.servicio.TriviaImplementacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Persona {

    private String usuario;
    private double premio;
    private List<String> listPeronas = new ArrayList<String>();
    private static int idPersona;

    public Persona() {

    }

    public Persona(String usuario) {
        this.usuario = usuario;
    }

    public String nombreUsuraio() {

        Scanner scanner2 = new Scanner(System.in);
        String validarNombre = "";
        while (validarNombre.isEmpty()) {
            System.out.println("Ingrese Su Nombre de Usuario");
            String nombreUsuario = scanner2.nextLine();
            if (nombreUsuario.isEmpty()) {
                System.out.println("Debe Ingresar Un Nombre De Usuario");
            } else {
                validarNombre = nombreUsuario;
            }
        }
        return validarNombre;
    }


    public void agregaUsuario(String nombre) {
        int tamañoList = listPeronas.size();
        if (listPeronas.contains(nombre)) {
            System.out.println("El usuario ya esta registrado");
        } else {
            listPeronas.add(nombre);
        }
    }

    public void desplegarUsuarios() {
        List<String> listaDeplegable = this.listPeronas;
        if (listaDeplegable.isEmpty()) {
            System.out.println("No hay registro de usuarios aun");
        }
        int contador = 1;
        for (String usuario : listaDeplegable) {
            System.out.println(contador + ": " + usuario);
            contador += 1;
        }
    }

    public void agregarJugador(String persona) {
        TriviaImplementacion triviaImplementacion = new TriviaImplementacion();
        triviaImplementacion.guardarNombreJugador(persona);
    }

    @Override
    public String toString() {
        return "Nombre del usuario: " + usuario;
    }
}