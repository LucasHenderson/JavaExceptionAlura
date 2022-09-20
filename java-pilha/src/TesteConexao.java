
public class TesteConexao {

	public static void main(String[] args) {
		
//		//forma padrao de fazer tratamento
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch (IllegalStateException e) {
//			System.out.println("Deu erro na conexao!");
//		} finally {
//			con.fecha(); //usando finally tudo que estiver aqui dentro sempre sera executado
//		}
		
		//forma simplificada de fazer tratamento
		try (Conexao con = new Conexao()){ //fazendo dessa forma o try obriga que o objeto tenha a interface "AutoCloseable"
			con.leDados();
		} catch (IllegalStateException e) {
			System.out.println("Deu erro na conexao!");
		}
		//dessa forma nem mesmo precisa chamar o close(), ele ja faz isso automaticamente
	}

}
