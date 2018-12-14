package br.com.db1start.calculadora.calculadoraapi.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.db1start.calculadora.calculadoraapi.model.Calculadora;
import br.com.db1start.calculadora.calculadoraapi.model.OperacaoMatematica;
import br.com.db1start.calculadora.calculadoraapi.repository.CalculadoraRespository;

@Service
public class CalculadoraService {

	@Autowired
	private CalculadoraRespository calculadoraRespository;

	public Calculadora salvarOperacao(Double numeroUm, Double numeroDois, OperacaoMatematica operacao) {
		Calculadora calculadora = new Calculadora(numeroUm, numeroDois, operacao);
		calculadora.setResultadoDaOperacao(calculadora.recebeOperacao(operacao));
		calculadora.setDataDaOperacao(LocalDateTime.now());
		calculadoraRespository.save(calculadora);
		return calculadora;
	}
	
	public List<Calculadora> buscarTodosCalculos(){
		return calculadoraRespository.findAll();
	}

}
