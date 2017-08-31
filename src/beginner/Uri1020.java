package beginner;

import java.util.Scanner;

public class Uri1020 {
    public static void main(String... args){
        Scanner leitor = new Scanner(System.in);
        int N,a=365,m=30,d=1;
        Integer[] time = new Integer[3];
        N = leitor.nextInt();
        time[0] = 0;
        while(N / a > 0){
            time[0]++;
            N -= a;
        }
        time[1] = 0;
        while(N / m > 0) {
            time[1]++;
            N -= m;
        }
        time[2] = 0;
        while(N / d > 0) {
            time[2]++;
            N -= d;
        }
        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n",time[0],time[1],time[2]);
    }
}
