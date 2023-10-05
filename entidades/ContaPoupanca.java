package entidades;

public class ContaPoupanca extends Conta{

	private Double taxaJuros;

	public ContaPoupanca() {
	
	}

	public ContaPoupanca(Integer numeroConta, String titular, Double saldo) {
		super(numeroConta, titular, saldo);
	
	}

	public Double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	

	public void atualizarSaldo() {
		saldo += saldo * taxaJuros;
	}
	
	@Override
	public void saque(double valor) {
		saldo -= valor + 5.0;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Conta Poupança");
		sb.append("Numero Conta= ");
		sb.append( this.getNumeroConta());
		sb.append( "\nTitular= ");
		sb.append( this.getTitular());
		sb.append( "\nSaldo= ");
		sb.append( this.getSaldo());
		return sb.toString();
	}
}
