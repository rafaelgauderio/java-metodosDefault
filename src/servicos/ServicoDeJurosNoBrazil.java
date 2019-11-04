package servicos;

import java.security.InvalidParameterException;

public class ServicoDeJurosNoBrazil {
	
	private Double taxaDeJuros;
	
	public ServicoDeJurosNoBrazil() {
		//construtor padrão
	}

	public ServicoDeJurosNoBrazil(Double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}
	
	public double getTaxaDeJuros() {
		return taxaDeJuros;
	}
	
	public double pagamento(double valor, int meses) {
		if(meses<1){
			throw new InvalidParameterException("O número de meses deve ser maior que zero");
		}	
		
		return valor* Math.pow((1+ taxaDeJuros/100.0), meses);
	}

	@Override
	public String toString() {
		return "taxaDeJuros"+taxaDeJuros;
	}
	

}
