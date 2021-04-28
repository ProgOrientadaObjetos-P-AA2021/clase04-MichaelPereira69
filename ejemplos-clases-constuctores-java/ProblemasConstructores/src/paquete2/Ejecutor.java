  /*Crear un objeto y presentar los datos
        Ingresar la información por teclado.
        */
          
package paquete2;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        paquete1.Hospital h1 = new paquete1.Hospital ();
        System.out.printf("%s\n", h1);
        System.out.println("Ingrese el nombre del pasiente");
        String nombrePasiente = entrada.nextLine();
        System.out.println("Ingrese la ciudad en la que reside");
        String ciudad1 = entrada.nextLine();
        System.out.println("Ingrese el nombre del doctor");
        int numeroDoctor = entrada.nextInt();
        System.out.println("Ingrese el numero del los pacientes");
        int numeroEnfermos = entrada.nextInt();       
        Hospital hospital = new Hospital(nombrePasiente, ciudad1, numeroDoctor, numeroEnfermos);
        System.out.printf("%s\nhospital");
        
    }
}
