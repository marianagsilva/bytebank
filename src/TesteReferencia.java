
public class TesteReferencia {
	
	public static void main (String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("saldo da primeira conta: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta; // fazem referencia para o mesmo objeto
		                                   // mas são variáveis diferentes
		System.out.println("saldo da segunda conta: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("novo saldo da segunda conta: " + segundaConta.saldo);
		
		System.out.println("novo saldo da primeira conta: " + primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("sao a mesmissima conta");
			
		}else {
			System.out.println("nao estao referenciando o mesmo objeto");
		}
	}
}
