package edu.faesp.framework.calculadora.model;

import edu.faesp.framework.calculadora.exception.CalculadoraException;

public abstract class AbstractCalculadora {
	private double valor1;
	private double valor2;
	private double resultado;

	public double getValor1() {
		return valor1;
	}

	public void setValor1(double valor1) {
		this.valor1 = valor1;
	}

	public double getValor2() {
		return valor2;
	}

	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}

	public double getResultado() {
		return resultado;
	}
	
	public void divisao() throws CalculadoraException{
		this.resultado = this.executarDivisao(valor1, valor2);
	}
	
	public void subtracao() throws CalculadoraException{
		this.resultado = this.executarSubtracao(valor1, valor2);
	}
	
	public void multiplicacao() throws CalculadoraException{
		this.resultado = this.executarMultiplicacao(valor1, valor2);
	}
	
	public void soma() throws CalculadoraException{
		this.resultado = this.executarSoma(valor1, valor2);
	}
	
	protected abstract double executarDivisao(double dividendo, double divisor) throws CalculadoraException;
	
	protected abstract double executarMultiplicacao(double valor1, double valor2) throws CalculadoraException;
	
	protected abstract double executarSoma(double valor1, double valor2) throws CalculadoraException;
	
	protected abstract double executarSubtracao(double minuendo, double subtraendo) throws CalculadoraException;
}