package br.com.devinhouse.folhapagamento.funcionarios;

import br.com.devinhouse.utils.Utilitario;

public class FuncionarioComissionado extends Funcionario {
	private double percentualDaComissao;
	private double valorTotalVendido;
	
	public FuncionarioComissionado(String nome, String sobreNome, double percentualDaComissao, double valorTotalVendido) {
		super(nome, sobreNome);
		this.percentualDaComissao = Utilitario.validarPercentual(percentualDaComissao);
		this.valorTotalVendido = Utilitario.validarValorPositivo(valorTotalVendido);
	}
	
	public double getPercentualDaComissao() {
		return percentualDaComissao;
	}

	public void setPercentualDaComissao(double percentualDaComissao) {
		this.percentualDaComissao = Utilitario.validarPercentual(percentualDaComissao);
	}

	public double getValorTotalVendido() {
		return valorTotalVendido;
	}

	public void setValorTotalVendido(double valorTotalVendido) {
		this.valorTotalVendido = Utilitario.validarValorPositivo(valorTotalVendido);
	}

	@Override
	public double calcularSalarioMensal() {
		return this.percentualDaComissao * this.valorTotalVendido;
	}
	
	@Override
	public String toString() {
		return String.format("%s%nValor vendido no m�s: R$%.2f%n"
				+ "Percentual da comiss�o: R$%.2f%n"
				+ "Sal�rio mensal: R$%.2f%n", 
				super.toString(), this.valorTotalVendido, this.percentualDaComissao, this.calcularSalarioMensal());
	}
}
