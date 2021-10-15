package br.com.with.factory.main;

import java.util.Scanner;

import br.com.with.factoryMethod.TypeFactory;

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
				var battle = TypeFactory.ListGame(1);
				battle.GetTypeGames();
				break;
			case 2:
				var guerra = TypeFactory.ListGame(2);
				guerra.GetTypeGames();
				break;
			case 3:
				var esporte = TypeFactory.ListGame(3);
				esporte.GetTypeGames();
				break;
			case 4:
				var automativo = TypeFactory.ListGame(4);
				automativo.GetTypeGames();
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