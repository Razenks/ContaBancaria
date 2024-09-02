package Banco;

public class ContaBancaria {
	private int idConta;
	private String titular;
	private double saldo;
	
	public ContaBancaria(int idConta, String titular, double saldo) {
		super();
		this.idConta = idConta;
		this.titular = titular;
		this.saldo = saldo;
	}
	public int getIdConta() {
		return idConta;
	}
	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(Double valor) {
		saldo += valor;
		System.out.println("Voce realizou o deposito com SUCESSO!");
	}
	
	public void sacar (Double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			System.out.println("Voce realizou um saque com SUCESSO");
		} else {
			System.out.println("Voce nao tem Saldo Suficiente");
		}
		
	}
	
}
