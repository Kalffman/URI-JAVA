package beginner;
/**
 * Ainda nao aceito no Uri
 */
import java.util.Scanner;

public class Uri1040 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        double a,b,c,d,e,resultado;
        a = leitor.nextDouble()*2;
        b = leitor.nextDouble()*3;
        c = leitor.nextDouble()*4;
        d = leitor.nextDouble();
        resultado = (a+b+c+d)/(2+3+4+1);

        if (resultado >= 7) {
            System.out.printf("Media: %.1f\n",resultado);
            System.out.printf("Aluno aprovado.\n");
        } else if(resultado >= 5 && resultado < 7) {
            e = leitor.nextDouble();
            System.out.printf("Media: %.1f\n",resultado);
            System.out.printf("Nota de exame: %.1f\n",e);
            resultado = (resultado + e)/2;
            System.out.printf( resultado >= 5?"Aluno aprovado.\nMedia final: %.1f.\n":"Aluno reprovado.\nMedia final: %.1f.\n",resultado);
        } else {
            System.out.printf("Media: %.1f\n",resultado);
            System.out.printf("Aluno reprovado.\n");
        }
    }
}
