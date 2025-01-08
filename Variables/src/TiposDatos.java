public class TiposDatos {
    public static void main(String[] args) {
        //Tipos de Datos
        //enteros
        byte tipoByte = 127;
        System.out.println("dato byte: " + tipoByte);
        short tipoShort = 32000;
        System.out.println("datos short: " + tipoShort);
        int tipoInt = 2147483647;
        System.out.println("dato entero: " + tipoInt);
        long tipoLong =  9223372036854775807L; //L o l para indicar que es long
        System.out.println("dato long: " + tipoLong);

        //punto flotante
        float tipoFloat = 3.14F;
        System.out.println("dato flotante" + tipoFloat);
        double tipoDouble = 3.1315D; // D o d indica tipo double(opcional)
        System.out.println("dato double: " + tipoDouble);

        //caracter
        char tipoChar = 'A'; //caracter del juego unicode
        System.out.println("dato char: " + tipoChar);
        tipoChar = 65;
        System.out.println("tipochar: " + tipoChar);
        tipoChar = '@';
        System.out.println("tipochar: " + tipoChar);

        //boolean
        boolean tipoBoolean = true;
        System.out.println("dato boolean: " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean: " + tipoBoolean);

        //tipos Object(referencia)
        String nombre = null; //valor x default
        System.out.println("nombre: " + nombre);
        nombre = "Javier";
        System.out.println("nombre: " + nombre);

    }
}
