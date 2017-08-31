package beginner;

import java.util.Scanner;

public class Uri1019 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int N, h=3600, m=60, s=1;
        Integer[] time = new Integer[3];
        N = leitor.nextInt();
        time[0] = 0;
        while(N / h > 0){
            time[0]++;
            N -= h;
        }
        time[1] = 0;
        while(N / m > 0){
            time[1]++;
            N -= m;
        }
        time[2] = 0;
        while (N / s > 0){
            time[2]++;
            N -= s;
        }
        System.out.printf("%d:%d:%d\n",time[0],time[1],time[2]);
    }
}
