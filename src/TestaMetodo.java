
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaPaulo = new Conta();  
		// Conta = classe(tipo) conta = variável
		//tenho uma conta do tipo Conta
		contaPaulo.saldo = 100;
		contaPaulo.deposita(50);
		System.out.println(contaPaulo.saldo);
		
		contaPaulo.deposita(10000);
		
		boolean conseguiuRetirar = contaPaulo.saca(20);
		System.out.println(contaPaulo.saldo);
		System.out.println(conseguiuRetirar);
		
		
		Conta contaMarcela = new Conta();
		contaMarcela.deposita(1000);
		boolean sucessoTransferencia = contaMarcela.transfere(3000, contaPaulo);
		if(sucessoTransferencia) {
			System.out.println("transferencia com sucesso");
		} else {
			System.out.println("faltou dinheiro");
		}
		
		contaMarcela.transfere(300, contaPaulo);
		System.out.println(contaMarcela.saldo);
		System.out.println(contaPaulo.saldo);
		
		contaPaulo.titular = "paulo silveira";		
	}
}
