import java.nio.channels.Pipe.SourceChannel;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        int  n=5;
        int resultadoFinal= factorial(n);
        System.out.println("Resultado: "+ resultadoFinal);

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
