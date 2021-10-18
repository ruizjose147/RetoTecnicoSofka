package mx.com.miretosofka.trivia.persistencia;

import mx.com.miretosofka.trivia.entidades.Persona;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Persistencia implements Conexion {

    @Override
    public boolean existe(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        return archivo.exists();
    }

    @Override
    public List<Persona> listar(String nombreArchivo) {
        var archivo = new File(nombreArchivo);
        List<Persona> personas = new ArrayList<>();
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            while (linea != null) {
                var persona = new Persona(linea);
                personas.add(persona);
                linea = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return personas;
    }

    @Override
    public void escribrir(Persona persona, String nombreArchivo, boolean anexar) {
        var archivo = new File(nombreArchivo);
        try {
            var salida = new PrintWriter(new FileWriter(archivo, anexar));

            salida.println(persona.toString());
            salida.close();
            System.out.println("Se ha escrito informacion al archivo: " + persona);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void crear(String nombreArchivo) {
        var archivo = new File(nombreArchivo);
        try {
            var salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void borrar(String nombreRecurso) {
        var archivo = new File(nombreRecurso);
        if (archivo.exists()) {
            archivo.delete();
        }
    }
}