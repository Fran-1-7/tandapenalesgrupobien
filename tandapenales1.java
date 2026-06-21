import java.util.Scanner;

//Creamos la clase principal
public class tandapenales1 {

    //Módulo encargado de validar si el penal es gol o si fue atajado
    public static boolean validarPenal(int posicionPateador, int posicionArquero) {

        //Si las posiciones del jugador y el arquero son distintas es gol
        if (posicionPateador != posicionArquero) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        //Creamos el Scanner para ingresar datos
        Scanner sc = new Scanner(System.in);

         //Declaramos variables para el primer penal
        int posicionPateador1;
        int posicionArquero1;
        boolean gol1;
         //Declaramos varibales para el segundo penal
        int posicionPateador2;
        int posicionArquero2;
        boolean gol2;

        //Mostramos opciones al jugadores
        System.out.println("=----------------------------------=");
        System.out.println("Elija el lugar donde patear los penales:");
        System.out.println("1. izquierda");
        System.out.println("2. centro");
        System.out.println("3. derecha");

        //Guardamos la posición elegida por el pateador 1
        System.out.print("Elija donde patear el primer penal: ");
        posicionPateador1 = sc.nextInt();

        //Generamos la posición aleatoria del arquero 1
        posicionArquero1 = (int)(Math.random() * 3) + 1;

        //Invocamos el módulo validarPenal para el primer penal
        gol1 = validarPenal(posicionPateador1, posicionArquero1);

        //Guardamos la posición elegida por el pateador 2
        System.out.print("Elija donde patear el segundo penal: ");
        posicionPateador2 = sc.nextInt();

        //Generamos la posición aleatoria del arquero 2
        posicionArquero2 = (int)(Math.random() * 3) + 1;

        //invocamos el modulo validarPenal para el segundo penal
        gol2 = validarPenal(posicionPateador2, posicionArquero2);

        //Mostramos resultados del 1er y 2do penal
        System.out.println("=----------------------------------=");
        System.out.println("Resultado del 1er penal");
        System.out.println("Posición del primer pateador : " + posicionPateador1);
        System.out.println("Posición del arquero : " + posicionArquero1);
        System.out.println("GOL: " + gol1);
        System.out.println("=----------------------------------=");
        System.out.println("Resultado del 2do penal");
        System.out.println("Posición del segundo pateador : " + posicionPateador2);
        System.out.println("Posición del arquero : " + posicionArquero2);
        System.out.println("GOL: " + gol2);
        System.out.println("=----------------------------------=");

        //Cerramos el Scanner
        sc.close();
    }
}
//Fin del código

/* Realizado por:
Franco Gonzalez DNI: 47850662
Matias Ramirez DNI: 46274461
 */ 