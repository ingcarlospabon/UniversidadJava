public class GeneradorEmails {
    public static void main(String[] args) {
        System.out.println("*** Generador de Emails ***");
        //Nombre Completo del usuario
        var nombreCompleto = " Carlos Javier Pabon ";
        System.out.println("nombreCompleto = " + nombreCompleto);

        //Procesar o normalizar el nombre del usuario
        //limpiar los espacios en blanco al inicio y al final
        var nombreNormalizado = nombreCompleto.strip();
        System.out.println("nombreNormalizado = " + nombreNormalizado);
    }
}
