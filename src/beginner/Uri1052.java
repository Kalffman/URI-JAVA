package beginner;

import java.util.Scanner;

public class Uri1052 {
    public static void main(String... args){
        Scanner leitor = new Scanner(System.in);
        String a;
        a = leitor.next();
        switch (a){
            case "1":
                System.out.printf("%s\n","January");
                break;
            case "2":
                System.out.printf("%s\n","February");
                break;
            case "3":
                System.out.printf("%s\n","March");
                break;
            case "4":
                System.out.printf("%s\n","April");
                break;
            case "5":
                System.out.printf("%s\n","May");
                break;
            case "6":
                System.out.printf("%s\n","June");
                break;
            case "7":
                System.out.printf("%s\n","July");
                break;
            case "8":
                System.out.printf("%s\n","August");
                break;
            case "9":
                System.out.printf("%s\n","September");
                break;
            case "10":
                System.out.printf("%s\n","October");
                break;
            case "11":
                System.out.printf("%s\n","November");
                break;
            case "12":
                System.out.printf("%s\n","December");
                break;
        }
    }
}
