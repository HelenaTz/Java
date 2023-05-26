package fundamentos;

import java.util.Scanner;

public class Basico {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//1
		int n1 = entrada.nextInt();
		int n2 = entrada.nextInt();
		
		int soma = n1 + n2;
		
		System.out.println("SOMA = " + soma);
		
		//2
		double raio, area, pi = 3.14159;
		
		raio = entrada.nextDouble();
		
		area = pi * (raio * raio);
		
		System.out.println("A=" + area);
		
		//3
		int a, b, c, d, dif;
		a = entrada.nextInt();
		b = entrada.nextInt();
		c = entrada.nextInt();
		d = entrada.nextInt();
		
		dif = (a * b - c * d);
		
		System.out.println("Diferença = " + dif);
		
		//4
		int nFuncionario, horasTrabalhadas;
		double valorHora, salario;
		
		System.out.println("Insira o número do funcionário: ");
		nFuncionario = entrada.nextInt();
		
		System.out.println("Insira a quantidade de horas trabalhadas: ");
		horasTrabalhadas = entrada.nextInt();
		
		System.out.println("Insira o valor da hora trabalhada: ");
		valorHora = entrada.nextDouble();
		
		salario = valorHora * horasTrabalhadas;
		
		System.out.println("NUMBER = " + nFuncionario + "\nSALARY = " + salario);
		
		//5
		int numero;
		
		numero = entrada.nextInt();
		if(numero > 0) {
			System.out.println("NÃO NEGATIVO");
		}else {
			System.out.println("NEGATIVO");
		}
		
		if(numero % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("ÍMPAR");
		}
		
		//6
		int A, B;
		A = entrada.nextInt();
		B = entrada.nextInt();
		
		if(A % B == 0 || B % A == 0) {
			System.out.println("São múltiplos");
		}else {
			System.out.println("Não são múltiplos");
		}
		
		//7
		int codigo, quantidade;
		double total = 0;
		codigo = entrada.nextInt();
		quantidade = entrada.nextInt();
		
		if(codigo == 1) {
			total = quantidade * 4.00;
		}else if(codigo == 2) {
			total = quantidade * 4.50;
		}else if(codigo == 3) {
			total = quantidade * 5.00;
		}else if(codigo == 4) {
			total = quantidade * 2.00;
		}else if(codigo == 5) {
			total = quantidade * 1.50;
		}
		
		System.out.println("Total: R$ " + total);
		
		//8
		int senha;
		senha = entrada.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha inválida");
			senha = entrada.nextInt();
		}
		System.out.println("Acesso permitido");		
		
		//9
		int x, y;
		
		x = entrada.nextInt();
		y = entrada.nextInt();
		
		while(x != 0 || y != 0) {
			if(x > 0 && y > 0) {
				System.out.println("primeiro");
			}else if(x > 0 && y < 0) {
				System.out.println("quarto");
			}else if(x < 0 && y < 0) {
				System.out.println("terceiro");
			}else if(x < 0 && y > 0) {
				System.out.println("segundo");
			}
			x = entrada.nextInt();
			y = entrada.nextInt();
		}
		
		//10
		int z;
		z = entrada.nextInt();
		
		for(int i = 0; i <= z; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		//11
		int n,cont, X, in, out;
		cont = 1;
		in = 0;
		out = 0;
		n = entrada.nextInt();
		
		while(cont <= n) {
			X = entrada.nextInt();
			if(X >= 10 && X <= 20) {
				in ++;
			}else {
				out ++;
			}
			cont ++;
		}
		System.out.println(in + " in" + "\n" + out + " out");
		
		//12
		int m, o, p;
		double divisao;
		m = entrada.nextInt();
		
		for(int i = 0; i <= m; i++) {
			o = entrada.nextInt();
			p = entrada.nextInt();
			
			if (y == 0) {
				System.out.println("Divisão impossível");
			}
			else {
				divisao = (double) o / p;
				System.out.println(divisao);
			}
		}
		
		entrada.close();
	}

}
