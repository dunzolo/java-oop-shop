package org.lessons.java.bank;

public class Conto {
	private int numero_conto;
	private String nome_proprietario;
	private double saldo = 0;
	
	public Conto(int numero_conto, String nome_proprietario) {
		setNumeroConto(numero_conto);
		setNomeProprietario(nome_proprietario);
		setSaldo(saldo);
	}
	
	public int getNumeroConto() {
		return numero_conto;
	}
	
	private void setNumeroConto(int numero_conto) {
		this.numero_conto = numero_conto;
	}
	
	public String getNomeProprietario() {
		return nome_proprietario;
	}
	
	public void setNomeProprietario(String nome_proprietario) {
		this.nome_proprietario = nome_proprietario;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getMoney(double money) {
		this.saldo -= money;
		return money;
	}
	
	public double payMoney(double money) {
		this.saldo += money;
		return this.saldo;
	}
}
