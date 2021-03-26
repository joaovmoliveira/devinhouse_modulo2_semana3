package br.com.devinhouse.contas;

import br.com.devinhouse.interfaces.Pagavel;

public class Fatura implements Pagavel{
	String fornecedor;
	double totalFatura;
	
	public Fatura(String fornecedor, double totalFatura) {
		this.fornecedor = fornecedor;
		this.totalFatura = totalFatura;
	}
	
	@Override
	public double obterValorDevido() {
		return this.totalFatura;
	}
	
	@Override
	public String toString() {		
		return String.format("Fornecedor: %s, valor da fatura:%.2f.", this.fornecedor, this.totalFatura);
	}
	
	
	

}
