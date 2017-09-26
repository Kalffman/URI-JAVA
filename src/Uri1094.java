import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Uri1094 {
    public static void main(String... args){
        Scanner leitor = new Scanner(System.in);
        Map<String,Integer> cobaias = new HashMap<>();
        int vzs,n; double total = 0; String  c;

        vzs = leitor.nextInt();

        for (int i = 0 ; i < vzs ; i++){
            n = leitor.nextInt();
            c = leitor.next();

            if (n >= 1 && n <= 15) {
                if (c.equals("C") || c.equals("R") || c.equals("S")) {
                    if (cobaias.containsKey(c)) {
                        cobaias.put(c, cobaias.get(c) + n);
                    }else{
                        cobaias.put(c, n);
                    }
                    total += n;
                }
            }
        }
        System.out.printf("Total: %.0f cobaias\n",total);
        System.out.printf("Total de coelhos: %d\n",cobaias.get("C"));
        System.out.printf("Total de ratos: %d\n",cobaias.get("R"));
        System.out.printf("Total de sapos: %d\n",cobaias.get("S"));
        System.out.printf("Percentual de coelhos: %.2f %%\n",cobaias.get("C")/total*100);
        System.out.printf("Percentual de ratos: %.2f %%\n",cobaias.get("R")/total*100);
        System.out.printf("Percentual de sapos: %.2f %%\n",cobaias.get("S")/total*100);
    }
}
