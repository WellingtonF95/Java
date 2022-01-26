import java.util.Scanner;

public class Ex_4 {
    public static void main (String[] args){
        /*Faça um programa que peça dois valores para o usuário, verifique qual deles é o maior
        e mostre dentro de um Area de Texto a sequência do maior para o menor.*/

        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        short num1 = 0,num2 = 0, cont = 0;

        System.out.println("Digite um número: ");
        num1 = scan1.nextShort();
        System.out.println("Digite outro número: ");
        num2 = scan2.nextShort();

        if (num1 > num2){

            cont = num1;

            while (cont >= num2){
                System.out.println(cont);
                cont--;
            }

        }else if (num2 > num1){

            cont = num2;

            while (cont >= num1){
                System.out.println(cont);
                cont--;
            }
        }


    }
}
