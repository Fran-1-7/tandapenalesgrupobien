import java.util.Scanner;

// creamos la clase princopal
public class tandapenales1 {

    // Módulo que valida si el penal es gol o atajado
    public static boolean validarPenal(int posicionPateador, int posicionArquero) {
        return posicionPateador != posicionArquero;
    }

    // Módulo que genera la posición aleatoria del arquero
    public static int generarPosicionArquero() {
        return (int)(Math.random() * 3) + 1;
    }

    // Módulo que muestra las opciones posibles
    public static void mostrarOpciones() {
        System.out.println("Opciones donde patear el penal:");
        System.out.println("1. izquierda");
        System.out.println("2. centro");
        System.out.println("3. derecha");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int posicionPateador;
        int posicionArquero;
        int rondatotales = 5;
        boolean gol;

        //cotadores
        int golesJugador1 = 0;
        int golesJugador2 = 0;

        //bulce Rondas
        for (int ronda = 1; ronda <= rondatotales; ronda++) {
            System.out.println("====================================");
            System.out.println("====================================");
            System.out.println("--- Ronda numero " + ronda + " ---");
            System.out.println("===================================="); 
            //bucle para cada turno del jugador
            for (int jugador = 1; jugador <= 2; jugador++){
                System.out.println("====================================");
                System.out.println("--- turno del jugador " + jugador + " ---");

                mostrarOpciones();

                System.out.print("Elija donde patear el penal: Opcion ");
                posicionPateador = sc.nextInt();
                //validamos opciones
                    if (posicionPateador < 1 || posicionPateador > 3){
                        System.out.print("Pateaste afuera");
                    } else {
                            posicionArquero = generarPosicionArquero();

                            gol = validarPenal(posicionPateador, posicionArquero);

                            System.out.println("Resultado del Jugador " + jugador);
                            System.out.println("Posición del pateador: " + posicionPateador);
                            System.out.println("Posición del arquero: " + posicionArquero);
                            System.out.println("GOL: " + gol);

                            //contador de goles para ambos jugadores
                            if(gol){
                                if (jugador == 1) {
                                        golesJugador1 = golesJugador1 + 1;
                                    } else if (jugador == 2){
                                        golesJugador2 = golesJugador2 + 1;
                                }
                            }
                        }
                    }
            }

        System.out.println("====================================");
        System.out.println("          RESULTADO FINAL           ");
        System.out.println("====================================");
        System.out.println("Goles Jugador 1: " + golesJugador1);
        System.out.println("Goles Jugador 2: " + golesJugador2);
        //Decidimos el Ganador o empate
            if (golesJugador1 > golesJugador2) {
            System.out.println("Ha Ganado el Jugador 1");
            } else if (golesJugador2 > golesJugador1) {
                System.out.println("Ha Ganado el Jugador 1");
            } else {
                System.out.println("Ha terminado en empate");
            }

        sc.close();
    }
}
//Fin del código

/* Realizado por:
Franco Gonzalez DNI: 47850662
Matias Ramirez DNI: 46274461
 */ 