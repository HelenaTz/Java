package fundamentos;

public class ExercicioVariaveis {
	public static void main(String[] args) {
		int celsius = 0;
		int fahrenheith = 32;
		
		double convertidoCelsius = (celsius * 9/5) + 32;
		System.out.println(convertidoCelsius);
		
		double convertidoFah = (fahrenheith - 32) * 5/9;
		System.out.println(convertidoFah);
		//Scanner: Scanner nome_scanner = new Scanner(System.in);
	}
}
