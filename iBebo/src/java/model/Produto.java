/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author aldo_neto
 */
@Entity
@Table(name = "produto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Produto.findAll", query = "SELECT p FROM Produto p")
    , @NamedQuery(name = "Produto.findByIdProduto", query = "SELECT p FROM Produto p WHERE p.idProduto = :idProduto")
    , @NamedQuery(name = "Produto.findByNomeProduto", query = "SELECT p FROM Produto p WHERE p.nomeProduto = :nomeProduto")
    , @NamedQuery(name = "Produto.findByMarcaProduto", query = "SELECT p FROM Produto p WHERE p.marcaProduto = :marcaProduto")
    , @NamedQuery(name = "Produto.findByPrecoProduto", query = "SELECT p FROM Produto p WHERE p.precoProduto = :precoProduto")
    , @NamedQuery(name = "Produto.findByAlcoolProduto", query = "SELECT p FROM Produto p WHERE p.alcoolProduto = :alcoolProduto")
    , @NamedQuery(name = "Produto.findByVolAlcoolProduto", query = "SELECT p FROM Produto p WHERE p.volAlcoolProduto = :volAlcoolProduto")})
public class Produto implements Serializable {

    @Column(name = "produto_qtd")
    private Integer produtoQtd;
    @Column(name = "produto_detalhe")
    private String produtoDetalhe;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_produto")
    private Integer idProduto;
    @Column(name = "nome_produto")
    private String nomeProduto;
    @Column(name = "marca_produto")
    private String marcaProduto;
    @Column(name = "preco_produto")
    private String precoProduto;
    @Column(name = "alcool_produto")
    private String alcoolProduto;
    @Column(name = "vol_alcool_produto")
    private String volAlcoolProduto;
    @OneToMany(mappedBy = "idProdutoCompra")
    private Collection<Compra> compraCollection;
    @JoinColumn(name = "id_estabelecimento_produto", referencedColumnName = "id_estabelecimento")
    @ManyToOne
    private Estabelecimento idEstabelecimentoProduto;
    @JoinColumn(name = "id_tipo_produto", referencedColumnName = "id_tipo")
    @ManyToOne
    private Tipo idTipoProduto;

    public Produto() {
    }

    public Produto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getMarcaProduto() {
        return marcaProduto;
    }

    public void setMarcaProduto(String marcaProduto) {
        this.marcaProduto = marcaProduto;
    }

    public String getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(String precoProduto) {
        this.precoProduto = precoProduto;
    }

    public String getAlcoolProduto() {
        return alcoolProduto;
    }

    public void setAlcoolProduto(String alcoolProduto) {
        this.alcoolProduto = alcoolProduto;
    }

    public String getVolAlcoolProduto() {
        return volAlcoolProduto;
    }

    public void setVolAlcoolProduto(String volAlcoolProduto) {
        this.volAlcoolProduto = volAlcoolProduto;
    }

    @XmlTransient
    public Collection<Compra> getCompraCollection() {
        return compraCollection;
    }

    public void setCompraCollection(Collection<Compra> compraCollection) {
        this.compraCollection = compraCollection;
    }

    public Estabelecimento getIdEstabelecimentoProduto() {
        return idEstabelecimentoProduto;
    }

    public void setIdEstabelecimentoProduto(Estabelecimento idEstabelecimentoProduto) {
        this.idEstabelecimentoProduto = idEstabelecimentoProduto;
    }

    public Tipo getIdTipoProduto() {
        return idTipoProduto;
    }

    public void setIdTipoProduto(Tipo idTipoProduto) {
        this.idTipoProduto = idTipoProduto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProduto != null ? idProduto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if ((this.idProduto == null && other.idProduto != null) || (this.idProduto != null && !this.idProduto.equals(other.idProduto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Produto[ idProduto=" + idProduto + " ]";
    }

    public Integer getProdutoQtd() {
        return produtoQtd;
    }

    public void setProdutoQtd(Integer produtoQtd) {
        this.produtoQtd = produtoQtd;
    }

    public String getProdutoDetalhe() {
        return produtoDetalhe;
    }

    public void setProdutoDetalhe(String produtoDetalhe) {
        this.produtoDetalhe = produtoDetalhe;
    }
    
}
