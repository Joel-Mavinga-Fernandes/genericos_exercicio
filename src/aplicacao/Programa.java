package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.PrintService;

public class Programa {

	public static void main(String[] args) {
		
		PrintService<String> ps = new PrintService<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o numero pessoas da lista: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Digite o nome n"+i);
			String nome = sc.next();
			
			ps.add(nome);
		}
		
		String x = ps.primeiro();
		System.out.println("O primeiro valor é: " + x);
		
		ps.print();
	}

}
