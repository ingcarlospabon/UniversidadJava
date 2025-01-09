import java.util.Scanner;

public class SistemaEmpleado {
    public static void main(String[] args) {
        System.out.println(" *** Sistema de Empelados *** ");

        var consola = new Scanner(System.in);

        // nombre del Empleado
        System.out.print("Nombre del empleado: ");
        var nombreEmpleado = consola.nextLine();

        // edad  del empleado
        System.out.print("Edad del empleado: ");
        var edadEmpleado = Integer.parseInt(consola.nextLine());

        //Salario del empleado
        System.out.print("Salario del empleado: ");
        var salarioEmpleado = Double.parseDouble(consola.nextLine());

        //es jefe de departamento
        System.out.print("Es jefe de departamento (True / False)?: ");
        var esJefeDepartamento = Boolean.parseBoolean(consola.nextLine());

        //Imprimir los valores del empleado
        System.out.println("\n Datos del Empleado: ");
        System.out.println("\t Nombre: " + nombreEmpleado);
        System.out.println("\tEdad: " + edadEmpleado);
        System.out.println("\tSalario: " + salarioEmpleado);
    }
}
