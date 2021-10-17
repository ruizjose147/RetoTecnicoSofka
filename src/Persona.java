import com.sun.source.tree.NewArrayTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Persona {

    private String usuario;
    private double premio;
    private List<String>listPeronas = new ArrayList<String>();
    private static int idPersona;


    public Persona(){

    }

       public Persona(String usuario){
        this.usuario = usuario;
    }

    public String nombreUsuraio(){
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Ingrese su nombre de usuario");
        String nombreUsuario = scanner2.nextLine();
        return nombreUsuario;
    }

    public void agregaUsuario(String nombre) {
        int tamañoList=listPeronas.size();
         if(listPeronas.contains(nombre)){
                System.out.println("El usuario ya esta registrado");
            }
         else {
             listPeronas.add(nombre);
         }

        }

    public void desplegarUsuarios(){
        List<String> listaDeplegable=this.listPeronas;
        if(listaDeplegable.isEmpty()){
            System.out.println("No hay registro de usuarios aun");
        }
        int contador =1;
        for (String usuario:listaDeplegable){
            System.out.println(contador + ": "+ usuario);
            contador+=1;
        }
    }

    public String getUsuario() {
        return usuario;
    }

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.agregaUsuario("Jose");
        persona.agregaUsuario("Richard");

        System.out.println(persona.listPeronas);
    }
}
