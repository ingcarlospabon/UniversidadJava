import java.util.Random;
import java.util.Scanner;

public class GeneradorIdUnico {
    public static void main(String[] args) {
        System.out.println(" *** Sistema Generador de ID Único ***");
        var consola = new Scanner(System.in);
        var aleatorio = new Random();

        //solicitamos nombre de usuario
        System.out.println("¿Cual es su nombre?: ");
        var nombre = consola.nextLine();

        //solicitamos el apellido
        System.out.println("¿Cual es tu apellido?");
        var apellido = consola.nextLine();

        //solictamos el año de nacimiento
        System.out.println("¿Cual es tu año de nacimiento? (YYYY)");
        var anioNacimiento = consola.nextLine();

        // normalizar los valores
        var nombre2 = nombre.trim().toUpperCase().substring(0, 2);
        var apellido2 = apellido.trim().toUpperCase().substring(0, 2);
        var anioNacimiento2 = anioNacimiento.trim().substring(2);

        //generar el valor aleatorio (1 y 9999)
        var numeroAleatorio = aleatorio.nextInt(9999) + 1;

        //formato de 4 digitos
        var numeroAleatorioFormato = String.format("%04d", numeroAleatorio);

        //generar el ID unico
        var idUnico = nombre2 + apellido2 + anioNacimiento2 + numeroAleatorioFormato;

        //imprimir el ID unico
        System.out.printf("""
                %n Hola %s,
                \tTu número de identificación (ID) generado por el sistema es:
                \t%s
                \tFelicidades 
                """, nombre,idUnico);
    }

}
