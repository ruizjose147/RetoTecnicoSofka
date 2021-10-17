import java.util.Scanner;

public class Juego {

    public int puntajeFinal;

    public int iniciarJuego(String usuario){

        this.puntajeFinal=0;
        int nivelUno=this.nivelUno();
        if(nivelUno==0){
            this.puntajeFinal=0;
            return 0;
        }
        this.puntajeFinal+=100;
        int nivelDos=this.nivelDos();
        if(nivelDos==0){
            this.puntajeFinal=0;
            return 0;

        }
        this.puntajeFinal+=150;
        this.puntuacion(usuario,this.puntajeFinal);
        return 1;
    }


    public int nivelUno(){
        Scanner usuario = new Scanner(System.in);
        BancoPreguntaUno bancoPregunta = new BancoPreguntaUno();
        String primeraPregunta = bancoPregunta.nivelUno();
        String respuesta = usuario.nextLine();
        Pregunta preguntaUno = new Pregunta();
        String resultado = preguntaUno.evaluarRespuesta(primeraPregunta, respuesta);
        System.out.println(resultado);
        if(resultado.equalsIgnoreCase("Respuesta incorrecta"))
            return 0;

        return 1;
    }

    public int nivelDos(){
        Scanner usuario = new Scanner(System.in);
        BancoPreguntaDos bancoPreguntaDos = new BancoPreguntaDos();
        String segundaPregunta = bancoPreguntaDos.nivelDos();
        String respuesta = usuario.nextLine();
        Pregunta preguntaDos = new Pregunta();
        String resultado = preguntaDos.evaluarRespuesta(segundaPregunta, respuesta);
        System.out.println(resultado);
        if(resultado.equalsIgnoreCase("Respuesta incorrecta"))
            return 0;

        return 1;
    }

    public void puntuacion(String usuario, int puntajeFinal){
        System.out.println(usuario + " Tu puntaje fue de: " + puntajeFinal);
    }
}
