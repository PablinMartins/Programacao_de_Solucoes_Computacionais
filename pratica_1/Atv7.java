package programacao_solucao_computacional.pratica_1;
import java.util.Scanner;
public class Atv7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double salario, salario_final, salario_min;
		
		salario_min = 1320.00;
		
		System.out.print("Informe o valor do seu salário: ");
		salario = input.nextDouble();
		
		salario_final = salario / salario_min;
		
		System.out.printf("Você recebe %.2f salários mínimos.", (salario_final));
		
		System.exit(0);
		input.close();
		
	}

}
