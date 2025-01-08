public class BusquedadeSubcadenas {
    public static void main(String[] args) {
        //buscar subcadenas
        //indexOf - Devuelve el indice de la primera aparicionde la subcadena
        var cadena1 = "Hola Mundo";
        //sub cadena a buscar hola
        var indice1 = cadena1.indexOf("Hola");
        System.out.println("indice1 = " + indice1);
        //lastIndexOf() - devuelve el indice de la ultima aparicion de la subcadena
        //subcadena mundo
        var indice2 = cadena1.lastIndexOf("Mundo");
        System.out.println("indice2 = " + indice2);

        //subcadena no encontrada devuelve -1
        var indice3 = cadena1.lastIndexOf("java");
        System.out.println("indice3 = " + indice3);
    }
}
