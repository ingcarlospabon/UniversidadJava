public class MasConcatenacionCadenas {
    public static void main(String[] args) {
        //mas formas de concatenar cadenas en java
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("cadena3 usnado el + = " + cadena3);

        //metodo concat
        cadena3 = cadena1.concat("").concat(cadena2);
        System.out.println("cadena3 usando el metodo = " + cadena3);

        //stringBuilder
        var constructorCadenas = new StringBuilder();
        /*constructorCadenas.append(cadena1);
        constructorCadenas.append(" ");
        constructorCadenas.append(cadena2);*/
        constructorCadenas.append(cadena1).append(" ").append(cadena2);
        var resultado = constructorCadenas.toString();
        System.out.println("resultado con String Builder= " + resultado);

        //StringBuffer
        var stringBuffering = new StringBuffer();
        stringBuffering.append(cadena1).append(" ").append(cadena2);
        resultado = stringBuffering.toString();
        System.out.println("resultado con String Buffer= " + resultado);

        //join
        resultado = String.join("", cadena1, cadena2, "Adios");
        System.out.println("resultado con join = " + resultado);
    }
}
