package mx.com.miretosofka.trivia.bancopregunta;

import java.util.Random;

public class BancoPreguntaCinco extends Pregunta {

    public String correcta = " ";
    public String informacion;

    public String nivelCinco() {

        Pregunta preguntaUno = new Pregunta();
        preguntaUno.agregarPregunta("¿Cuándo se realizaron los primeros Juegos Olímpicos?",
                "A. 1850", "B. 1896", "C. 1829",
                "D. 1930", "B", 300);

        Pregunta preguntaDos = new Pregunta();
        preguntaDos.agregarPregunta("¿En qué año cayo el Imperio Romano de Occidente?",
                "A. 572", "B. 476", "C. 387",
                "D. 457", "B", 300);

        Pregunta preguntaTres = new Pregunta();
        preguntaTres.agregarPregunta("¿Quien hizo la voz de Mufasa en el rey leon?",
                "A. James Earl Jones", "B. Jorge Gonzalez",
                "C. Eduardo Perez", "D. David Fernandez", "A", 300);

        Pregunta preguntaCuatro = new Pregunta();
        preguntaCuatro.agregarPregunta("¿En quimica que es la fusion?",
                "A. Una sustancia pasa de liquido a gaseoso",
                "B. Una sustancia pasa de liquido a solido",
                "C. Una sustancia pasa de solido a liquido",
                "D. Una sustancia pasa de solido a gaseoso", "C", 300);

        Pregunta preguntaCinco = new Pregunta();
        preguntaCinco.agregarPregunta("¿Cuál es la única ciudad que está en dos continentes distintos?",
                "A. Moscu", "B. Estambul", "C. Novosibirsk",
                "D. Perm", "B", 300);

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
