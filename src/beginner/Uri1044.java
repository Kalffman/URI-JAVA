package beginner;
/**
 * Ainda nao aceito no Uri
 */
import java.util.Scanner;

public class Uri1044 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a,b;
        a = s.nextInt();
        b = s.nextInt();
        s.close();
        System.out.println( b % a == 0 ? "Sao Multiplos":"Nao sao Multiplos");
    }
}
