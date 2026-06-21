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
        boolean gol;

        for (int jugador = 1; jugador <= 2; jugador++) {

            System.out.println("=----------------------------------=");
            System.out.println("Turno del Jugador " + jugador);

            mostrarOpciones();

            System.out.print("Elija donde patear el penal: ");
            posicionPateador = sc.nextInt();

            posicionArquero = generarPosicionArquero();

            gol = validarPenal(posicionPateador, posicionArquero);

            System.out.println("Resultado del Jugador " + jugador);
            System.out.println("Posición del pateador: " + posicionPateador);
            System.out.println("Posición del arquero: " + posicionArquero);
            System.out.println("GOL: " + gol);
        }

        System.out.println("=----------------------------------=");

        sc.close();
    }
}
//Fin del código

/* Realizado por:
Franco Gonzalez DNI: 47850662
Matias Ramirez DNI: 46274461
 */ 