package br.com.db1start.calculadora.calculadoraapi.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.db1start.calculadora.calculadoraapi.model.Calculadora;
import br.com.db1start.calculadora.calculadoraapi.model.OperacaoMatematica;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculadoraRepositoryTest {

	@Autowired
	private CalculadoraRespository calculadoraRepository;

	@After
	public void after() {
		calculadoraRepository.deleteAll();
	}

	@Test
	public void deveSalvarUmaOperacao() {
		Calculadora calculadora = new Calculadora(5.0, 5.0, OperacaoMatematica.SOMA);
		calculadora.setResultadoDaOperacao(calculadora.recebeOperacao(OperacaoMatematica.SOMA));
		calculadora.setDataDaOperacao(LocalDateTime.now());
		calculadoraRepository.save(calculadora);

		List<Calculadora> operacoes = calculadoraRepository.findAll();

		Calculadora operacaoSalva = operacoes.get(0);

		Assert.assertEquals(calculadora.getResultadoDaOperacao(), operacaoSalva.getResultadoDaOperacao());

	}
}
