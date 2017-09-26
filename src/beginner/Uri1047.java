package beginner;

import java.util.Scanner;

public class Uri1047 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int A,B,C,D,horas = 0,minutos = 0;
        A = leitor.nextInt();
        B = leitor.nextInt();
        C = leitor.nextInt();
        D = leitor.nextInt();

        if (A >= C){
            horas = (23 - A) + C;
            if (B >= D){
                minutos = (60 - B) + D;
            }else{
                minutos = D - B;
            }
        }else{
            horas = C - A;
            if (B >= D){
                horas --;
                minutos = (60 - B) + D;
            }else{
                minutos = D - B;
            }
        }
        if (minutos == 60){
            horas ++;
            minutos = 0;
        }
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",horas,minutos);
    }
}
