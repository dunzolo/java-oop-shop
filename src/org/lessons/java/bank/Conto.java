package org.lessons.java.bank;

import java.util.Random;

public class Conto {
	private int numero_conto;
	private String nome_proprietario;
	private int saldo;
	
	public Conto(String nome_proprietario) {
		
		Random rnd = new Random();
		
		numero_conto = rnd.nextInt(0, 1001);
		setNomeProprietario(nome_proprietario);
		saldo = 0;
	}
	
	public int getNumeroConto() {
		return numero_conto;
	}
	
	
	public String getNomeProprietario() {
		return nome_proprietario;
	}
	
	public void setNomeProprietario(String nome_proprietario) {
		this.nome_proprietario = nome_proprietario;
	}
	
	public int getSaldo() {
		return saldo;
	}
	
	public String getFormatted() {
		return String.format(".%2d", getSaldo());
	}
	
	public boolean getMoney(int money) {
		if(money < 0) return false;
		
		if(money <= saldo) {
			saldo -= money;
			return true;
		}
		else {
			return false;
		}
	}
	
	public void payMoney(int money) {
		if(money < 0) return;
		
		saldo += money;
	}
}
