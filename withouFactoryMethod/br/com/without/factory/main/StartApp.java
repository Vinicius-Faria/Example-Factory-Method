package br.com.without.factory.main;

import java.util.Scanner;

public class StartApp {
	
	public static void main(String[] args) {
		
		var scanner = new Scanner(System.in);
		var escolha = 0;
		
		do {

			System.out.println("\nEscolha um tipo de jogo\n");
			System.out.println("1 - Battle Royale");
			System.out.println("2 - Guerra");
			System.out.println("3 - Esporte");
			System.out.println("4 - Automóvel");
			System.out.println("0 - Para sair");

			System.out.print("Digite Aqui : ");
			escolha = scanner.nextInt();

			switch (escolha) {
			case 1:
				System.out.println("\n\nPubg, Free Fire, Fortnite");
				break;
			case 2:
				System.out.println("\n\nCall of Duty, Battlefield");
				break;
			case 3:
				System.out.println("\n\nFifa, Tony hawk");
				break;
			case 4:
				System.out.println("\n\nForza Horizon, Gt Racing, The Crew");
				break;

			default :
				System.out.println("\n\nEscrita invalida, saindo do sistema.");
				scanner.close();
				System.exit(1);
				break;
			}

		} while (true);
	}
}
