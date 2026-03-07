public class condicoes{

    public static void valor(int x){

        if (x == 5){
            System.out.println("De fato, é 5");
        } else {
            System.out.println("Não é 5");
        }
    }
    public static void main(String[] args){
        valor(10);
        loop.execute();
        arrays.lista();
    }
}

class loop{ //nao pode ter duas public repetido nem mesmo nome da classe, tem que ser dessa forma e diferente!
    public static void execute(){ //não pode ter dois main, somente um para poder executar e precisa chamar outra classe para que ambos funcionem
        for (int i = 0; i < 6; i++){
            System.out.println(i);
        }
    }
}

class arrays{
    public static void lista(){
        int[] numeros = {10,20,30};

        for (int i = 0; i < numeros.length; i++){ 
            System.out.println(numeros[i]);
        } //length aqui informa a quantidade das posicoes = i, precisou usar por nao sabermos a quantidade de uma lista, entao tera que contar a posicao
    }
}