package beginner;

import java.util.Scanner;

public class Uri1050 {
    public static void main(String... args) {
        Scanner leitor = new Scanner(System.in);
        String a, b;
        a = leitor.next();

        switch (a) {
            case "61":
                b = "Brasilia";
                break;
            case "71":
                b = "Salvador";
                break;
            case "11":
                b = "Sao Paulo";
                break;
            case "21":
                b = "Rio de Janeiro";
                break;
            case "32":
                b = "Juiz de Fora";
                break;
            case "19":
                b = "Campinas";
                break;
            case "27":
                b = "Vitoria";
                break;
            case "31":
                b = "Belo Horizonte";
                break;
            default:
                b = "DDD nao cadastrado";
                break;
        }
        System.out.printf("%s\n",b);
    }
}
