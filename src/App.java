
public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        int  n=5;
        //int resultadoFinal= factorial(n);
        //System.out.println("Resultado: "+ resultadoFinal);

        EjerciciosRecursibidad er = new EjerciciosRecursibidad();
        

        int res= er.fibonacci(5);
        System.out.println("Respuesta fibonacci es: "+res);
        
        int res1=er.SumaConsecutivos(5);
        System.out.println("la suma consecutiva es: "+res1);
        
        int base=8;
        int exponente=6;
        int re2 = er.getPotencia(base, exponente);
        System.out.println("La potencia es: "+base+" ^ "+exponente+" ="+re2);

        int res3= er.sumaDigitos(3453);
        System.out.println("suma = "+res3);


    }
    public static int factorial(int n){
        
        if (n == 0) {
            System.out.println("Alcanze el caso base");
            return 1;
        }else{
            int resultado = n* factorial(n-1);    
            System.out.println("calculando factorial de: " +n+" * factorial("+(n-1)+" -1 ");
            return resultado;
        }
    }
}
