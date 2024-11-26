/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hrapp;

/**
 *
 * @author pc
 */
public class Departamento {
    private String nombre;
    private Empleado[] arrayEmpleados = new Empleado[10];

    //Constructor
    public Departamento(String nombre) {
        this.nombre = nombre;
        Empleado emp4 = new Empleado(24,"Marcos", 2000);
        Empleado emp5 = new Empleado(25, "Lucía", 2200);
        Empleado emp6 = new Empleado(26, "Tomás", 2100);
        Empleado emp7 = new Empleado(27, "Carla", 2300);
        Empleado emp8 = new Empleado(28, "Federico", 2400);
        Empleado emp9 = new Empleado(29, "Valeria", 2500);


    arrayEmpleados[0] = emp4;
    arrayEmpleados[1] = emp5;
    arrayEmpleados[2] = emp6;
    arrayEmpleados[3] = emp7;
    arrayEmpleados[4] = emp8;
    arrayEmpleados[5] = emp9;

    }

    //Getter & Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Método toString
    @Override
    public String toString() {
        return "Departamento: " + getNombre();
    }
    
    //Otros métodos
    
        public void agregarEmpleado(Empleado[] unEmpleado) {
            int empleados = 0;
            
            //Cuenta la cantidad de empleados encontrados en el array
            for (int x = 0; x < arrayEmpleados.length; x++) {
                    if (arrayEmpleados[x] != null) {
                        empleados++;
                    }
                }
            
            //Bucle for-each.
            //Si por cada elemento del array auxiliar, recorre el array principal.
            //Verifica que la cantidad de elementos sea menor a la máxima.
            //Si encuentra un lugar lleno, imprime "Ocupado", si no, agrega el elemento al índice actual y suma un empleado.
            for (Empleado emp : unEmpleado) {                           
                          
                if(empleados >= arrayEmpleados.length) {
                    System.out.println("Cantidad máxima alcanzada.");
                    break;
                }
                
                for (int i = 0; i < arrayEmpleados.length; i++) {
                    if (arrayEmpleados[i] != null) {
                        System.out.println("Ocupado: " + i);
                    } else {
                        arrayEmpleados[i] = emp;
                        System.out.println("Agregado: " + i);
                        empleados++;
                        break;
                    }
                    
                }            
                System.out.println("Cantidad: " + empleados);
        }
    }
        
        public void mostrarEmpleados() {
            for (int i = 0; i < arrayEmpleados.length; i++) {
                if (arrayEmpleados[i] != null) {
                    System.out.println(arrayEmpleados[i]);
                }
            }
        }
}
