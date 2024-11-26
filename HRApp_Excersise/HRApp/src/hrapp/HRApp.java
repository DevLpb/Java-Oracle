/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hrapp;

/**
 *
 * @author pc
 */
public class HRApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado emp1 = new Empleado(1, "Juan", 1000);
        Empleado emp2 = new Empleado(2, "Rodrigo", 1250);
        Empleado emp3 = new Empleado(3, "Marta", 1500);
        
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        
        Departamento dept = new Departamento("Justicia");
        System.out.println(dept);
        
        Empleado[] listaEmpleados = {emp1, emp2, emp3};
        
        dept.agregarEmpleado(listaEmpleados);
        
        dept.mostrarEmpleados();
    }
    
}
