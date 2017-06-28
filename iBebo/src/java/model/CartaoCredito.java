/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "cartao_credito")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CartaoCredito.findAll", query = "SELECT c FROM CartaoCredito c")
    , @NamedQuery(name = "CartaoCredito.findByIdCartaoCredito", query = "SELECT c FROM CartaoCredito c WHERE c.idCartaoCredito = :idCartaoCredito")
    , @NamedQuery(name = "CartaoCredito.findByNumeroCartaoCredito", query = "SELECT c FROM CartaoCredito c WHERE c.numeroCartaoCredito = :numeroCartaoCredito")
    , @NamedQuery(name = "CartaoCredito.findByDataValidadeCartaoCredito", query = "SELECT c FROM CartaoCredito c WHERE c.dataValidadeCartaoCredito = :dataValidadeCartaoCredito")
    , @NamedQuery(name = "CartaoCredito.findByCodigoCartaoCredito", query = "SELECT c FROM CartaoCredito c WHERE c.codigoCartaoCredito = :codigoCartaoCredito")})
public class CartaoCredito implements Serializable {

    @OneToMany(mappedBy = "idCartaoConsumidor")
    private Collection<Consumidor> consumidorCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cartao_credito")
    private Integer idCartaoCredito;
    @Column(name = "numero_cartao_credito")
    private String numeroCartaoCredito;
    @Column(name = "data_validade_cartao_credito")
    private String dataValidadeCartaoCredito;
    @Column(name = "codigo_cartao_credito")
    private String codigoCartaoCredito;
    

    public CartaoCredito() {
    }

    public CartaoCredito(Integer idCartaoCredito) {
        this.idCartaoCredito = idCartaoCredito;
    }

    public Integer getIdCartaoCredito() {
        return idCartaoCredito;
    }

    public void setIdCartaoCredito(Integer idCartaoCredito) {
        this.idCartaoCredito = idCartaoCredito;
    }

    public String getNumeroCartaoCredito() {
        return numeroCartaoCredito;
    }

    public void setNumeroCartaoCredito(String numeroCartaoCredito) {
        this.numeroCartaoCredito = numeroCartaoCredito;
    }

    public String getDataValidadeCartaoCredito() {
        return dataValidadeCartaoCredito;
    }

    public void setDataValidadeCartaoCredito(String dataValidadeCartaoCredito) {
        this.dataValidadeCartaoCredito = dataValidadeCartaoCredito;
    }

    public String getCodigoCartaoCredito() {
        return codigoCartaoCredito;
    }

    public void setCodigoCartaoCredito(String codigoCartaoCredito) {
        this.codigoCartaoCredito = codigoCartaoCredito;
    }

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCartaoCredito != null ? idCartaoCredito.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CartaoCredito)) {
            return false;
        }
        CartaoCredito other = (CartaoCredito) object;
        if ((this.idCartaoCredito == null && other.idCartaoCredito != null) || (this.idCartaoCredito != null && !this.idCartaoCredito.equals(other.idCartaoCredito))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.CartaoCredito[ idCartaoCredito=" + idCartaoCredito + " ]";
    }

    @XmlTransient
    public Collection<Consumidor> getConsumidorCollection() {
        return consumidorCollection;
    }

    public void setConsumidorCollection(Collection<Consumidor> consumidorCollection) {
        this.consumidorCollection = consumidorCollection;
    }
    
}
