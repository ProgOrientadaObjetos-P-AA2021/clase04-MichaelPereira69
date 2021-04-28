/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        /*Crear un objeto y presentar los datos*/
        Hospital h1 = new Hospital ();
        System.out.printf("%s\n", h1);
        System.out.println("Los Datos del ospital son:\n");
        System.out.printf("El nombre del Hospital es: %s\n"
                + "La Ciudad es: %s\n"
                + "El Numero de Doctores es: %s\n"
                + "El Numero de Enfermos es: %s\n",
                h1.obtenerNombre(),
                h1.obtenerCiudad(),
                h1.obtenerNumeroDoctores(),
                h1.obtenerNumeroEnfermeros());
        String nombre = "Isidro ayora";
        String ciudad = "Loja";
        double numeroDoctores = 100;
        double NumeroEnfermos = 200;
    }
}
