/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aldo_neto
 */
public class DecidirPessoa {
    
    	public Pessoa getPessoa(String nome, String sexo) {
		if (sexo.equals("Masculino""))
			return new Homem(nome);
		if (sexo.equals("Feminino"))
			return new Mulher(nome);
	}
}
