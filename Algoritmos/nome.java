import java.util.Scanner;

public class nome {
    public static void main(String[] args) {
        Scanner ls = new Scanner(System.in);

        String nome [] = new String[5];

        for (int i = 0; i < nome.length; i++) {
            System.out.println("Digite o nome da " + (i+1) + " pessoa:");
            nome[i] = ls.nextLine();
        }

        for (int i = 4; i > 0; i--) {
            System.out.println("\n" + nome[i]);
        }
    
    ls.close();
    }
}
