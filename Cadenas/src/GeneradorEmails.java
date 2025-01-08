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

        //reemplazar los espacios en blanco por punto
        nombreNormalizado = nombreNormalizado.replace(" ", ".");
        //convertimos a minusculas
        nombreNormalizado = nombreNormalizado.toLowerCase();
        System.out.println("nombreNormalizado = " + nombreNormalizado);

        //datos de la empresa
        var nombreEmpresa = "Global Mentoring";
        System.out.println("nombreEmpresa = " + nombreEmpresa);
        var extensionDominio = ".com.mx";
        System.out.println("extensionDominio = " + extensionDominio);

        //quitamos los espacios en blanco y covertimos a minusculas
        var nombreEmpresaNormalizado = nombreEmpresa.strip().replace(" ", ".").toLowerCase();
        var dominioEmailNormalizacion = '@' + nombreEmpresaNormalizado + extensionDominio;
        System.out.println("dominioEmailNormalizacion = " + dominioEmailNormalizacion);

        //email completo
        var emailNormalizado = nombreNormalizado + dominioEmailNormalizacion;
        System.out.println("emailNormalizado = " + emailNormalizado);
    }
}
