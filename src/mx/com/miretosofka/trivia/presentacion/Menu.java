package mx.com.miretosofka.trivia.presentacion;

import mx.com.miretosofka.trivia.entidades.Juego;
import mx.com.miretosofka.trivia.entidades.Persona;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Juego juego = new Juego();
        Persona persona = new Persona();
        int option = -1;
        while (option != 0) {
            try {
                System.out.println("-----Bienvenido a la TRIVIA-----");
                System.out.println("SELECCIONE UNA OPCION"
                        + "\n 1. Jugar."
                        + "\n 0. salir.");
                Scanner consola = new Scanner(System.in);
                option = consola.nextInt();

                switch (option) {
                    case 1:
                        int option2 = -1;
                        juego.iniciarConexion();
                        while (option2 != 0) {

                            System.out.println("¿QUE QUIERES HACER? " +
                                    "\n1. Iniciar Ronda" +
                                    "\n2. mostrar lista" +
                                    "\n0. Volver");
                            int firstSelection = consola.nextInt();
                            switch (firstSelection) {
                                case 1:
                                    var nombreUsuario = persona.nombreUsuraio();
                                    persona.agregarJugador(nombreUsuario);
                                    persona.agregaUsuario(nombreUsuario);
                                    int valor = juego.iniciarJuego(nombreUsuario);
                                    if (valor == 0) {
                                        break;
                                    }
                                    break;
                                case 2:
                                    persona.desplegarUsuarios();
                                    break;
                                default:
                                    System.out.println("Seleciones una opcion valida");
                                    break;
                            }
                            System.out.println("Selecione una opcion" + "\n1.Para iniciar otro juego " + "\n0. Para salir");
                            option2 = consola.nextInt();
                        }
                    case 0:
                        System.out.println("Salio del juego");
                        break;
                    default:
                        System.out.println("No seleccionaste una opcion valida");
                        break;
                }
            } catch (Exception e) {
                System.out.println("No ingreses letras solo numero");
                option = 2;
            }
        }
        System.out.println("Muchas Gracias Hasta Pronto");
    }
}