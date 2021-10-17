import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Juego juego = new Juego();
        Persona persona = new Persona();
        int option = -1;

        while (option!=0){
            try {
                System.out.println("-----Bienvenido a la TRIVIA-----");
                System.out.println("SELECCIONE UNA OPCION"
                        +"\n 1. Jugar."
                        +"\n 0. salir.");
                Scanner consola = new Scanner(System.in);
                option = consola.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("¿QUE QUIERES HACER? " +
                                "\n1. Iniciar Ronda" +
                                "\n2. mostrar lista" +
                                "\n0. Salir");
                        int firstSelection = consola.nextInt();
                        switch (firstSelection){
                            case 1:

                                Scanner scanner2 = new Scanner(System.in);
                                System.out.println("Ingrese su nombre de usuario");
                                String nombreUsuario = scanner2.nextLine();
                                persona.agregaUsuario(nombreUsuario);
                               int valor=juego.iniciarJuego(nombreUsuario);
                               if(valor==0){
                                   break;
                               }
                                break;
                            case 2:

                                persona.desplegarUsuarios();
                                break;
                            case 0:
                                System.out.println("Algo");
                                break;
                            default:
                                System.out.println("ss");
                                break;
                            }
                        case 0:
                        System.out.println("Salio del juego");
                        break;
                    default:
                        System.out.println("No seleccionaste una opcion valida");
                        break;

                }
            }catch (Exception e){
                System.out.println("No ingreses letras solo numero");
                option = 2;
            }
        }

        System.out.println("Muchas Gracias Hasta Pronto");
    }
}
