public class parametro{
    
    public static int somar(int valor1, int valor2){
        return valor1 + valor2; //o retorno precisa ter algum valor
    }
    public static void main(String[] args){
        int resultado = somar(100, 500);
        System.out.println(resultado); //se tivesse dentro do primeiro static, mudaria o int para void possivelmente
        
    }
}





//outra forma de se fazer!
// public class parametro{
    
//     public static void somar(int x, int y){
//         int resultado = x + y;
//         System.out.println(resultado);
//     }

//     public static void main(String[] args){
//         somar(1, 5);
//     }
// }