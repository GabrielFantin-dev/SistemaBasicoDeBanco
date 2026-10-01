package conta;
import java.util.Scanner;
public class Main {
	
	public static void main(String[]args) {
		ContaBancaria conta = new ContaBancaria();
		Scanner teclado = new Scanner(System.in);
		boolean rodando = true;
		
		
		while(rodando) {
			
		System.out.println("===== BANCO =====");	
		System.out.println("Qual operadoração?");
		System.out.println("1 - Depositar");
		System.out.println("2 - Sacar");
		System.out.println("3 - Consultar saldo");
		System.out.println("4 - Sair");
		int operacao = teclado.nextInt();
		
		if(operacao == 1) {
			System.out.println("Digite o valor para depositar:");
			double valor = teclado.nextDouble();
			conta.depositar(valor);
		}else if (operacao == 2) {
			System.out.println("Digite o valor para sacar:");
			double valor = teclado.nextDouble();
			conta.sacar(valor);
		}else if (operacao == 3) {
			System.out.println("Saldo: R$" + conta.consultarSaldo());
		}else if (operacao == 4) {
			 System.out.println("Banco encerrado!");
			 rodando = false;
		}else {
			System.out.println("Opção invalida!");
			}
		
		}
	teclado.close();
	}
}