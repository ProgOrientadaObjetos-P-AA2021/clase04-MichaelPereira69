
  /*
        Crear un constructor que reciba como parámetros
        valores que serán asignados a los atributos.
    
    */
package paquete2;

/**
 *
 * @author reroes
 */
public class Hospital {
    private String nombre;
    private String ciudad;
    private int numeroDoctores;
    private int numeroEnfermeros;
    public Hospital(String nombrePasiente, String ciudad1, int numeroDoctor, int numEnfermos){
        nombre = nombrePasiente;
        ciudad = ciudad1;
        numeroDoctores = numeroDoctor;
        numeroEnfermeros = numEnfermos;
    }
    
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerCiudad(String n){
        ciudad = n;
    }
    
    public void establecerNumeroDoctores(int n){
        numeroDoctores = n;
    }
    
    public void establecerNumeroEnfermeros(int n){
        numeroEnfermeros = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerCiudad(){
        return ciudad;
    }
    
    public int obtenerNumeroDoctores(){
        return numeroDoctores;
    }
    
    public int obtenerNumeroEnfermeros(){
        return numeroEnfermeros;
    }
    @Override
    public String toString(){
        String cadena = String.format("\tDatos del Hospital\nNombre: %s\n"
                + "Ciudad: %s\nNumero de Doctores: %d\n"
                + "Numero de enfermeros: %d\n", obtenerNombre(), 
                obtenerCiudad(), obtenerNumeroDoctores(), 
                obtenerNumeroEnfermeros());
        return cadena;
    }
    
    
}