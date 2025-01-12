public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println(" *** Operadores Unarios ***");
        int a= 3, b= -2, resultado;
        var c = true;

        //Operador unario +
        resultado = +a;
        System.out.println("resultado +a = " + resultado);

        //operador unario -
        resultado= -a;
        System.out.println("resultado -a = " + resultado);
        
        //operadores unarios incrementos/decremento
        //pre-incremento
        a = 3;
        resultado = ++a; //primero incrementa el valor
        System.out.println("resultado ++a = " + resultado);
        System.out.println("a ya se incremento = " + a);

        //Post-incrementos
        a = 3;
        resultado = a++; //primero se usa el valor y despues se incrementa
        System.out.println("resultado a++ = " + resultado);
        System.out.println("a en este momento se incrementa = " + a);

        //pre - decremento
        b = -2;
        resultado = --b; //primero se incrementa y despues se usa el valor
        System.out.println("resultado --b = " + resultado);
        System.out.println("b ya se decremento = " + b);

        // post-decremento
        b = -2;
        resultado = b--; // primero se usa el valor, y despues se incrementa
        System.out.println("resultado b-- = " + resultado);
        System.out.println("b en este momento = " + b);
    }
}
