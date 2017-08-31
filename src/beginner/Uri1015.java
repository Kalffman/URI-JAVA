package beginner;

import java.util.Scanner;

public class Uri1015 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        double x1, y1, x2, y2,d;
        String[] l1 = leitor.nextLine().split(" ");
        String[] l2 = leitor.nextLine().split(" ");
        x1 = Double.parseDouble(l1[0]);
        y1 = Double.parseDouble(l1[1]);
        x2 = Double.parseDouble(l2[0]);
        y2 = Double.parseDouble(l2[1]);

        d = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));

        System.out.printf("%.4f\n",d);
    }
}
