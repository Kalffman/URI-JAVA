package beginner;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class Uri1043 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double[] valor = new double[3];
        double result;
        valor[0] = s.nextDouble();
        valor[1] = s.nextDouble();
        valor[2] = s.nextDouble();
        result = ( valor[2] * (valor[0]+valor[1]) ) / 2;
        Arrays.sort(valor);
        result = valor[2] < (valor[0]+valor[1]) ? DoubleStream.of(valor).sum() : result;
        System.out.printf((valor[2] < (valor[0]+valor[1]))? "Perimetro = %.1f\n":"Area = %.1f\n",result);

    }
}
