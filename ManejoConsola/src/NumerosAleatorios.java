import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        System.out.println("*** Números Aleatorios ***");
        var ramdom = new Random();

        //Generar un numero aleatorio entre 0 y 9
        var numeroAleatorio = ramdom.nextInt(10);
        System.out.println("Numero Aleatorio entre 0 y 9= " + numeroAleatorio);

        //generar un numero aleaatorio entre 1 y 10
        numeroAleatorio = ramdom.nextInt(10) + 1;
        System.out.println("Numero Aleatorio entre 1 y 10= " + numeroAleatorio);

        //generar un numero flotante entre 0.0 y 1.0
        var flotanteAleatorio = ramdom.nextFloat();
        System.out.println("flotanteAleatorio = " + flotanteAleatorio);

        //simular el lanzamiento de un dado(1 y 6)
        var dado = ramdom.nextInt(6) + 1;
        System.out.println("Resultado de lanzar el dado = " + dado);
    }
}
