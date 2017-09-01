package beginner;
/**
 * Ainda nao aceito no Uri
 */
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
        System.out.printf("%d nota(s) de R$ 100.00\n",v[0]);
        System.out.printf("%d nota(s) de R$ 50.00\n",v[1]);
        System.out.printf("%d nota(s) de R$ 20.00\n",v[2]);
        System.out.printf("%d nota(s) de R$ 10.00\n",v[3]);
        System.out.printf("%d nota(s) de R$ 5.00\n",v[4]);
        System.out.printf("%d nota(s) de R$ 2.00\n",v[5]);
        System.out.printf("MOEDAS:\n");
        System.out.printf("%d moedas(s) de R$ 1.00\n",v[6]);
        System.out.printf("%d moedas(s) de R$ 0.50\n",v[7]);
        System.out.printf("%d moedas(s) de R$ 0.25\n",v[8]);
        System.out.printf("%d moedas(s) de R$ 0.10\n",v[9]);
        System.out.printf("%d moedas(s) de R$ 0.05\n",v[10]);
        System.out.printf("%d moedas(s) de R$ 0.01\n",v[11]);

    }
}
