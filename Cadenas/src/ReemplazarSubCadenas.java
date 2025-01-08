public class ReemplazarSubCadenas {
    public static void main(String[] args) {
        //reemplazar cadenas
        var cadena = "Hola Mundo";
        System.out.println("Cadena original: " + cadena);

        //reemplazar "Mundo" por " a todos"
        var nuevaCadena = cadena.replace("Mundo", " a todos");
        System.out.println("nuevaCadena = " + nuevaCadena);

        //reemplazar "hola" por "adios
        nuevaCadena= cadena.replace("Hola", "adios");
        System.out.println("nuevaCadena = " + nuevaCadena);
    }
}
