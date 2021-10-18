package mx.com.miretosofka.trivia.bancopregunta;

import java.util.Random;

public class BancoPreguntaUno extends Pregunta {

    public String correcta = " ";
    public String informacion;

    public String nivelUno() {

        Pregunta preguntaUno = new Pregunta();
        preguntaUno.agregarPregunta("¿Que equipo ha ganado mas copas del mundo?", "A. Colombia",
                "B. Argentina", "C. Peru", "D. Brasil", "D", 100);

        Pregunta preguntaDos = new Pregunta();
        preguntaDos.agregarPregunta("¿Cuantos henanos encontro Blanca Nieves en el bosque?", "A. 5",
                "B. 7", "C. 9", "D. 101", "B", 100);

        Pregunta preguntaTres = new Pregunta();
        preguntaTres.agregarPregunta("La composicion quimica del agua es:", "A. HO2",
                "B. 2H2O", "C. 2HO", "D. H2O", "D", 100);

        Pregunta preguntaCuatro = new Pregunta();
        preguntaCuatro.agregarPregunta("El autor de CIEN AÑOS DE SOLEDAD es:", "A. Gabriel Garcia Marquez",
                "B. J.K. Rowling", "C. J.R.R. Tolkien", "D. David Sanchez Juliao", "A", 100);

        Pregunta preguntaCinco = new Pregunta();
        preguntaCinco.agregarPregunta("¿Nombre del libertador de Colombia?", "A. Cristobal Colon",
                "B. Napoleon Bonaparte", "C. Simon Bolivar", "D. Diomedez Diaz", "C", 100);

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