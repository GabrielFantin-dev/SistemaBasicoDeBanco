package conta;

public class ContaBancaria {
	private String titular;
	private double saldo;
	
	public String gettitular() {
		return titular;
	}
	public void settitular(String nome) {
		this.titular = nome;
	}
	public double getsaldo() {
		return saldo;
	}
	
	public void setsaldo() {
	this.saldo = 33;
}
	public void depositar(double valor) {
		if (valor > 0 ) {
			saldo += valor;
			System.out.println("Depósito realizado!");
		}else {
			System.out.println("O valor deve ser maior que zero.");
		}
	}
	
	public void sacar (double valor) {
		if (valor <= 0) {
			System.out.print("O valor deve ser maior que zero.");
		}else if (valor > saldo) {
			System.out.println("Saldo insuficiente");
		}else {
			saldo -= valor;
			System.out.println("Saque realizado!");
		}
	}
	public double consultarSaldo() {
		return saldo;
	}
}