package desafios; //dentro de uma pasta é bom ter para que fique organizado e evitar erros
import java.util.Scanner;

public class ex01{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //analisar o erro
        System.out.println("Digite a  sua idade: ");

        int idade = input.nextInt();
        if (idade >= 18){
            System.out.println("Maior de idade!");
        } 
        
        else {
            System.out.println("Menor de idade...");
        }
    }
}
