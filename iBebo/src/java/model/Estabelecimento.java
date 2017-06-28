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
@Table(name = "estabelecimento")
@XmlRootElement
@PrimaryKeyJoinColumn(name="id_estabelecimento", referencedColumnName = "id_usuario")

public class Estabelecimento extends Usuario implements Serializable {

  //  private static final long serialVersionUID = 1L;
  //  @Id
 //   @Basic(optional = false)
  //  @Column(name = "id_estabelecimento")
 ///   private Integer idEstabelecimento;
    @OneToMany(mappedBy = "idEstabelecimentoProduto")
    private Collection<Produto> produtoCollection;
    @JoinColumn(name = "id_tipo_estabelecimento", referencedColumnName = "id_tipo_estabelecimento")
    @ManyToOne
    private TipoEstabelecimento idTipoEstabelecimento;
    @JoinColumn(name = "id_estabelecimento", referencedColumnName = "id_usuario", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Usuario usuario;

    public Estabelecimento() {
    }

  /*  public Estabelecimento(Integer idEstabelecimento) {
        this.idEstabelecimento = idEstabelecimento;
    }

    public Integer getIdEstabelecimento() {
        return idEstabelecimento;
    }

    public void setIdEstabelecimento(Integer idEstabelecimento) {
        this.idEstabelecimento = idEstabelecimento;
    }*/

    @XmlTransient
    public Collection<Produto> getProdutoCollection() {
        return produtoCollection;
    }

    public void setProdutoCollection(Collection<Produto> produtoCollection) {
        this.produtoCollection = produtoCollection;
    }

    public TipoEstabelecimento getIdTipoEstabelecimento() {
        return idTipoEstabelecimento;
    }

    public void setIdTipoEstabelecimento(TipoEstabelecimento idTipoEstabelecimento) {
        this.idTipoEstabelecimento = idTipoEstabelecimento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstabelecimento != null ? idEstabelecimento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estabelecimento)) {
            return false;
        }
        Estabelecimento other = (Estabelecimento) object;
        if ((this.idEstabelecimento == null && other.idEstabelecimento != null) || (this.idEstabelecimento != null && !this.idEstabelecimento.equals(other.idEstabelecimento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Estabelecimento[ idEstabelecimento=" + idEstabelecimento + " ]";
    }
    
}
