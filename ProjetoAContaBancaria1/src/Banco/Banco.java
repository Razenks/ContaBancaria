package Banco;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ContaBancaria conta = new ContaBancaria(1,"Rafha", 0.0);
		
		System.out.println("ID Conta: "+conta.getIdConta());
		System.out.println("Titular: "+conta.getTitular());
		System.out.println("Saldo: "+conta.getSaldo());
		
		System.out.println("Escolha uma das opções abaixo:");
		System.out.println("[1]Depositar");
		System.out.println("[2]Saque");
		System.out.println("[0]Sair");
		
		int opcao = scan.nextInt();
		double val;
		
		while(opcao!=0) {
			switch(opcao) {
			case 1: 
				System.out.println("Quanto deseja Depositar? ");
				val = scan.nextDouble();
				conta.depositar(val);
				System.out.println("Esse é o seu Saldo atual: "+conta.getSaldo());
				break;
				
			case 2:
				System.out.println("Quanto deseja Sacar? ");
				val = scan.nextDouble();
				conta.sacar(val);
				System.out.println("Esse é o seu Saldo atual: "+conta.getSaldo());
				break;
				
			default: 
				System.out.println("Opção invalida");
			}
			System.out.println("Escolha uma das opções abaixo:");
			System.out.println("[1]Depositar");
			System.out.println("[2]Saque");
			System.out.println("[0]Sair");
			opcao = scan.nextInt();
		}
		
	}

}
