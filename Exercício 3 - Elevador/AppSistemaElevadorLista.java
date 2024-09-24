package aula06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppSistemaElevadorLista {


	static List<Elevador> elevadores = new ArrayList<Elevador>();
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int opcao = 0;
		do {
			System.out.println("\n*** Elevador - Seletor de Opções ***");
			System.out.println();
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Consultar");
			System.out.println("3 - Excluir");
			System.out.println("4 - Por em Manutenção");
			System.out.println("5 - Por em Operação");
			System.out.println("6 - Alterar Limite de Pessoas");
			System.out.println("7 - Listar");
			System.out.println("8 - Entrada de pessoas");
			System.out.println("9 - Saída de pessoas");
			System.out.println("0 - Finalizar");

			System.out.print("\nOpção: ");
			opcao = input.nextInt();

			switch (opcao) {
				case 1:
					cadastraElevador();
					break;
				case 2:
					consultaElevador();
					break;
				case 3:
					excluiElevador();
					break;
				case 4:
					mantemElevador();
					break;
				case 5:
					operaElevador();
					break;
				case 6:
					alteraLimite();
					break;
				case 7:
					listaElevadores();
					break;
				case 8:
					entradaPessoas();
					break;
				case 9:
					saidaPessoas();
					break;
				case 0:
					System.out.println("\n--- PROGRAMA FINALIZADO");
					break;
				default:
					System.out.println("\nOpção incorreta");

			}

		} while (opcao !=0);
		input.close();
	}


	public static Elevador pesquisaElevadorPorCodigo(int codigo) {
		for (Elevador elevador : elevadores) {
			if (codigo == elevador.getCodigo()) {
				return elevador;
			}
		}
		return null;

	}


	public static void mostrarElevador(Elevador elevador) {
		System.out.printf("\nCódigo...............: %d\n", elevador.getCodigo());
		System.out.printf("Limite de pessoas....: %d\n", elevador.getLimitePessoas());
		System.out.printf("Pessoas transportadas: %d\n", elevador.getPessoasTransportadas());
		System.out.printf("Situação.............: %s\n", elevador.getStatus());
	}

	public static void entradaPessoas() {
		do {
			System.out.println("\n*** Entrada de Pessoas ***\n");

			if (elevadores.isEmpty()) {
				System.out.println("Lista vazia");
				return;
			}

			System.out.print("\nCódigo do elevador para realizar a entrada ou [0] para retornar: ");
			int codigo = input.nextInt();

			if (codigo == 0) {
				break;
			}

			Elevador elevadorEncontrado = pesquisaElevadorPorCodigo(codigo);

			if (elevadorEncontrado == null) {
				System.out.println("\n-- Código não cadastrado --\n");
				continue;
			}

			System.out.printf("\n-- Estado do elevador código %d: %s",
					elevadorEncontrado.getCodigo(),
					elevadorEncontrado.getStatus());

			if(!elevadorEncontrado.getStatus().equals("Em operação")) {
				System.out.println("\n-- Esse elevador não está em operação --\n");
				continue;
			}

			do {
				System.out.println("\n-- Número de pessoas que entraram no elevador: ");
				int quantidade = input.nextInt();

				if(quantidade == 0) {
					break;
				}

				elevadorEncontrado.registraEntrada(quantidade);
				mostrarElevador(elevadorEncontrado);
				System.out.println("\n-- Entrada efetuada");

				if(elevadorEncontrado.getStatus().equals("Bloqueado")){
					System.out.printf("\n-- O elevador de código %d foi bloqueado\n", elevadorEncontrado.getCodigo());
					break;
				}
			} while (true);
		} while (true);
	}

	public static void saidaPessoas() {
		do {
			System.out.println("\n*** Saída de Pessoas ***\n");

			if (elevadores.isEmpty()) {
				System.out.println("Lista vazia");
				return;
			}

			System.out.print("\nCódigo do elevador para realizar a saída ou [0] para retornar: ");
			int codigo = input.nextInt();

			if (codigo == 0) {
				break;
			}

			Elevador elevadorEncontrado = pesquisaElevadorPorCodigo(codigo);

			if (elevadorEncontrado == null) {
				System.out.println("\n-- Código não cadastrado --\n");
				continue;
			}
			System.out.printf("\n-- Estado do elevador código %d: %s",
					elevadorEncontrado.getCodigo(),
					elevadorEncontrado.getStatus());

			if(!elevadorEncontrado.getStatus().equals("Em operação")) {
				System.out.println("\n-- Esse elevador não está em operação --\n");
				continue;
			}

			do {
				System.out.println("\n-- Número de pessoas que saíram no elevador: ");
				int quantidade = input.nextInt();

				if(quantidade == 0) {
					break;
				}

				if(quantidade > elevadorEncontrado.getPessoasTransportadas()){
					System.out.println("\n-- Quantidade maior do que o número de pessoas transportadas --\n");
					continue;
				}

				elevadorEncontrado.registraSaida(quantidade);
				mostrarElevador(elevadorEncontrado);
				System.out.println("\n-- Saída efetuada");
			} while (true);
		} while (true);
	}


	public static void cadastraElevador() {

		do {

			System.out.println("\n*** Cadastro de Elevador ***\n");

			System.out.printf("\nCódigo do elevador para cadastro ou [0] para retornar: ");
			int codigo = input.nextInt();

			if (codigo == 0) {
				return;
			}

			if (pesquisaElevadorPorCodigo(codigo) != null) {
				System.out.println("\n-- Código já cadastrado --\n");
				continue;
			}

			elevadores.add(new Elevador(codigo));

			System.out.println("\n-- Cadastro efetuado --\n");

		} while (true);
	}


	public static void consultaElevador() {

		do {
			System.out.println("\n*** Consulta de Elevador ***\n");
			if (elevadores.size() == 0) {
				System.out.println("Lista vazia");
				return;
			}

			System.out.printf("\nCódigo do elevador para consultar ou [0] para retornar: ");
			int codigo = input.nextInt();
			if (codigo == 0) {
				return;
			}

			Elevador elevadorEncontrado = pesquisaElevadorPorCodigo(codigo);

			if (elevadorEncontrado == null) {
				System.out.println("\n-- Código não cadastrado --\n");
				continue;
			}
			mostrarElevador(elevadorEncontrado);
		} while (true);
	}


	public static void excluiElevador() {
		System.out.println("\n*** Exclusão de Elevador ***\n");
		if (elevadores.size() == 0) {
			System.out.println("Lista vazia");
			return;
		}

		System.out.printf("\nCódigo do elevador excluir ou [0] para finalizar: ");
		int codigo = input.nextInt();

		if (codigo == 0) {
			return;
		}

		Elevador elevadorEncontrado = pesquisaElevadorPorCodigo(codigo);

		if (elevadorEncontrado == null) {
			System.out.println("\n-- Código não cadastrado --\n");
			return;
		}
		mostrarElevador(elevadorEncontrado);

		input.nextLine();
		char confirma;
		do {
			System.out.printf("\nConfirma exclusão [S/N]: ");
			confirma = input.nextLine().charAt(0);
			confirma = Character.toUpperCase(confirma);
			if(confirma!='S' && confirma!='N') {
				continue;
			}
			break;
		} while (true);
		if (confirma=='S') {
			elevadores.remove(elevadorEncontrado);
			System.out.println("-- Exclusão efetuada");
		}
		else {
			System.out.println("-- Exclusão cancelada");
		}
	}


	public static void mantemElevador() {
		System.out.println("\n*** Coloca Elevador em Manutenção ***\n");
		if (elevadores.size() == 0) {
			System.out.println("Lista vazia");
			return;
		}

		System.out.printf("\nCódigo do elevador: ");
		int codigo = input.nextInt();

		Elevador elevadorEncontrado = pesquisaElevadorPorCodigo(codigo);

		if (elevadorEncontrado == null) {
			System.out.println("\n-- Código não cadastrado --\n");
			return;
		}
		mostrarElevador(elevadorEncontrado);

		if (elevadorEncontrado.getStatus().equals("Em manutenção")) {
			System.out.println("-- Elevador já encontra-se em manutenção");
			return;
		}

		input.nextLine();
		char confirma;
		do {
			System.out.printf("\nConfirma manutenção [S/N]: ");
			confirma = input.nextLine().charAt(0);
			confirma = Character.toUpperCase(confirma);
			if(confirma!='S' && confirma!='N') {
				continue;
			}
			break;
		} while (true);
		if (confirma=='S') {
			elevadorEncontrado.registraManutencao();
			mostrarElevador(elevadorEncontrado);
			System.out.println("\n-- Elevador colocado em manutenção");
		}
		else {
			System.out.println("-- Manutenção cancelada");
		}
	}


	public static void operaElevador() {
		System.out.println("\n*** Coloca Elevador em Operação ***\n");
		if (elevadores.size() == 0) {
			System.out.println("Lista vazia");
			return;
		}

		System.out.printf("\nCódigo do elevador: ");
		int codigo = input.nextInt();

		Elevador elevadorEncontrado = pesquisaElevadorPorCodigo(codigo);

		if (elevadorEncontrado == null) {
			System.out.println("\n-- Código não cadastrado --\n");
			return;
		}
		mostrarElevador(elevadorEncontrado);

		if (!elevadorEncontrado.getStatus().equals("Em manutenção")) {
			System.out.println("-- Elevador não encontra-se em manutenção");
			return;
		}

		input.nextLine();
		char confirma;
		do {
			System.out.printf("\nConfirma retorno a operação [S/N]: ");
			confirma = input.nextLine().charAt(0);
			confirma = Character.toUpperCase(confirma);
			if(confirma!='S' && confirma!='N') {
				continue;
			}
			break;
		} while (true);

		if (confirma=='S') {
			elevadorEncontrado.registraOperacao();
			mostrarElevador(elevadorEncontrado);
			System.out.println("\n-- Elevador colocado em operação");
		}
		else {
			System.out.println("-- Manutenção cancelada");
		}
	}


	public static void alteraLimite() {
		System.out.println("\n*** Altera Limite de Pessoas ***\n");
		if (elevadores.size() == 0) {
			System.out.println("Lista vazia");
			return;
		}

		System.out.printf("\nCódigo do elevador: ");
		int codigo = input.nextInt();

		Elevador elevadorEncontrado = pesquisaElevadorPorCodigo(codigo);

		if (elevadorEncontrado == null) {
			System.out.println("\n-- Código não cadastrado --\n");
			return;
		}
		mostrarElevador(elevadorEncontrado);

		System.out.println("\nNovo limite: ");
		int novoLimite = input.nextInt();
		if (elevadorEncontrado.alteraLimite(novoLimite)) {
			System.out.println("Elevador não encontra-se em manutenção");
		}
		else {
			mostrarElevador(elevadorEncontrado);
			System.out.println("\n-- Limite de pessoas no elevador alterado");
		}
	}


	public static void listaElevadores() {
		System.out.println("\n*** Listagem de Elevador ***\n");

		if (elevadores.size() == 0) {
			System.out.println("Lista vazia");
			return;
		}

		input.nextLine();
		char status;
		do {
			System.out.printf("\nSituação para listagem : ");
			System.out.printf("\nB - Bloqueado");
			System.out.printf("\nM - Manutenção");
			System.out.printf("\nO - Operação");
			System.out.printf("\nT - Todos");
			System.out.print("\nFiltar por situação: ");
			status = input.nextLine().charAt(0);
			status = Character.toUpperCase(status);
			if(status!='B' && status!='M' && status!='O' && status!='T') {
				System.out.println("-- Opção inválida");
				continue;
			}
			break;
		} while (true);

		System.out.println("=======================================");
		System.out.println("Código Status        Capacidade Pessoas");
		System.out.println("=======================================");

		for (Elevador elevador: elevadores) {
			if (status=='B' && elevador.getStatus().equals("Bloqueado") ||
					status=='M' && elevador.getStatus().equals("Em manutenção") ||
					status=='O' && elevador.getStatus().equals("Em operação") ||
					status=='T' ) {

				System.out.printf("%-6d %-13s %10d %7d\n",
						elevador.getCodigo(),
						elevador.getStatus(),
						elevador.getLimitePessoas(),
						elevador.getPessoasTransportadas());
			}
			else {
				//System.out.printf("%dº Elemento nulo\n", i);
			}
		}

		System.out.println("=======================================");
	}

}
