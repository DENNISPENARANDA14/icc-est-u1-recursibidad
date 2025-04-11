public class EjerciciosRecursibidad {
    public int fibonacci(int n){
        if (n<=1) {
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    } 

    //Metodo que de los numeros que contiene n
    //n=5
    //5+4+3+2+1
    public int SumaConsecutivos(int n){
        if (n == 1) {
            return 1;
        }else{
            int resultado = n+ SumaConsecutivos(n-1);    
            return resultado;
        }
    }   
    /*escriba una funcion recursiva que calcule la potenciade un numeros
     * base elevado a un exponente entero.
     * por ejemplo, si base es 2 y exponente es 3,
     * la funcion debe devolver 2^3=8     
     */
    public int getPotencia(int base, int exponente){
        if (exponente == 0) {
            return 1;
            }else{
                int resultado = base * getPotencia(base, exponente-1);
                //System.out.println(base +"  "+exponente);
                //System.out.println(resultado);
                return resultado;
            }
    }

    /*Suma de digitos de un numero: si el numero es menor que 10, lo cual significa que solo tiene un digito, 
    se devuelve el numero mismo. En caso contrario, se extrae el ultimo digito utilizando el operador modulo %
    y se calcula los digitos menos el ultimo digito utilizando la division entera /10. luego, se realiza una llamada recursiva
    a sumaDigitos con el resto y se suma el ultimo digito.
     */
    public int sumaDigitos(int numero){
        if (numero < 10) {
            return numero;
            }else{
                int digito = numero % 10;
                int resto = numero / 10;
                int resultado = digito + sumaDigitos(resto);
                return resultado;
            }
    }
    
}
