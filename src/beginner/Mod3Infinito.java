package beginner;

import java.util.Scanner;

public class Mod3Infinito {
    public static void main(String... args){
        Scanner leitor = new Scanner(System.in);
        int a = 0;
        char[] _char = leitor.nextLine().toCharArray();
        for(char c : _char){
            a += Character.getNumericValue(c);
        }
        System.out.println(a%3);
    }
}
