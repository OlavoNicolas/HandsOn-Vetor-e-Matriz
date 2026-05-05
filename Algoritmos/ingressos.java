import java.util.Scanner;

public class ingressos {
    public static void main(String[] args) {
        
    Scanner ls = new Scanner(System.in);
    int lugares [][] = new int[20][10];
    int fileira,cadeira;

    for (int i = 0; i < lugares.length; i++) {
        for (int j = 0; j < lugares[i].length; j++) {
            lugares[i][j] = -1;
        }
    }

    while (true) {
        do{
        System.out.println("Você deseja comprar o ingresso em qual fileira: ");
        fileira = ls.nextInt();
        System.out.println("Você deseja comprar em qual cadeira: ");
        cadeira = ls.nextInt();
        
        if(lugares[fileira][cadeira] == -1){
            lugares[fileira][cadeira] = 1;
            System.out.println("Ingresso comprado com sucesso!!! Fileira: " + fileira + " Cadeira: " + cadeira);
        }
        else{

            System.out.println("Assento ocupado! Tente novamente.");

        }
            }while(lugares[fileira][cadeira] == -1);
        
    }

    }
    
}
