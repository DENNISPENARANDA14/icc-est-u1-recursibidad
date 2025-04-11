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
    /*
     * escriba un metodo recursivo que imprima los numeros desde n hasta 1
     * de forma descendente, separados por un espacio
     */
    public void imprimirDescendente(int n){
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        imprimirDescendente(n-1);
    }

    /*
     * crea una funcion recursiva llamada reverso que resiva un numero entero positivo n y devuelva su numero invertido.
     * por ejemplo, si se escribe 1234, la funcion debe devolver 4321.
     */
   
    public int reverso(int n){
        int res = 0;
        return invertirNumero2(n, res);
                
    }
    private int invertirNumero(int numero, int res){
        if(numero == 0){
            return res;
        }else{
            int residuo = numero%10;
            numero = numero/10;
            res = (res*10)+residuo;
            return invertirNumero(numero, res);
        }
    }
    private int invertirNumero2(int numero, int res){
        int r;
        if(numero == 0){
            r = res;
        }else{
            int residuo = numero%10;
            numero = numero/10;
            res = (res*10)+residuo;
            r = invertirNumero2(numero, res);
        }
        return r;
    }
    
}
