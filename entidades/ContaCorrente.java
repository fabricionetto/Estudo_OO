package entidades;

public class ContaCorrente extends Conta {

	private Double limite;
	
	public ContaCorrente() {
		super();
	}

	public ContaCorrente(Integer numeroConta, String titular, Double saldo, Double limite) {
		super(numeroConta, titular, saldo);
		this.limite = limite;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}


	public void emprestimos(double valor) {
		if(valor <= this.limite) {
			saldo += valor - 10.0;
		}
	}

	@Override
	public String toString() {
		String n = "Numero Conta= " + this.getNumeroConta()
		+ "\nTitular= " + this.getTitular() 
		+ "\nSaldo= " + this.getSaldo();
		return n;
	}
	
}
