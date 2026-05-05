import java.util.Scanner;

public class AB {
    public static void main(String[] args) {
        Scanner ls = new Scanner(System.in);
        int a [] = new int[8]; 
        int b [] = new int[8];

        for (int i = 0; i < a.length; i++) {
            System.out.println("\nDigite um numero: ");
            a[i] = ls.nextInt();
            b[i] = a[i] * 3;     
        }
        System.out.println("\nVetor A: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nVetor B: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

        ls.close();
    }
    
}
