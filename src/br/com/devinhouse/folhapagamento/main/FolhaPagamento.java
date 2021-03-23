package br.com.devinhouse.folhapagamento.main;

import br.com.devinhouse.folhapagamento.funcionarios.Funcionario;
import br.com.devinhouse.folhapagamento.funcionarios.FuncionarioAssalariado;
import br.com.devinhouse.folhapagamento.funcionarios.FuncionarioComissionado;
import br.com.devinhouse.folhapagamento.funcionarios.FuncionarioHorista;

public class FolhaPagamento {

	public static void main(String[] args) {
		FuncionarioAssalariado funcionarioAssalariado = new FuncionarioAssalariado("João", "Mendes", 15000);
		FuncionarioComissionado funcionarioComissionado = new FuncionarioComissionado("Bruno", "Ferronato", .75, 6000);
		FuncionarioHorista funcionarioHorista = new FuncionarioHorista("Brayan", "Moncks", 1500, 4);
		
		Funcionario arrayFuncionarios[] = new Funcionario[Funcionario.getTotalDeFuncionarios()];
		
		arrayFuncionarios[0] = funcionarioAssalariado;
		arrayFuncionarios[1] = funcionarioComissionado;
		arrayFuncionarios[2] = funcionarioHorista;
		
		double valorFolha = 0;
		
		for(Funcionario func: arrayFuncionarios) {
			System.out.println(func);
			valorFolha += func.calcularSalarioMensal();
		}
		System.out.println("Folha de pagamento: R$" + valorFolha);
	}

}
