package br.com.devinhouse.utils;

public class Utilitario {

	public static double validarValorPositivo(double valor) {
		if (valor >= 0) {
			return valor;
		}
		return 0;
	}
	
	public static double validarPercentual(double valor) {
		if (valor >= 0 && valor <= 1) {
			return valor;
		}
		return 0;
	}
}
