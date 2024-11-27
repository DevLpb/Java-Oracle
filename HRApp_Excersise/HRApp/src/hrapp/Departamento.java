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
    int empleados = 0;

    //Constructor
    public Departamento(String nombre) {
        this.nombre = nombre;
        Empleado emp4 = new Empleado(24, "Marcos", 2000);
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
    
    //Agrega un empleado recibido de un array auxiliar, y aumenta el contador de empleados al hacerlo.
    public void agregarEmpleado(Empleado[] unEmpleado) {
        //Cuenta la cantidad de empleados encontrados en el array
        for (int x = 0; x < arrayEmpleados.length; x++) {
            if (arrayEmpleados[x] != null) {
                empleados++;
            }
        }

        //Bucle for-each.
        //Por cada elemento del array auxiliar, recorre el array principal.
        //Verifica que la cantidad de elementos sea menor a la máxima.
        //Si encuentra un lugar lleno, imprime "Ocupado", si no, agrega el elemento al índice actual y suma un empleado.
        for (Empleado emp : unEmpleado) {

            if (empleados >= arrayEmpleados.length) {
                System.out.println("Cantidad máxima de empleados alcanzada.");
                break;
            }

            for (int i = 0; i < arrayEmpleados.length; i++) {
                if (arrayEmpleados[i] != null) {
                    System.out.println("Indice ocupado: " + i);
                } else {
                    arrayEmpleados[i] = emp;
                    System.out.println("Empleado agregado al indice: " + i);
                    empleados++;
                    break;
                }

            }
            System.out.println("Cantidad de empleados: " + empleados);
        }
    }

    //Imprime cada uno de los empleados del arrayEmpleados.
    public void mostrarEmpleados() {
        System.out.println("---Empleados actuales---");
        for (int i = 0; i < arrayEmpleados.length; i++) {
            if (arrayEmpleados[i] != null) {
                System.out.println(arrayEmpleados[i]);
            }
        }
    }

    //Imprime la cantidad de empleados actual.
    public void cantidadEmpleados() {
        System.out.println("La cantidad de empleados actual es: " + empleados);
    }

    
    //Búsqueda de empleado que devuelve un string, pero no un objeto.
    public void buscarEmpleadoSimple(int ID) {
        System.out.println("---Buscando empleado por ID--- ");
        boolean empleadoEncontrado = false;
        for (int i = 0; i < arrayEmpleados.length; i++) {
            if (arrayEmpleados[i] != null && arrayEmpleados[i].getID() == ID) {
                System.out.println(arrayEmpleados[i]);
                empleadoEncontrado = true;
                break;
            }
        }
        if (empleadoEncontrado == false) {
            System.out.println("Empleado no encontrado");
        }
    }
    
    //Busca y devuelve un empleado por ID si existe.
    public Empleado buscarEmpleado(int ID) {
        for (Empleado emp : arrayEmpleados) {
            if (emp != null && emp.getID() == ID) {
                return emp;
            }
        }
        return null;
    }

    //Suma todos los salarios de los empleados y retorna el valor.
    public double totalSalarios() {
        double sumaSalarios = 0;
        for (Empleado emp : arrayEmpleados) {
            if (emp != null) {
                sumaSalarios += emp.getSalario();
            }
        }
        return sumaSalarios;
    }

    //Usa el método totalSalarios() para almacenar la suma total en una variable,
    //luego obtiene el promedio dividiento la suma entre los empleados.
    //Imprime el valor y lo retorna.
    public double salarioPromedio() {
        double total = totalSalarios();
        double promedio = empleados > 0 ? total / empleados : 0;
        System.out.println("Salario promedio: " + promedio);
        return promedio;
    }
}
