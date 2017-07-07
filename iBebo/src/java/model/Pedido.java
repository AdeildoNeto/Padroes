package model;

import java.util.Scanner;

public class Pedido 
{

	public static void main(String[] args) 
	{
		int opcao = 0;
		String adicional = null;
                String pagamento = null;
		
		switch(opcao)
		{
		case 1:
			Coquetel meucoquetel = new Vodka();
                        escolherMeioPagamento(pagamento);
			break;
		
		case 2:
			meucoquetel = new Vinho();
                        escolherMeioPagamento(pagamento);
			break;
			
		case 3:
			meucoquetel = new Wiskhey();
                        escolherMeioPagamento(pagamento);
			break;
                        
                case 4:
			meucoquetel = new Wiskhey();
                        escolherMeioPagamento(pagamento);
			break;
			
		default:
			System.out.println("Opcao invalida");
			break;
		}
	}

/*	private static void escolherAdicional(String adicional) 
	{
		int opcao;
		
		System.out.println("Escolha o tipo de adicional que voce deseja");
		System.out.println("1 - Gelo");
		System.out.println("2 - Fruta");
		System.out.println("3 - Copo/taca");
		System.out.println("4 - Sair");
		Scanner entradaAdicional = new Scanner(System.in);
		opcao = entradaAdicional.nextInt();
		
		switch(opcao)
		{
			case 1:
				System.out.println("Adicional escolhido =  gelo");
				break;
				
			case 2:
				System.out.println("Adcional escolhido = fruta");
				break;
				
			case 3:
				System.out.println("Adicional escolhido = copo/taca");
				break;
				
			case 4: 
				break;
				
			default:
				System.out.println("Opcao invalida");
				break;
		}	
	}
*/	
	private static String escolherMeioPagamento(String tipoPagamento) 
	{
		Pagamento pagamento = new Pagamento();
                pagamento.escolherTipoPagamento(tipoPagamento);
                return tipoPagamento;
	}
}
