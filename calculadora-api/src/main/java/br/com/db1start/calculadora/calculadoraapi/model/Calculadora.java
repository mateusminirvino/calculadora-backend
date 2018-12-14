package br.com.db1start.calculadora.calculadoraapi.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "calculadora")
public class Calculadora {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "numero_um", nullable = false)
	private Double numeroUm;

	@Column(name = "numero_dois", nullable = false)
	private Double numeroDois;

	@Enumerated(EnumType.STRING)
	@Column(name = "operacao_matematica", nullable = false, length = 15)
	private OperacaoMatematica operacao;

	@Column(name = "data_da_operacao", nullable = false)
	private LocalDateTime dataDaOperacao;

	@Column(name = "resultado_da_operacao", nullable = false)
	private Double resultadoDaOperacao;

	public void setId(Long id) {
		this.id = id;
	}

	public void setNumeroUm(Double numeroUm) {
		this.numeroUm = numeroUm;
	}

	public void setNumeroDois(Double numeroDois) {
		this.numeroDois = numeroDois;
	}

	public void setOperacao(OperacaoMatematica operacao) {
		this.operacao = operacao;
	}

	public void setDataDaOperacao(LocalDateTime dataDaOperacao) {
		this.dataDaOperacao = dataDaOperacao;
	}

	public void setResultadoDaOperacao(Double resultadoDaOperacao) {
		this.resultadoDaOperacao = resultadoDaOperacao;
	}

	protected Calculadora() {
	}

	public Calculadora(Double numeroUm, Double numeroDois, OperacaoMatematica operacao) {
		this.numeroUm = numeroUm;
		this.numeroDois = numeroDois;
		this.operacao = operacao;
	}
	
	public Double recebeOperacao(OperacaoMatematica operacao) {
		return operacao.executorDeOperacoes(this.numeroUm, this.numeroDois);
		
	}

	public Long getId() {
		return this.id;
	}

	public Double getNumeroUm() {
		return this.numeroUm;
	}

	public Double getNumeroDois() {
		return this.numeroDois;
	}

	public OperacaoMatematica getOperacao() {
		return this.operacao;
	}

	public LocalDateTime getDataDaOperacao() {
		return this.dataDaOperacao;
	}

	public Double getResultadoDaOperacao() {
		return this.resultadoDaOperacao;
	}

}
