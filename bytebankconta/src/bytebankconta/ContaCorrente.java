package bytebankconta;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double valorTaxa = valor + 0.2;
		return super.saca(valorTaxa);
	}
}
