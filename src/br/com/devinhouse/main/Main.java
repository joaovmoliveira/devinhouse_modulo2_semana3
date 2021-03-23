package br.com.devinhouse.main;

import br.com.devinhouse.faculdade.gastos.Funcionario;
import br.com.devinhouse.faculdade.gastos.GeradorRelatorio;
import br.com.devinhouse.faculdade.gastos.Professor;
import br.com.devinhouse.faculdade.gastos.Reitor;

public class Main {

	public static void main(String[] args) {
		Professor prof = new Professor();
		prof.setNome("João");
		prof.setHorasDeAula(40);
		prof.setSalario(50);
		
		GeradorRelatorio.adiciona(prof);
		
	}

}
