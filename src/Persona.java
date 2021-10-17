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


    public List agregaUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre de usuario");
        String nombreUsuario = scanner.nextLine();
        this.listPeronas.add(nombreUsuario);
        return listPeronas;
    }

    public void desplegarUsuarios(){
        List<String> listaDeplegable=this.listPeronas;
        if(listaDeplegable.isEmpty()){
            System.out.println("No hay registro de usuarios aun");
        }
        int contador =1;
        for (String usuario:listaDeplegable){
            System.out.println(contador + usuario);
            contador=+1;
        }
    }

    public String getUsuario() {
        return usuario;
    }
}
