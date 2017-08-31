package beginner;

import java.util.Scanner;

public class Uri1036 {
    public static void main(String... args){
        Scanner leitor =  new Scanner(System.in);
        double A,B,C,D,x1,x2;
        A = Double.parseDouble(leitor.next());
        B = Double.parseDouble(leitor.next());
        C = Double.parseDouble(leitor.next());

        if (!(A == 0)){
            D = Math.pow(B,2) - 4*A*C;
            if (D >= 0){
                x1 = ( -B + Math.sqrt(D) ) / (2*A);
                x2 = ( -B - Math.sqrt(D) ) / (2*A);

                System.out.printf("R1 = %.5f\n",x1);
                System.out.printf("R2 = %.5f\n",x2);
            }else{
                System.out.printf("Impossivel calcular\n");
            }
        }else{
            System.out.printf("Impossivel calcular\n");
        }
    }
}
