package model;

public class Vinho extends Produto 
{
        public Vinho(){}
        public Vinho(Tipo tipo)
        {
           Vinho vinho = new Vinho();
           
            vinho.setIdTipoProduto(tipo);

        }
}

