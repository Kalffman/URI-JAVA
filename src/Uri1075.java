import java.util.Scanner;

public class Uri1075 {
    public static void main(String... args){
        Scanner leitor = new Scanner(System.in);
        int a;
        a = leitor.nextInt();
        for (int i = 1 ; i < 10000; i++)
            if (i%a == 2)
                System.out.printf("%d\n",i);
    }
}
