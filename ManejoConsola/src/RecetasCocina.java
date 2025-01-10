import java.util.Scanner;

public class RecetasCocina {
    public static void main(String[] args) {
        System.out.println(" *** Recetas de cocina ***");
        var consola = new Scanner(System.in);

        //nombre de la receta
        System.out.println("Ingresa el nombre de la receta: ");
        var nombreReceta = consola.nextInt();

        //ingredientes
        System.out.println("Ingrese los ingredientes: ");
        var ingredientes = consola.nextLine();

        //tiempo de preparacion
        System.out.println("Ingresa el tiempo de preparacion(min): ");
        var tiempoPreparacion = Integer.parseInt(consola.nextLine());

        //dificulta de la preparacion
        System.out.println("Ingrese la dificultad(Facíl/Medio/Dificil): ");
        var dificultadPreparacion = consola.nextLine();

        //Imprimir los valores de la receta
        System.out.println("\n --- Receta de Cocina ---");
        System.out.println("\tNombre Receta: " + nombreReceta);
        System.out.println("\tIngredientes" + ingredientes);
        System.out.println("\tTiempo de Preparacion = " + tiempoPreparacion + " minutos");
        System.out.println("\tDificultad = " + dificultadPreparacion);
    }
}
