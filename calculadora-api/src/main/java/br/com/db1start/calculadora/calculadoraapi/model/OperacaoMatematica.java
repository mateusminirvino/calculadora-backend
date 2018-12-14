package br.com.db1start.calculadora.calculadoraapi.model;

public enum OperacaoMatematica {

	SOMA {
		@Override
		public Double executorDeOperacoes(Double num1, Double num2) {
			return num1 + num2;
		}
	},
	SUBTRACAO {
		@Override
		public Double executorDeOperacoes(Double num1, Double num2) {
			return num1 - num2;
		}
	},
	DIVISAO {
		@Override
		public Double executorDeOperacoes(Double num1, Double num2) {
			return num1 / num2;
		}
	},
	MULTIPLICACAO {
		@Override
		public Double executorDeOperacoes(Double num1, Double num2) {
			return num1 * num2;
		}
	};

	public abstract Double executorDeOperacoes(Double num1, Double num2);
}
