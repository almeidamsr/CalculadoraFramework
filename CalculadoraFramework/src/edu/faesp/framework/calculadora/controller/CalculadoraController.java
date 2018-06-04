package edu.faesp.framework.calculadora.controller;

import edu.faesp.framework.calculadora.exception.CalculadoraException;
import edu.faesp.framework.calculadora.model.AbstractCalculadora;
import edu.faesp.framework.calculadora.model.Operacao;
import edu.faesp.framework.calculadora.view.ICalculadoraView;

public class CalculadoraController {
	
	private AbstractCalculadora calculadora;
	private ICalculadoraView view;
	
	public CalculadoraController(AbstractCalculadora calculadora, ICalculadoraView view) {
		this.calculadora = calculadora;
		this.view = view;
	}

	public void executarOperacao(){
		try{
			Operacao operacao = view.solicitarOperacao();
			switch(operacao){
				case SOMA:
					this.executarSoma();
					break;
				case SUBTRACAO:
					this.executarSubtracao();
					break;
				case MULTIPLICACAO:
					this.executarMultiplicacao();
					break;
				case DIVISAO:
					this.executarDivisao();
					break;
				default:
					view.exibirMensagemErro("Opção inválida.");
			}
		}catch(CalculadoraException e){
			view.exibirMensagemErro(e.getMessage());
		}catch(Exception e){
			view.exibirMensagemErro("O sistema encontrou um erro desconhecido.");
		}
	}
	
	protected void executarDivisao(){
		double valor1 = view.solicitarDividendo();
		double valor2 = view.solicitarDivisor();
		
		calculadora.setValor1(valor1);
		calculadora.setValor2(valor2);
		
		try{
			calculadora.divisao();
			double resultado = calculadora.getResultado();
			view.exibirResultado(resultado);
		}catch(CalculadoraException e){
			view.exibirMensagemErro(e.getMessage());
		}catch(Exception e){
			view.exibirMensagemErro("O sistema encontrou um erro desconhecido.");
		}
	}
	
	protected void executarSoma(){
		double valor1 = view.solicitarValor1Soma();
		double valor2 = view.solicitarValor2Soma();
		
		calculadora.setValor1(valor1);
		calculadora.setValor2(valor2);
		
		try{
			calculadora.soma();
			double resultado = calculadora.getResultado();
			view.exibirResultado(resultado);
		}catch(CalculadoraException e){
			view.exibirMensagemErro(e.getMessage());
		}catch(Exception e){
			view.exibirMensagemErro("O sistema encontrou um erro desconhecido.");
		}
	}
	
	protected void executarSubtracao(){
		double valor1 = view.solicitarMinuendo();
		double valor2 = view.solicitarSubtraendo();
		
		calculadora.setValor1(valor1);
		calculadora.setValor2(valor2);
		
		try{
			calculadora.subtracao();
			double resultado = calculadora.getResultado();
			view.exibirResultado(resultado);
		}catch(CalculadoraException e){
			view.exibirMensagemErro(e.getMessage());
		}catch(Exception e){
			view.exibirMensagemErro("O sistema encontrou um erro desconhecido.");
		}
	}
	
	protected void executarMultiplicacao(){
		double valor1 = view.solicitarValor1Multiplicacao();
		double valor2 = view.solicitarValor2Multiplicacao();
		
		calculadora.setValor1(valor1);
		calculadora.setValor2(valor2);
		
		try{
			calculadora.multiplicacao();
			double resultado = calculadora.getResultado();
			view.exibirResultado(resultado);
		}catch(CalculadoraException e){
			view.exibirMensagemErro(e.getMessage());
		}catch(Exception e){
			view.exibirMensagemErro("O sistema encontrou um erro desconhecido.");
		}
	}
}