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
public class Cerveja extends Produto{
    
    public Cerveja()
    {}
     
    public Cerveja(Tipo tipo)
    {  
        Cerveja cerva = new Cerveja();
        cerva.setIdTipoProduto(tipo);
        
    }
}
