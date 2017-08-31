package beginner;

import java.util.Scanner;

public class Uri1021 {
    public static void main(String... args){
        Scanner leitor = new Scanner(System.in);
        double N;
        Double[] V = {
                //cedulas 6
                100.00, 50.00, 20.00, 10.00, 5.00, 2.00,
                //moedas 6
                1.00, 0.50, 0.25, 0.10, 0.05, 0.01
                };
        N = Double.parseDouble(leitor.nextLine());
        Integer[] v = new Integer[12];

        for (int i = 0;i < 12;i++){
            v[i] = 0;
            while (N - V[i] >= 0){
                v[i]++;
                N -= V[i];
            }
        }
        System.out.printf("NOTAS:\n");
        for (int i = 0 ; i < 6 ; i++)
            System.out.printf("%d nota(s) de R$ %.2f\n",v[i],V[i]);
        System.out.printf("MOEDAS:\n");
        for (int i = 6 ; i < 12 ; i++)
            System.out.printf("%d moedas(s) de R$ %.2f\n",v[i],V[i]);

    }
}
