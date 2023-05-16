package br.com.sistemaCompras;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CasesParaLogin {
	static void casesDeLogin() {
		Scanner inputOpcaoLogin = new Scanner(System.in);
		try {
			int OpcaoSelecionada = inputOpcaoLogin.nextInt();
			switch (OpcaoSelecionada) {
			case 1:
				break;
				
			case 2:
				break;
				
			case 3:
				break;

			default:
				System.out.println("Por favor, insira um valor numérico válido");
				OpcoesParaLogin.OpcoesLogin();
				casesDeLogin();
				break;
			}

		} catch (InputMismatchException erro) {
			System.out.println("Opção inválida, digite uma opção numérica: ");
			System.out.println();
			OpcoesParaLogin.OpcoesLogin();
			casesDeLogin();
		} finally {
			inputOpcaoLogin.close();
		}
	}
}
