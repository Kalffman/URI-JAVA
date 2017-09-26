package beginner;

import java.util.Arrays;
import java.util.Scanner;

public class Uri1045 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        double[] lista = new double[3];
        lista[0] = leitor.nextDouble();
        lista[1] = leitor.nextDouble();
        lista[2] = leitor.nextDouble();

        Arrays.sort(lista);

        double aux = lista[0];
        lista[0] = lista[2];
        lista[2] = aux;

        if (lista[0] > 0 && lista[1] > 0 && lista[2] > 0){
            if ( lista[0] >= lista[1]  + lista[2] ){
                System.out.println("NAO FORMA TRIANGULO");
            } else {
                if (Math.pow(lista[0], 2) == Math.pow(lista[1], 2) + Math.pow(lista[2], 2)) {
                    System.out.println("TRIANGULO RETANGULO");
                }
                if (Math.pow(lista[0], 2) > Math.pow(lista[1], 2) + Math.pow(lista[2], 2)) {
                    System.out.println("TRIANGULO OBTUSANGULO");
                }
                if (Math.pow(lista[0], 2) < Math.pow(lista[1], 2) + Math.pow(lista[2], 2)) {
                    System.out.println("TRIANGULO ACUTANGULO");
                }
                if (lista[0] == lista[1] && lista[1] == lista[2]) {
                    System.out.println("TRIANGULO EQUILATERO");
                }
                if ((lista[0] == lista[2] && lista[1] != lista[2])
                        || (lista[0] == lista[1] && lista[2] != lista[1])
                        || (lista[1] == lista[2] && lista[0] != lista[2])) {
                    System.out.println("TRIANGULO ISOSCELES");
                }
            }
        }
    }
}
