/*Crear un objeto y presentar los datos
        Ingresar la información por teclado.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del pasiente");
        String nombrePasiente = entrada.nextLine();
        System.out.println("Ingrese la ciudad en la que reside");
        String ciudad1 = entrada.nextLine();
        System.out.println("Ingrese el numero de doctorer");
        int numeroDoctor = entrada.nextInt();
        System.out.println("Ingrese el numero de pacientes");
        int numeroEnfermos = entrada.nextInt();
        Hospital hospital = new Hospital(nombrePasiente, ciudad1, numeroDoctor, numeroEnfermos);
        System.out.printf("%s\n", hospital);
    }
}
