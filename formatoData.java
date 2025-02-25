package aula_3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class formatoData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		
		// Definindo o formato da data
		
	
		@SuppressWarnings("unused")
		DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Digite sua data de nascimento (dd/MM/yyyy)");
		
		String data = scan.nextLine();
		
		//converter string em data
		
		LocalDate dataRecebida = LocalDate.parse(data, formatter);
		
		System.out.println("DaTa digitada: " + data);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
		
		
	}

}
