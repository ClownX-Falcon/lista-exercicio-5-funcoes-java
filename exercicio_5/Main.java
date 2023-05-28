package exercicio_5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um valor inteiro: ");
		int n = scanner.nextInt();

		imprimirPadrao(n);

		scanner.close();
	}

	public static void imprimirPadrao(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
