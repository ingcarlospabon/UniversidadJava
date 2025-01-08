public class variable {
    public static void main(String[] args) {
        //variables
        int edad = 31;
        double precio = 300.40;
        boolean disponible = true;
        char genero;
        genero = 'M'; //M= masculino - F= femenino

        //acceder  a las variables
        System.out.println(edad);

        //modificar la variable edad
        edad= 35;
        System.out.println(edad);

        //imprimir el resto de las variable
        System.out.println("precio: " + precio);
        System.out.println("disponible: " + disponible);
        System.out.println("genero: " + genero);
    }
}