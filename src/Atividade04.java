import java.util.Scanner;
public class Atividade04 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[] numeros = new int[3];

            System.out.println("Digite 3 números inteiros:");

            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                numeros[i] = scanner.nextInt();
            }

            System.out.println("\nVocê inseriu os seguintes números:");
            for (int i = 0; i < numeros.length; i++) {
                System.out.println("numeros[" + i + "]: " + numeros[i]);
            }

            int soma = 0;
            for (int i = 0; i < numeros.length; i++) {
                soma += numeros[i];
            }
            double media = soma / (double) numeros.length;

            System.out.println("\nA média dos valores inseridos é: " + media);
        }
}