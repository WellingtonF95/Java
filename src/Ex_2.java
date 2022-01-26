import java.util.Scanner;

public class Ex_2 {
    public static void main (String[] args){

        /*2) Faça com que o usuário digite um valor em um campo de texto e dentro de uma Area
        de Texto mostre os números de 0 até o número que o usuário digitou. Verifique se o
        número que ele digitou é 0 se for 0 mande a mensagem valor inválido.*/

        Scanner scan = new Scanner(System.in);

        short numero = 0, cont = 0;

        System.out.println("Digite um número:");
        numero = scan.nextShort();
        
        while(cont <= numero){
            if (numero == 0){
                System.out.println("Numero invalido, tente novamente: ");
                numero = scan.nextShort();
            }else {
                System.out.println(cont);
                cont++;
            }
        }
        
    }
}
