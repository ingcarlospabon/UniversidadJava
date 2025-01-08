public class ReglasNombresVariables {
    public static void main(String[] args) {
        //reglas de nombres de variables
        String nombreCopleto = "Juan Carlos";// correcto y buenas practicas
        System.out.println("nombreCopleto = " + nombreCopleto);
        String NombreCompleto = "Juan Carlos"; //correcto pero no aplicar las buenas practicas (la primera letra debe ser minuscula)
        System.out.println("NombreCompleto = " + NombreCompleto);
        //String nombre-cliente= "Juan"; //incorrecto
        String nombre_cliente = "Juan"; //correcto pero no aplicar las buenas practicas (no se usan guion bajo para los nombres)
        String $apellido = "Juarez"; //correcto y aceptable
    }
}
