package br.com.devinhouse.folhapagamento.main;

import br.com.devinhouse.contas.Fatura;
import br.com.devinhouse.folhapagamento.funcionarios.Funcionario;
import br.com.devinhouse.folhapagamento.funcionarios.FuncionarioAssalariado;
import br.com.devinhouse.folhapagamento.funcionarios.FuncionarioComissionado;
import br.com.devinhouse.folhapagamento.funcionarios.FuncionarioHorista;
import br.com.devinhouse.interfaces.Pagavel;

public class FolhaPagamento {

	public static void main(String[] args) {
		FuncionarioAssalariado funcionarioAssalariado = new FuncionarioAssalariado("Jo�o", "Mendes", 15000);
		FuncionarioComissionado funcionarioComissionado = new FuncionarioComissionado("Bruno", "Ferronato", .75, 6000);
		FuncionarioHorista funcionarioHorista = new FuncionarioHorista("Brayan", "Moncks", 1500, 4);
		
		Pagavel arrayPagaveis[] = new Pagavel[5];
		
		arrayPagaveis[0] = funcionarioAssalariado;
		arrayPagaveis[1] = funcionarioComissionado;
		arrayPagaveis[2] = funcionarioHorista;
		arrayPagaveis[3] = new Fatura("Mauricio", 853.00);
		arrayPagaveis[4] = new Fatura("Gustavo", 259.95);
		
		double valoresAPagar = 0;
		
		for(Pagavel conta: arrayPagaveis) {
			System.out.println(conta);
			valoresAPagar += conta.obterValorDevido();
		}
		System.out.println("Folha de pagamento: R$" + valoresAPagar);
	}

}
