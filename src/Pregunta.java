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
                           String opcionC, String opcionD, String correcta, double puntaje){
        this.pregunta = pregunta;
        this.opcionA = opcionA;
        this.opcionB = opcionB;
        this.opcionC = opcionC;
        this.opcionD = opcionD;
        this.correcta = correcta;
        this.puntaje = puntaje;
    }

    public String evaluarRespuesta(String correcta, String usuario){
        this.correcta = correcta;
        if(correcta.equalsIgnoreCase(usuario))
            return "respuesta correcta";
        if(usuario.equalsIgnoreCase("R")){
           return "El usuario se retira";
        }
        else
            return "Respuesta incorrecta";
    }

    public String getPregunta() {
        return pregunta;
    }

    public String getOpcionA() {
        return opcionA;
    }

    public String getOpcionB() {
        return opcionB;
    }

    public String getOpcionC() {
        return opcionC;
    }

    public String getOpcionD() {
        return opcionD;
    }

    public String getCorrecta() {
        return correcta;
    }

    public double getPuntaje() {
        return puntaje;
    }

    @Override
    public String toString() {
        return "Por " + puntaje + " puntos" + "\n" + pregunta + "\n" + opcionA + "\n" + opcionB +
                "\n" + opcionC + "\n" + opcionD;
    }
}
