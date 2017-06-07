/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed06_tareaproyecto;

/**
 *
 * @author David
 */
public class Ed06_tareaproyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado Empleado1 = new Empleado();
        
        Empleado1.setNombre("Perico de los Palotes");
        Empleado1.setDni("1245678M");
        Empleado1.setDireccion("C/del Pez,6");
        Empleado1.setCargo("ENCARGADO");
        Empleado1.setNumHijos(3);
        imprimir_emp(Empleado1);
        Empleado Empleado2 = new Empleado();
        imprimir_emp(Empleado2);
        
    }

    public static void imprimir_emp(Empleado Empleado1) {
        System.out.println("DNI: "+Empleado1.getDni());
        System.out.println("Nombre: "+Empleado1.getNombre());
        System.out.println("Cargo: "+Empleado1.getCargo());
        System.out.println("Número de hijos: "+Empleado1.getNumHijos());
        System.out.println("Sueldo: "+Empleado1.calcula_sueldo(1200));
    }
    
}
