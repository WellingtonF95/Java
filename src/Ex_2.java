import java.util.Scanner;

public class Ex_2 {
    public static void main (String[] args){
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
