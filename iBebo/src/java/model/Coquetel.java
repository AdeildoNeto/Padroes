package model;

public abstract class Coquetel 
{
	String nome, tipo; //ver algum padrao pra utilizar os tipos
	double preco;
	boolean gelo = false, fruta = false;
	
	public String getNome()
	{
		return nome;
	}
	
	public double getPreco()
	{
		return preco;
	}
	
	public String getTipo()
	{
		return tipo;
	}
	
	public boolean setGelo()
	{
		return gelo;
	}
	
	public boolean setFruta()
	{
		return fruta;
	}
}
