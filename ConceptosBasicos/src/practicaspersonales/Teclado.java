package practicaspersonales;

import java.util.Scanner;

public class Teclado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Cual es tu nombre?");
        String nombre = entrada.nextLine();
        System.out.println("Cual es tu edad?");
        int edad = entrada.nextInt();
        System.out.println("Cual es tu num de telefono?");
        int telefono = entrada.nextInt();
        System.out.printf("Tu nombre es: %s \nTu edad es: %d\nTu telefono es: %d\n",nombre , edad, telefono);

    }
}

