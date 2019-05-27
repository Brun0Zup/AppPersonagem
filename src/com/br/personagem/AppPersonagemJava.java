package com.br.personagem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppPersonagemJava {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Declarando o ArrayList
		List<String> listaDePersonagens = new ArrayList<String>();
		System.out.println(listaDePersonagens.isEmpty());

		String nomePersonagem;
		int controleA = 1;
		
		
		boolean teste1;

		while (controleA == 1) {
			Scanner entrada = new Scanner(System.in);
			
			// Perguntas
			System.out.println("");
			System.out.println("Didite 1 para verificar se o personagem ja esta cadastrado");
			System.out.println("Digite 3 para alterar personagem");
			System.out.println("Digite 4 para excluir");
			System.out.println("Digite 5 para adicionar");
			System.out.println("Digite 6 exit");
			System.out.println("");

			int averiguar = entrada.nextInt();

			if (averiguar == 1) {

				System.out.println("Digite o nome do personagem");
				nomePersonagem = entrada.nextLine();
				teste1 = listaDePersonagens.contains(nomePersonagem);

				if (teste1 == true) {
					System.out.println("O personagem " + nomePersonagem + " ja está lista");

				} else {
					System.out.println("O personagem " + nomePersonagem + " Não foi encontrado na lista");
					averiguar = 1;

				}

		
			} else if (averiguar == 3) {

				boolean teste3 = listaDePersonagens.isEmpty();

				if (teste3 == false) {

					System.out.println("Digite o personagem a ser alterado");
					String excluir = entrada.nextLine();

					boolean teste2 = listaDePersonagens.contains(excluir);

					if (teste2 == true) {

						System.out.println("");
						System.out.println("Por qual personagem:");
						String add = entrada.nextLine();

						listaDePersonagens.remove(excluir);
						listaDePersonagens.add(add);

					} else {

						System.out.println("O personegem " + excluir + " nao foi encontrado na lista:");
						System.out.println("");

					}

				} else {
					System.out.println("A lista esta vazia.");

				}

			} else if (averiguar == 4) {

				boolean teste3 = listaDePersonagens.isEmpty();

				if (teste3 == false) {

					System.out.println("Digite o personagem a ser excluido da lista");
					String excluir = entrada.nextLine();

					boolean teste2 = listaDePersonagens.contains(excluir);

					if (teste2 == true) {

						listaDePersonagens.remove(excluir);

					} else {

						System.out.println("O personegem " + excluir + " nao foi encontrado na lista:");
						System.out.println("");

					}
				} else {
					System.out.println("A lista esta vazia.");

				}

			} else if (averiguar == 5) {
				int condicao = 1;

				while (condicao == 1) {

					System.out.println("Digite o nome do personagem: ");
					nomePersonagem = entrada.nextLine();

					boolean teste2 = listaDePersonagens.contains(nomePersonagem);

					if (teste2 == false) {

						listaDePersonagens.add(nomePersonagem);

						System.out.println("O personegem " + nomePersonagem + " Foi adicionado a lista");
						System.out.println("");

					} else {

						System.out.println("O personegem " + nomePersonagem + " Ja foi adicionado na lista:");
						System.out.println("");

					}

					System.out.println("Digite 1 para tentar outro ");
					System.out.println("Ou 0 para voltar para o menu principal");
					condicao = entrada.nextInt();

				}

			} else if (averiguar == 6) {

				controleA = 0;

			}

		}

	}

}
