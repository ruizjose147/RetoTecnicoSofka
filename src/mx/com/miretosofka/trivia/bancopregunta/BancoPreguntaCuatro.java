package mx.com.miretosofka.trivia.bancopregunta;

import java.util.Random;

public class BancoPreguntaCuatro extends Pregunta {

    public String correcta = " ";
    public String informacion;

    public String nivelCuatro() {

        Pregunta preguntaUno = new Pregunta();
        preguntaUno.agregarPregunta("¿En que año gano Roger Federer su primer Grand Slam?",
                "A. 2000", "B. 2005", "C. 2003", "D. 2004",
                "C", 250);

        Pregunta preguntaDos = new Pregunta();
        preguntaDos.agregarPregunta("¿Cómo comenzó la Primera Guerra Mundial?",
                "A. Con el intento de asesinato del príncipe belga Leopold",
                "B. Con el asesinato del archiduque Francisco Fernando",
                "C. Con la batalla de Gallipoli",
                "D. Con la caida del imperio Otomano", "B", 250);

        Pregunta preguntaTres = new Pregunta();
        preguntaTres.agregarPregunta("¿Como se llama el actor que interpreta a Severus Snape en Harry Potter?",
                "A. Alan Rickman", "B. Gary Oldman", "C. Jason Isaacs",
                "D. Richard Harris", "A", 250);

        Pregunta preguntaCuatro = new Pregunta();
        preguntaCuatro.agregarPregunta("¿Cuantos cromosomas tiene el ser humano?", "A.  45",
                "47", "C. 46", "D. 35", "A", 250);

        Pregunta preguntaCinco = new Pregunta();
        preguntaCinco.agregarPregunta("¿En que continente esta ubicado Surinam?", "A. Asia",
                "B. America del sur", "C. Europa", "D. Africa", "B", 250);

        Random random = new Random();
        int preguntaNumero = random.nextInt(5) + 1;
        switch (preguntaNumero) {
            case 1:
                Pregunta primera = preguntaUno;
                informacion = primera.toString();
                System.out.println(primera.toString());
                this.correcta = preguntaUno.getCorrecta();
                break;
            case 2:
                Pregunta segunda = preguntaDos;
                System.out.println(segunda.toString());
                informacion = segunda.toString();
                this.correcta = preguntaDos.getCorrecta();
                break;
            case 3:
                Pregunta tercera = preguntaTres;
                System.out.println(tercera.toString());
                informacion = tercera.toString();
                this.correcta = preguntaTres.getCorrecta();
                break;
            case 4:
                Pregunta cuarta = preguntaCuatro;
                System.out.println(cuarta.toString());
                informacion = cuarta.toString();
                this.correcta = preguntaCuatro.getCorrecta();
                break;
            case 5:
                Pregunta quinta = preguntaCinco;
                System.out.println(quinta.toString());
                informacion = quinta.toString();
                this.correcta = preguntaCinco.getCorrecta();
                break;
            default:
                System.out.println("selecion no valida");
                break;
        }
        return this.correcta;
    }

    public void imprimirPregunta() {
        System.out.println(this.informacion);
    }
}
