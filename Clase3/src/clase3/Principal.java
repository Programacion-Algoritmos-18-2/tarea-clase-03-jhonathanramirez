/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Trabajador t = new Trabajador();
        int[] A = new int[4];
        System.out.println("Número de nombres del trabajador 1 o 2");
        int numero_nombres = scanner.nextInt();
        scanner.nextLine();

        if (numero_nombres == 1) {
            System.out.println("Ingrese el nombre del trabajador");
            String nombre = scanner.nextLine();
            t.agregar_nombres(nombre);
        } else {
            System.out.println("Ingrese el nombre uno del trabajador");
            String nombre1 = scanner.nextLine();
            System.out.println("Ingrese el nombre dos del trabajador");
            String nombre2 = scanner.nextLine();
            t.agregar_nombres(nombre1, nombre2);

        }

        System.out.println("Ingrese el apellido del trabajador");
        String apellidos = scanner.nextLine();
        t.agregar_apellidos(apellidos);
        System.out.println("1 Ingrese el sueldo mensual\n"
                + "2 Ingrese el sueldo semanal");
        int ops = scanner.nextInt();
        if (ops == 1) {
            System.out.println("Ingrese el sueldo del trabajador");
            double sueldo = scanner.nextDouble();
            t.agregar_sueldo(sueldo);
            System.out.printf("Los datos del trabajador son: %s\n", t);
        } else {
                System.out.println("Ingrese el sueldo del trabajador por semana");
                double sueldo = scanner.nextDouble();
                System.out.println("Ingrese el sueldo del trabajador por semana");
                double sueldo2 = scanner.nextDouble();
                System.out.println("Ingrese el sueldo del trabajador por semana");
                double sueldo3 = scanner.nextDouble();
                System.out.println("Ingrese el sueldo del trabajador por semana");
                double sueldo4 = scanner.nextDouble();
                
                t.agregar_sueldo(sueldo, sueldo2, sueldo3, sueldo4);
                for (int i = 0; i < A.length; i++) {
                int j = A[i];
                
                
            }
        }
        System.out.printf("Los datos del trabajador son: %s\n", t);
    }
}
