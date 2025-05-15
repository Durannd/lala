import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero  = sc.nextInt(); 
        int count = 0;
        int i = numero;
        while (count < 6) {
            if (i % 2 != 0) {
            System.out.println(i);
            count++;
            }
            i++;
        }
    }
}