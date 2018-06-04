package edu.faesp.framework.calculadora.view;

import edu.faesp.framework.calculadora.exception.CalculadoraException;
import edu.faesp.framework.calculadora.model.Operacao;

public interface ICalculadoraView {
	
	public double solicitarValor1Soma();
	
	public double solicitarValor2Soma();
	
	public double solicitarDivisor();
	
	public double solicitarDividendo();
	
	public double solicitarMinuendo();
	
	public double solicitarSubtraendo();
	
	public double solicitarValor1Multiplicacao();

	public double solicitarValor2Multiplicacao();
	
	public void exibirResultado(double resultado);
	
	public Operacao solicitarOperacao() throws CalculadoraException;
	
	public void exibirMensagemErro(String msg);
}
