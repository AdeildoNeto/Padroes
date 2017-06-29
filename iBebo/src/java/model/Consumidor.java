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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author aldo_neto
 */
@Entity
@Table(name = "consumidor")
@XmlRootElement
@PrimaryKeyJoinColumn(name="id_consumidor", referencedColumnName = "id_usuario")
public class Consumidor extends Usuario implements Serializable {

   
    @JoinColumn(name = "id_cartao_consumidor", referencedColumnName = "id_cartao_credito")
    @ManyToOne
    private CartaoCredito idCartaoConsumidor;


    
    @Column(name = "sexo_consumidor")
    private String sexoConsumidor;

    private static final long serialVersionUID = 1L;
  //  @Id
//    @Basic(optional = false)
 //   @Column(name = "id_consumidor")
 //   private Integer idConsumidor;
    @Column(name = "data_nascimento_consumidor")
    private String dataNascimentoConsumidor;
    @Column(name = "CPF_consumidor")
    private String cPFconsumidor;
    @Column(name = "RG_consumidor")
    private String rGconsumidor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idConsumidorCompra")
    private Collection<Compra> compraCollection;
    
    @JoinColumn(name = "id_consumidor", referencedColumnName = "id_usuario", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Usuario usuario;

    public Consumidor() {
    }

/*    public Consumidor(Integer idConsumidor) {
        this.idConsumidor = idConsumidor;
    }

    public Integer getIdConsumidor() {
        return idConsumidor;
    }

    public void setIdConsumidor(Integer idConsumidor) {
        this.idConsumidor = idConsumidor;
    }
*/
    public String getDataNascimentoConsumidor() {
        return dataNascimentoConsumidor;
    }

    public void setDataNascimentoConsumidor(String dataNascimentoConsumidor) {
        this.dataNascimentoConsumidor = dataNascimentoConsumidor;
    }

    public String getCPFconsumidor() {
        return cPFconsumidor;
    }

    public void setCPFconsumidor(String cPFconsumidor) {
        this.cPFconsumidor = cPFconsumidor;
    }

    public String getRGconsumidor() {
        return rGconsumidor;
    }

    public void setRGconsumidor(String rGconsumidor) {
        this.rGconsumidor = rGconsumidor;
    }

    @XmlTransient
    public Collection<Compra> getCompraCollection() {
        return compraCollection;
    }

    public void setCompraCollection(Collection<Compra> compraCollection) {
        this.compraCollection = compraCollection;
    }



    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

  /*  @Override
    public int hashCode() {
        int hash = 0;
        hash += (idConsumidor != null ? idConsumidor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Consumidor)) {
            return false;
        }
        Consumidor other = (Consumidor) object;
        if ((this.idConsumidor == null && other.idConsumidor != null) || (this.idConsumidor != null && !this.idConsumidor.equals(other.idConsumidor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Consumidor[ idConsumidor=" + idConsumidor + " ]";
    }*/

    public String getSexoConsumidor() {
        return sexoConsumidor;
    }

    public void setSexoConsumidor(String sexoConsumidor) {
        this.sexoConsumidor = sexoConsumidor;
    }

    public CartaoCredito getIdCartaoConsumidor() {
        return idCartaoConsumidor;
    }

    public void setIdCartaoConsumidor(CartaoCredito idCartaoConsumidor) {
        this.idCartaoConsumidor = idCartaoConsumidor;
    }


    
    
}
