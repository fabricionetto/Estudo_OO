package entidades;

public class Conta {

	private Integer numeroConta;
	private String titular;
	protected Double saldo;

	public Conta() {
		
	}

	public Conta(Integer numeroConta, String titular, Double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public void saque(double valor) {
		saldo -= valor;
	}
	
	public void deposito(double valor) {
		saldo+= valor;
	}
	
}
