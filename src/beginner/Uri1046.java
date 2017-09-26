package beginner;

import java.util.Scanner;

public class Uri1046 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int A,B,horas = 0;
        A = leitor.nextInt();
        B = leitor.nextInt();

        if (A >= B ){
            horas = (24 - A) + B;
        } else {
            horas = B - A;
        }
        System.out.printf("O JOGO DUROU %d HORA(S)\n",horas);
    }
}
