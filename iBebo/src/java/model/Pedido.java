package model;

import java.util.Scanner;

public class Pedido 
{

	public static void main(String[] args) 
	{
		int opcao;
		String adicional;
		
		System.out.println("Escolha a bebida desejada:");
		System.out.println("1 - Vodka");
		System.out.println("2 - Vinho");
		System.out.println("3 - Whiskey");
		System.out.println("4 - Cerveja");
		System.out.println("5 - Enegetico");
		System.out.println("6 - Agua");
		System.out.println("7 - Refrigerante");
		Scanner entrada = new Scanner(System.in);
		opcao = entrada.nextInt();
		
		switch(opcao)
		{
		case 1:
			Coquetel meucoquetel = new Vodka();
			System.out.println("Bebdida escolhida = " + meucoquetel.getNome());
			System.out.println("Preco" + " = " + meucoquetel.getPreco());
			System.out.println("Deseja algum adicional ? (Sim/Nao)");
			Scanner entrada_adicional = new Scanner(System.in);
			adicional = entrada_adicional.next();
			
			if(adicional.equalsIgnoreCase("SIM"))
			{
				escolherAdicional(adicional);
				escolherMeioPagamento();
				fecharPedido();
			}
			else
			{
				System.out.println("Pedido fechado sem nenhum adicional");
				escolherMeioPagamento();
				fecharPedido();
			}
			break;
		
		case 2:
			meucoquetel = new Vinho();
			System.out.println("Bebida escolhida = " + meucoquetel.getNome());
			System.out.println("Preco"+ " = " + meucoquetel.getPreco());
			break;
			
		case 3:
			meucoquetel = new Whisky();
			System.out.println("Bebida escolhida = " + meucoquetel.getNome());
			System.out.println("Preco " + " = " + meucoquetel.getPreco());
			break;
			
		default:
			System.out.println("Opcao invalida");
			break;
		}
	}

	private static void escolherAdicional(String adicional) 
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
	
	private static void escolherMeioPagamento() 
	{
		//pegar dados do projeto
	}

	private static void fecharPedido() 
	{
		System.out.println("Pedido fechado");
		//imprimir dados do pedido
		
	}
}
