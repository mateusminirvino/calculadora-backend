package br.com.db1start.calculadora.calculadoraapi.dto;

import br.com.db1start.calculadora.calculadoraapi.model.OperacaoMatematica;

public class CalculadoraDTO {
	
	private OperacaoMatematica operacao;
	
	private Double numeroUm;
	
	private Double numeroDois;

	public OperacaoMatematica getOperacao() {
		return operacao;
	}

	public void setOperacao(OperacaoMatematica operacao) {
		this.operacao = operacao;
	}

	public Double getNumeroUm() {
		return numeroUm;
	}

	public void setNumeroUm(Double numeroUm) {
		this.numeroUm = numeroUm;
	}

	public Double getNumeroDois() {
		return numeroDois;
	}

	public void setNumeroDois(Double numeroDois) {
		this.numeroDois = numeroDois;
	}
	
	

}
