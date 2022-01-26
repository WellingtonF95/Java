import java.util.Scanner;

public class Ex_5 {
    public static void main (String[] args){

        /*5) Faça um programa que peça dois valores para o usuário e mostre dentro de uma Area
        de Texto os números divisíveis por 5. Dica marota pesquise a formula.*/

        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        short num1 = 0, num2 = 0;

        System.out.println("Digite um número: ");
        num1 = scan1.nextShort();
        System.out.println("Digite outro número: ");
        num2 = scan2.nextShort();

        for(short i = num1; i <= num2; i++){
            if (i % 5 == 0){
                System.out.println(i);
            }
        }

    }
}
