package aula_atividade_loop;

import java.util.Scanner;

public class SISTEMA_GESTAO_ALUNOS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner (System.in);
		
		System.out.println("******BEM VINDO A GESTÃO DE ALUNOS******");
		System.out.println();
		System.out.println("Para acessar o sistema vai ser nescessário digitar sua senha.");
		System.out.println();
		
		while(true) {
			
		System.out.println("Me informa sua senha de acesso: ");
		
			int senha = scan.nextInt();
			
			if(senha == 123456) {
				
				System.out.println("A partir de agora você cadastrará os dados solicitados em nosso sistema");
				
				System.out.println();
				
				System.out.println("Primeiro começaremos com o cadastro do estudante: ");

				 scan.nextLine();
				
				System.out.println();
				
				System.out.print("Me informe o nome completo do aluno(A): ");
				String aluno = scan.nextLine();
				
				System.out.println();
				
				System.out.print("Me informe o email do estudante: ");
				String email = scan.nextLine();
				
				System.out.println();
				
				System.out.print("Me informe o número de telfone do estudante: ");
				double num = scan.nextDouble();

				System.out.println();
				
				System.out.print("Agora me informe os dados do professor: ");
				
				System.out.println();
				
				
				System.out.print("Me informe o nome do professor(A): ");
				String professor = scan.next();
				
				System.out.println();
				
				System.out.print("Me informe a matéria dada: ");
				String materia = scan.next();
				
				
				System.out.println("Os dados foram cadastrados com sucesso");
				
				System.out.println("Nome do estudante: " + aluno);
				
				System.out.println();
				
				System.out.println("Email do estudante: " + email);
				
				System.out.println();
				
				System.out.println("número de telefone do estudante: " + num);
				
				System.out.println();
				
				System.out.println("Nome do professor(a): " + professor);
				
				System.out.println();
				
				System.out.println("Matéria dada pelo professor(a): " + materia);
				System.out.println();
				
				break;
				
				
			}else {

				System.out.println("Você digitou a senha errada, tente novamente.");
			}
			
			
		
		}
		
		
		scan.close();
		
	}

}
