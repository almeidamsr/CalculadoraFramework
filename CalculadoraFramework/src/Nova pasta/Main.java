import edu.faesp.framework.calculadora.controller.CalculadoraController;
import edu.faesp.framework.calculadora.model.AbstractCalculadora;
import edu.faesp.framework.calculadora.view.ICalculadoraView;

public class Main {

	private static AbstractCalculadora Calculadora;
	private static ICalculadoraView CalculadoraView;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculadoraController calculadoraController = new CalculadoraController(Calculadora, CalculadoraView); 
	
		for (;;) {
			calculadoraController.executarOperacao();
		}

	}

}
