package beginner;

import java.util.Scanner;

public class Uri1040 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        double a,b,c,d,n1,n2,rec;
        a = leitor.nextDouble();
        b = leitor.nextDouble();
        c = leitor.nextDouble();
        d = leitor.nextDouble();

        n1 = (a*2+b*3+c*4+d)/(2+3+4+1);

        if (n1 >= 7D){
            System.out.printf("Media: %.1f\n",n1);
            System.out.printf("Aluno aprovado.\n");
        }else if (n1 >= 5D && n1 <= 6.9D){
            rec = leitor.nextDouble();
            n2 = (rec + n1)/2;
            if (n2 >= 5D){
                System.out.printf("Media: %.1f\n",n1);
                System.out.printf("Aluno em exame.\n");
                System.out.printf("Nota do exame: %.1f\n",n2);
                System.out.printf("Aluno aprovado.\n");
                System.out.printf("Media final: %.1f\n",n2);
            }else if(n2 <= 4.9){
                System.out.printf("Media: %.1f\n",n1);
                System.out.printf("Aluno em exame.\n");
                System.out.printf("Nota do exame: %.1f\n",n2);
                System.out.printf("Aluno reprovado.\n");
                System.out.printf("Media final: %.1f\n",n2);
            }
        }else{
            System.out.printf("Media: %.1f\n",n1);
            System.out.printf("Aluno reprovado.\n");
        }
    }
}
