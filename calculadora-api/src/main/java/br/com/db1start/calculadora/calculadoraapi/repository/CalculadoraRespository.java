package br.com.db1start.calculadora.calculadoraapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.db1start.calculadora.calculadoraapi.model.Calculadora;

public interface CalculadoraRespository extends JpaRepository<Calculadora, Long> {

}
