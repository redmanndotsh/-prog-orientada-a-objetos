package view;
import java.util.Scanner;

import controller.Biblioteca;
import model.Usuario;

public class Main {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Para ter acesso aos métodos de uma biblioteca, é preciso cadastrá-la primeiro.");
		Biblioteca biblioteca = new Biblioteca();
		System.out.println("Qual será o nome fantasia da biblioteca?");
		biblioteca.setNomeFantasia(leitor.nextLine());
		System.out.printf("Qual será o endereço da biblioteca %s?\n", biblioteca.getNomeFantasia());
		biblioteca.setEndereco(leitor.nextLine());
		System.out.println("Biblioteca cadastrada com sucesso!");
		
		int entrada = -1;
		while (entrada != 0) {
			System.out.println("\nO que deseja fazer a seguir?");
			System.out.println("0. Sair");
			System.out.println("1. Ver dados da biblioteca");
			System.out.println("2. Adicionar um usuário");
			System.out.print("Digite um inteiro correspondente a opção --> ");
			entrada = leitor.nextInt();
			leitor.nextLine();
			switch (entrada) {
			case 0:
				break;
			case 1:
				System.out.println("Você optou por ver dados da biblioteca");
				System.out.println("\n" + biblioteca.toString());
				break;
			case 2:
				System.out.println("Você optou por adicionar um usuário\n");
				Usuario usuario = new Usuario();
				System.out.print("Digite a matrícula do usuário: ");
				usuario.setMatricula(leitor.nextLine());
				System.out.print("Digite o nome do usuário: ");
				usuario.setNome(leitor.nextLine());
				System.out.print("Digite o curso do usuário: ");
				usuario.setCurso(leitor.nextLine());
				System.out.println("Usuário cadastrado com sucesso!");
				break;
			default:
				System.out.println("\nOpção inválida.");
				break;
			}
			
		}
		System.out.println("Sessão encerrada.");
	}
}