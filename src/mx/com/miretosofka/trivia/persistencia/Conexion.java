package mx.com.miretosofka.trivia.persistencia;

import mx.com.miretosofka.trivia.entidades.Persona;

import java.util.List;

public interface Conexion {

    boolean existe(String Archivo);

    List<Persona> listar(String nombreArhchivo);

    void escribrir(Persona persona, String nombreArchivo, boolean anexar);

    void crear(String nombreArchivo);

    void borrar(String nombreArchivo);
}
