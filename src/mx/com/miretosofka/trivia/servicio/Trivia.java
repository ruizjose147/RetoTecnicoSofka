package mx.com.miretosofka.trivia.servicio;

public interface Trivia {
    String NOMBRE_RECURSO = "ResultadoTrivia.txt";

    void guardarNombreJugador(String nombreJugador);

    void iniciarPersistencia();
}
