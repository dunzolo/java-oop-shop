package org.lessons.java.bank;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Il tuo nome");
		String name = sc.nextLine();
		
		Conto conto = new Conto(name);
		
		while (true) {
			System.out.println("Opzioni");
			System.out.println("1 - Versamento");
			System.out.println("2 - Prelievo");
			System.out.println("3 - Uscire");
			System.out.println("-----------");
			
			int n = sc.nextInt();
			
			if(n < 1 || n > 3) {
				continue;	
			}
			
			switch (n) {
				case 1:{
					System.out.println("Quanto vuoi versare?");
					int money = sc.nextInt();
					conto.payMoney(money);
				}
				break;
				case 2:{
					System.out.println("Quanto vuoi prelevare?");
					int money = sc.nextInt();
					boolean res = conto.getMoney(money);
					System.out.println(res ? "Ok" : "Conto negativo");
				}
				break;
				case 3:
					System.out.println("Saluti!");
					return;
				
			}
			
		}
	}
}
