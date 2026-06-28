import java.util.Scanner;

// Creamos la clase principal
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
        int rondasTotales = 5;
        boolean gol;

        int golesJugador1 = 0;
        int golesJugador2 = 0;
        //inicio del juego
        System.out.println("====================================");
        System.out.println("--- Inicia la Tanda de Penales ---");

        for (int ronda = 1; ronda <= rondasTotales; ronda++) {
            System.out.println("====================================");
            System.out.println("--- Ronda numero " + ronda + " ---");

            for (int jugador = 1; jugador <= 2; jugador++) {
                System.out.println("====================================");
                System.out.println("--- Turno del Jugador " + jugador + " ---");

                do {
                    mostrarOpciones();
                    System.out.print("Elija donde patear el penal: opcion ");
                    posicionPateador = sc.nextInt();

                    if (posicionPateador < 1 || posicionPateador > 3) {
                        System.out.println("Opcion invalida. Intente nuevamente.");
                    }

                } while (posicionPateador < 1 || posicionPateador > 3);

                posicionArquero = generarPosicionArquero();

                gol = validarPenal(posicionPateador, posicionArquero);

                System.out.println("Resultado del Jugador " + jugador);
                System.out.println("Posicion del pateador: " + posicionPateador);
                System.out.println("Posicion del arquero: " + posicionArquero);
                System.out.println("GOL: " + gol);

                if (gol) {
                    if (jugador == 1) {
                        golesJugador1++;
                    } else {
                        golesJugador2++;
                    }
                }
            }
        }

        System.out.println("====================================");
        System.out.println("          RESULTADO FINAL           ");
        System.out.println("====================================");
        System.out.println("Goles Jugador 1: " + golesJugador1);
        System.out.println("Goles Jugador 2: " + golesJugador2);

        if (golesJugador1 > golesJugador2) {
            System.out.println("Ha ganado el Jugador 1");
        } else if (golesJugador2 > golesJugador1) {
            System.out.println("Ha ganado el Jugador 2");
        } else {
            System.out.println("Ha terminado en empate");
        }

        sc.close();
    }
}
//fin del codigo
/* Realizado por:
Franco Gonzalez DNI: 47850662
Matias Ramirez DNI: 46274461
 */ 