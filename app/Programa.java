package app;

import java.util.Scanner;

import entidades.ContaCorrente;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Deseja fazer Deposito? [S/N] " );
		String p = sc.next();
		if(p.equalsIgnoreCase("s")) {
			System.out.print("Entre com valor= " );
			Double v = sc.nextDouble();
			ContaCorrente cc = new ContaCorrente(1022, "Fabricio Neto", v, null);
			System.out.println(cc);
			
			System.out.println("Deseja realizar saque? [S/N]");
			String p1 = sc.next();
			if(p1.equalsIgnoreCase("s")) {
				System.out.print("Entre com valor= " );
				Double s = sc.nextDouble();
				cc.saque(s);
				System.out.println(cc);
			} else {
				System.out.println(cc);
			}
		}
		System.out.println("FIM");
	}
}
