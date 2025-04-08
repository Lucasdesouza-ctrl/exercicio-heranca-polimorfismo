package cinema;

import java.util.Scanner;

import tickets.FamilyTickets;
import tickets.HalfTickets;
import tickets.Tickets;

public class Main {
	private static Tickets tickets = new Tickets();
	private static HalfTickets halfTickets = new HalfTickets();
	private static FamilyTickets familyTickets = new FamilyTickets();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Olá seja bem-vindo");
		System.out.print("Digite seu nome: ");
		var name = scan.next();
		System.out.printf("%s, qual tipo de ingresso você deseja ?%n", name);
		System.out.printf("%n=======================%n");
		System.out.printf("%n1 - Ingresso comum%n");
		System.out.println("2 - Ingresso família (apartir de 3 pessoas -> desconto de 5%)");
		System.out.println("3 - Meia entrada (estudantes ou menores de 12 anos)");
		var choice = scan.nextInt();
		while (choice > 3 || choice < 1) {
			System.out.println("Por favor insira uma opção válida.");
			choice = scan.nextInt();
		}
		switch (choice) {
		case 1:
			System.out.print("Quantos ingressos deseja ?");
			var numberOfTickets = scan.nextInt();
			tickets.setNumberOfTickets(numberOfTickets);
			
			tickets.setTotalValue();
			tickets.showResult();
			break;
		case 2:
			System.out.print("Quantos ingressos deseja ?");
			numberOfTickets = scan.nextInt();
			familyTickets.setNumberOfTickets(numberOfTickets);
			
			familyTickets.calculateTotalValue();
			familyTickets.showResult();
			break;
		case 3:
			System.out.print("Quantos ingressos deseja ?");
			numberOfTickets = scan.nextInt();
			halfTickets.setNumberOfTickets(numberOfTickets);
			
			halfTickets.setTotalValue();
			halfTickets.showResult();
			break;
		}
		System.out.println("Muito Obrigado pela preferência. Volte sempre !");
		scan.close();
	}

}
