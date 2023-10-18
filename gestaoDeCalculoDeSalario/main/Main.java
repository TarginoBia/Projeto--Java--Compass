package gestaoDeCalculoDeSalario.main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import gestaoDeCalculoDeSalario.calculo.CalculoSalario;
import gestaoDeCalculoDeSalario.calculo.bonus.CalculoSalarioComBonus;
import gestaoDeCalculoDeSalario.calculo.semBonus.CalculoSalarioSemBonus;
import gestaoDeCalculoDeSalario.model.Funcionario;

/**
 * 
 * @author Maria Beatriz
 * 
 * esta � uma classe main para cadastrar funcionarios e calcular seu salario
 * 
 *
 */
public class Main {
	/**
	 * metodo principal da classe
	 * @param args
	 */
	public static void main(String[] args) {
		// scanner para ler entradas do usuario
		Scanner scan = new Scanner(System.in);

		// numero de funcionarios a serem cadastrados
		System.out.print("N�mero de funcion�rios a serem cadastrados: ");
		int numFuncionarios = Integer.parseInt(scan.nextLine());

		// lista para armazenar funcionarios
		List<Funcionario> funcionarios = new ArrayList<>();

		//estrategias de calculo do salario
		CalculoSalario estrategiaComBonus = new CalculoSalarioComBonus();
		CalculoSalario estrategiaSemBonus = new CalculoSalarioSemBonus();

		//la�o para cadastro de funcionarios
		for (int i = 0; i < numFuncionarios; i++) {
			Funcionario funcionario = new Funcionario();

			//nome do funcionario
			System.out.println("Digite o nome do funcion�rio: ");
			String nome = scan.nextLine();
			funcionario.setNome(nome);

			//salario do funcionario
			System.out.println("Digite o sal�rio do funcion�rio: ");
			float salario = Float.parseFloat(scan.nextLine());
			//lan�amento de exce��o para caso o salario seja invalido
			try {
				funcionario.setSalario(salario);
			} catch (Exception e) {
				e.printStackTrace();
			}

			//estrategia de calculo com base no salario
			if (salario <= 1000) {
				funcionario.setEstrategiaCalculo(estrategiaComBonus);
			} else if (salario <= 2000) {
				funcionario.setEstrategiaCalculo(estrategiaSemBonus);
			} else {
				funcionario.setEstrategiaCalculo(estrategiaSemBonus);
			}

			// adiciona o funcionario � lista
			funcionarios.add(funcionario);
		}

		// Exibe os funcionarios cadastrados e seus salarios
		System.out.println("\nFuncion�rios cadastrados:");
		for (Funcionario funcionario : funcionarios) {
			float salarioComBonus = funcionario.calcularSalario();
			System.out.println("Nome: " + funcionario.getNome());
			System.out.println("Sal�rio: " + funcionario.getSalario());
			System.out.println("Sal�rio com b�nus/desconto: " + salarioComBonus);
		}

		// fecha o scanner
		scan.close();
	}
}
