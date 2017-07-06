package model;

public abstract class CoquetelDecorator extends Coquetel 
{
	Coquetel coquetel;
	
	public CoquetelDecorator(Coquetel umConquetel)
	{
		coquetel = umConquetel;
	}
	
	public String getNome()
	{
		return coquetel.getNome() + " + " + nome;
	}
	
	public double getPreco()
	{
		return coquetel.getPreco() + preco;
	}
}
