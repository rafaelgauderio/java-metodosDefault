package servicos;

public class ServicoDeJurosNoUsa implements ServicoDeJuros {
	
	private Double taxaDeJuros;
	
	public ServicoDeJurosNoUsa() {
		//construtor padrão
	}

	public ServicoDeJurosNoUsa(Double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}
	
	@Override
	public double getTaxaDeJuros() {
		return taxaDeJuros;
	}
		
	@Override
	public String toString() {
		return "taxaDeJuros"+taxaDeJuros;
	}
	

}
