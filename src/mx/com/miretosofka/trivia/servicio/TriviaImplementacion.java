package mx.com.miretosofka.trivia.servicio;

import mx.com.miretosofka.trivia.entidades.Persona;
import mx.com.miretosofka.trivia.persistencia.Conexion;
import mx.com.miretosofka.trivia.persistencia.Persistencia;

public class TriviaImplementacion implements Trivia {

    private final Conexion conexion;

    public TriviaImplementacion() {
        this.conexion = new Persistencia();
    }

    @Override
    public void guardarNombreJugador(String nombreJugador) {

        Persona usuario = new Persona(nombreJugador);
        boolean agregar = false;
        try {
            agregar = conexion.existe(NOMBRE_RECURSO);
            conexion.escribrir(usuario, NOMBRE_RECURSO, agregar);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void iniciarPersistencia() {
        try {
            if (this.conexion.existe(NOMBRE_RECURSO)) {
                conexion.borrar(NOMBRE_RECURSO);
                conexion.crear(NOMBRE_RECURSO);
            } else {
                conexion.crear(NOMBRE_RECURSO);
            }
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }
}