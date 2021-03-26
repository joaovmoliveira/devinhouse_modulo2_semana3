package br.com.devinhouse.folhapagamento.funcionarios;
import br.com.devinhouse.interfaces.Pagavel;

public abstract class Funcionario implements Pagavel{
	private String nome;
	private String sobreNome;
	private static int totalDeFuncionarios;
	
	public Funcionario(String nome, String sobreNome) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		totalDeFuncionarios++;
	}
	
	@Override
	public double obterValorDevido() {
		return this.calcularSalarioMensal();
	}
	
	
	public static int getTotalDeFuncionarios() {
		return totalDeFuncionarios;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	
	public abstract double calcularSalarioMensal();
	
	
	@Override
	public String toString() {
		return String.format("%s: %s %s", "Nome", this.nome, this.sobreNome);
	}
}
