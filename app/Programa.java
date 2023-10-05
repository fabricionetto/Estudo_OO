package app;

import java.util.Scanner;

import entidades.ContaCorrente;
import entidades.ContaPoupanca;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Deseja qual tipo de conta? [1] = Conta Corrente ; [2] = Conta Poupança ");
		int num = sc.nextInt();
		switch (num) {
		case 1: {
			System.out.println("[1] = Conta Corrente");
			System.out.println("Deseja fazer Deposito? [S/N] " );
			String p = sc.next();
			if(p.equalsIgnoreCase("s")) {
				System.out.print("Entre com valor= " );
				Double v = sc.nextDouble();
				ContaCorrente cc = new ContaCorrente(1022, "Fabricio Neto", v, null);
				System.out.println(cc);
				
				System.out.print(" ");
				System.out.println("Deseja realizar saque? [S/N]");
				String p1 = sc.next();
				if(p1.equalsIgnoreCase("s")) {
					System.out.print("Entre com valor= " );
					Double s = sc.nextDouble();
					cc.saque(s);
					System.out.println(cc);
				}	
			}
		break;
		}
		case 2:{
			System.out.println("[2] = Conta Poupança ");
			System.out.println("Deseja fazer Deposito? [S/N] " );
			String p = sc.next();
			if(p.equalsIgnoreCase("s")) {
				System.out.print("Entre com valor= " );
				Double v = sc.nextDouble();
				ContaPoupanca cp = new ContaPoupanca(1022, "Fabricio Neto", v);
				System.out.println(cp);
				System.out.print(" ");
				System.out.println("Deseja realizar saque? [S/N]");
				String p1 = sc.next();
				if(p1.equalsIgnoreCase("s")) {
					System.out.print("Entre com valor= " );
					Double s = sc.nextDouble();
					cp.saque(s);
					System.out.println(cp);
				}	
			}
			break;
		}
		default:
			System.out.println("Fim do swith ");
		}
		/*System.out.println("Deseja fazer Deposito? [S/N] " );
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
		}*/
		System.out.println("FIM");
	}
}
