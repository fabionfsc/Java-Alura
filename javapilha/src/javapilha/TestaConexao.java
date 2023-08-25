package javapilha;

public class TestaConexao {

	public static void main(String[] args) throws Exception {

		
		try (Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch (IllegalStateException ex) {
			System.out.println("Erro na conexão");
		}

//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch (IllegalStateException ex) {
//			System.out.println("Erro na conexão");
//		} finally {
//			System.out.println("Finally");
//			if (con != null) {
//				con.close();
//			}
//		}
	}
}
