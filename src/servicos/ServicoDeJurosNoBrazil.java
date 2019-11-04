package servicos;

public class ServicoDeJurosNoBrazil implements ServicoDeJuros{
	
	private Double taxaDeJuros;
	
	public ServicoDeJurosNoBrazil() {
		//construtor padrão
	}

	public ServicoDeJurosNoBrazil(Double taxaDeJuros) {
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
