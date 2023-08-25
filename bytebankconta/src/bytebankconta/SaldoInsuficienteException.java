package bytebankconta;

public class SaldoInsuficienteException extends RuntimeException {

	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
}
