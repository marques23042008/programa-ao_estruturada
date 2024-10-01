package Encapulamento;

import java.util.Scanner;

public class aula {
	public static void main(String[] args) {
		 int tamanho = 30; 
	        String[] nomes = new String[tamanho];

	        Scanner scanner = new Scanner(System.in);
	        for (int i = 0; i < tamanho; i++) {
	            System.out.print("Digite o nome do colega " + (i + 1) + ": ");
	            nomes[i] = scanner.nextLine();
	        }
	        System.out.println("\nNomes dos colegas de turma:");
	        for (int i = 0; i < tamanho; i++) {
	            System.out.println(nomes[i]);
	        }


	}

}
