//Par ou ímpar:

package lista1;
import java.util.Scanner;
public class Question6 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número:");
        int numero = scanner.nextInt();
        if (numero% 2 ==0){
            System.out.println("O numero é par");
        } else {
            System.out.println("O número é impar");
        }
            
        scanner.close();
;    }
    
}
