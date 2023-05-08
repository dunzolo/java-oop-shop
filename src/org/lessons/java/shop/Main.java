package org.lessons.java.shop;

public class Main {
	public static void main(String[] args) {
		
		
		Prodotto p = new Prodotto(
				"ProdottoProva",
				"Descrizione",
				10,
				22
			);
		
		System.out.println(p);
		System.out.println("Prezzo base: " + p.getPrezzo());
		System.out.println("Prezzo con iva: " + p.getPrezzoIva());
	}
}
