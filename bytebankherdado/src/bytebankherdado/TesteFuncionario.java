package bytebankherdado;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario novato = new Gerente();
		
		novato.setNome("Fabio Silva");
		novato.setCpf("222.222.222-22");
		novato.setSalario(2600.00);
		
		System.out.println(novato.getNome());
		System.out.println(novato.getBonificacao());

	}

}
