package mx.com.miretosofka.trivia.bancopregunta;

import java.util.Random;

public class BancoPreguntaTres extends Pregunta {

    public String correcta = " ";
    public String informacion;

    public String nivelTres() {

        Pregunta preguntaUno = new Pregunta();
        preguntaUno.agregarPregunta("¿En que año se jugo el primer Mundial de Futbol?", "A. 1935",
                "B. 1930", "C. 1829", "D. 1945", "B", 200);

        Pregunta preguntaDos = new Pregunta();
        preguntaDos.agregarPregunta("¿Qué inició la Segunda Guerra Mundial?",
                "A. La invacion de Alemania a Polonia",
                "B. La invacion de Alemania a Austria", "C. La invacion de Alemania a Fancia",
                "D. El bombardeo de Japon a Pearl Harbor", "A", 200);

        Pregunta preguntaTres = new Pregunta();
        preguntaTres.agregarPregunta("¿En que pelicula, Harry Potter libera a un elfo domestico?",
                "A. Harry Potter y el Misterio del Principe", "B. Harry Potter y la Camara de los secretos",
                "C. Harry Potter y el Prisionero de Azkaban", "D. Harry Potter y la Piedra Filosofal",
                "B", 200);

        Pregunta preguntaCuatro = new Pregunta();
        preguntaCuatro.agregarPregunta("¿Que es un viviparo?", "A. Alguien que es mas vivo que los demas",
                "B. Un animal que nace del utero de su madre", "C. Un animal que nace vivo",
                "D. Un animal que nace y se muere", "B", 200);

        Pregunta preguntaCinco = new Pregunta();
        preguntaCinco.agregarPregunta("¿Cuál es el país más grande del mundo?", "A. China",
                "B. Estados Unidos", "C. Rusia", "D. Canada", "C", 200);

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