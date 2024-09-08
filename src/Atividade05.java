import java.util.Scanner;
public class Atividade05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] nomes = new String[3];


        System.out.println("Digite 3 nomes:");

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        System.out.println("\nVocê inseriu os seguintes nomes:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("nomes[" + i + "]: " + nomes[i]);
        }
    }
}

