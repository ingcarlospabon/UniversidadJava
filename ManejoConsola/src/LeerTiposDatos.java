import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        //leer distintos tipos de datos
        //leer un tipo int
        var consola = new Scanner(System.in);
        System.out.println("Ingresa tu edad");
        var edad = consola.nextInt();
        System.out.println("edad = " + edad);

        //leer un tipo doble
        System.out.println("ingrese su altura");
        var altura = consola.nextDouble();
        System.out.println("tu altura es: " + altura);

        //leer un tipo string
        System.out.println("ingresa tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("tu nombre es: " + nombre);

        //conversion de datos
        System.out.println("indica un valor entero: ");
        var enteroString = consola.nextLine();
        var entero = Integer.parseInt(enteroString);
        System.out.println("entero = " + entero);

        //conversion de tipo flotante
        System.out.println("indica un valor con decimales: ");
        var flotante = Float.parseFloat(consola.nextLine());
        System.out.println("flotante = " + flotante);

    }
}
