package mx.com.miretosofka.trivia.bancopregunta;

public class Pregunta {

    private String pregunta;
    private String opcionA;
    private String opcionB;
    private String opcionC;
    private String opcionD;
    private String correcta;
    private double puntaje;

    public Pregunta() {

    }

    public void agregarPregunta(String pregunta, String opcionA, String opcionB,
                                String opcionC, String opcionD, String correcta, double puntaje) {
        this.pregunta = pregunta;
        this.opcionA = opcionA;
        this.opcionB = opcionB;
        this.opcionC = opcionC;
        this.opcionD = opcionD;
        this.correcta = correcta;
        this.puntaje = puntaje;
    }

    public String evaluarRespuesta(String correcta, String usuario) {

        this.correcta = correcta;
        String opciones[] = {"A", "B", "C", "D", "R"};
        String captura = "";
        for (int i = 0; i < opciones.length; i++) {
            if (opciones[i].equalsIgnoreCase(usuario)) {
                captura = usuario;
                break;
            } else {
                captura = "nula";

            }
        }

        if (correcta.equalsIgnoreCase(captura)) {
            return "respuesta correcta";
        }
        if (captura.equalsIgnoreCase("R")) {
            return "El usuario se retira";
        }
        if (captura.equalsIgnoreCase("nula")) {
            return "Selecciona una opcion corecta";
        } else {
            return "Respuesta incorrecta";
        }
    }

    public String getCorrecta() {
        return correcta;
    }

    @Override
    public String toString() {
        return "Juguemos por " + puntaje + " puntos" + "\n"
                + pregunta + "\n" + opcionA + "\n" + opcionB +
                "\n" + opcionC + "\n" + opcionD +
                "\nEn Cualquier momento preciona R para retirarte";
    }
}