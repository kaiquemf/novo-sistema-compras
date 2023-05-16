package br.com.sistemaCompras;
import java.util.Scanner;

public class SistemaSaida {
	static void sistemaDeSaidaLogin() {
		
		Scanner inputDeSaida = new Scanner(System.in);
		String escolhaSaida = RemoverAcentos.removerAcentos(inputDeSaida.nextLine());
		// pendente if para carrinho vazio;
		try {			
			if (escolhaSaida.equalsIgnoreCase("sim")) {
				System.out.println("Ok, até a próxima!");
			} else if (escolhaSaida.equalsIgnoreCase("nao")) {
				System.out.println("Ok, o que deseja fazer?");
				OpcoesParaLogin.OpcoesLogin();
				CasesParaLogin.casesDeLogin();
			} else {
				System.out.println("Selecione uma opção válida (sim ou não): ");
				sistemaDeSaidaLogin();
		}
	} finally {
			inputDeSaida.close();
		}
	}
}
