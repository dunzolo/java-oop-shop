package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	
	private int codice;
	private String nome;
	private String descrizione;
	private double prezzo;
	private int iva;
	
	public Prodotto(String nome, String descrizione, double prezzo, int iva) {
		Random rnd = new Random();
		int codice = rnd.nextInt();
		
		setCodice(codice);
		setNome(nome);
		setDescrizione(descrizione);
		setPrezzo(prezzo);
		setIva(iva);
	}
	
	public int getCodice() {
		return codice;
	}
	
	private void setCodice(int codice) {
		
		if(codice <= 0) return;
		this.codice = codice;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public double getPrezzo() {
		return prezzo;
	}
	
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	public int getIva() {
		return iva;
	}
	
	public void setIva(int iva) {
		this.iva = iva;
	}
	
	public double getPrezzoIva() {
		double calc = (this.prezzo / 100d) * this.iva;
		return this.prezzo + calc;
	}
	
	@Override
	public String toString() {
		return "Prodotto: " + codice + " - " + nome;
	}
}
