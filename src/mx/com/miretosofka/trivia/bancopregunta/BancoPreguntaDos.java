package mx.com.miretosofka.trivia.bancopregunta;

import java.util.Random;

public class BancoPreguntaDos extends Pregunta {

    public String correcta = " ";
    public String informacion;

    public String nivelDos() {

        Pregunta preguntaUno = new Pregunta();
        preguntaUno.agregarPregunta("¿A que jugador de futbol le dicen el VICHO?", "A. Lionel Messi",
                "B. Rhonaldinho", "C. Cristiano Ronaldo", "D. Kylian Mbappe", "C", 150);

        Pregunta preguntaDos = new Pregunta();
        preguntaDos.agregarPregunta("¿Que famoso filosofo, fue maestro de Alejandro Magno?", "A. Socrates",
                "B. Platon", "C. Aristoteles", "D. Descartes", "C", 150);

        Pregunta preguntaTres = new Pregunta();
        preguntaTres.agregarPregunta("¿Cual es el nombre del villano principal del señor de los anillos?", "A. Gandalf",
                "B. Saruman", "C. Frodo", "D. Sauron", "D", 150);

        Pregunta preguntaCuatro = new Pregunta();
        preguntaCuatro.agregarPregunta("¿Cual es el hueso mas grande del cuerpo humano?", "A. Femur",
                "B. Perone", "C. Esternocleidomastoideo", "D. Torax", "A", 150);

        Pregunta preguntaCinco = new Pregunta();
        preguntaCinco.agregarPregunta("¿Cual es el rio mas largo del mundo?", "A. Rio Nilo",
                "B. Rio Amazonas", "C. Rio Danubio", "D. Rio Ganges", "B", 150);


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