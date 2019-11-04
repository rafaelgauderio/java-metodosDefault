package servicos;

import java.security.InvalidParameterException;

public interface ServicoDeJuros {
	
	//interface não possui construtor e nem atributos
	
	double getTaxaDeJuros();
	default double pagamento(double valor, int meses) {
		if(meses<1){
			throw new InvalidParameterException("O número de meses deve ser maior que zero");
		}	
		
		return valor* Math.pow((1+ getTaxaDeJuros()/100.0), meses);
	}
	
}
