package application;

import java.util.Locale;
import java.util.Scanner;

import entity.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nome = sc.nextLine();
		String inicial = new String();
		
		Account account = new Account();
		
		do {
		System.out.print("Há valor inicial de depósito (s/n)?");
		inicial = sc.nextLine();
		
		if (inicial.equals("s")) {
			System.out.println("Digite o valor de depósito inicial: ");
			double valor = sc.nextDouble();
			account = new Account(number, nome, valor);
		}
		else if (inicial.equals("n")){
			account = new Account(number, nome);
		}
		else {
			
		}
		
		} while(!inicial.equals("s") && !inicial.equals("n"));
		
		System.out.println("\n\nAccount data:\nAccount " 
							+ account.getNumber()
							+ ", Holder: "
							+ account.getName()
							+ ", Balance: $ "
							+ account.getValue());
		
		System.out.println("\nEnter a deposit value: ");
		double deposit = sc.nextDouble();
		account.deposit(deposit);
		
		System.out.println("\n\nUpdate account data:\nAccount " 
				+ account.getNumber()
				+ ", Holder: "
				+ account.getName()
				+ ", Balance: $ "
				+ String.format("%.2f", account.getValue()));
		
		System.out.println("\nEnter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		
		System.out.println("\n\nUpdate account data:\nAccount " 
				+ account.getNumber()
				+ ", Holder: "
				+ account.getName()
				+ ", Balance: $ "
				+ String.format("%.2f", account.getValue()));
		
		
		
		sc.close();
		

	}

}
