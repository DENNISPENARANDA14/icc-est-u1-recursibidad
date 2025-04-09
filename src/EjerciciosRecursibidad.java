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
}
