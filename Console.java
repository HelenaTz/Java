package fundamentos;
import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira a idade");
		int idade = entrada.nextInt();
		
		System.out.println("Idade" + idade);
	}
}
