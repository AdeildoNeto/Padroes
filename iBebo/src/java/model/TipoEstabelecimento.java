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
@Table(name = "tipo_estabelecimento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoEstabelecimento.findAll", query = "SELECT t FROM TipoEstabelecimento t")
    , @NamedQuery(name = "TipoEstabelecimento.findByIdTipoEstabelecimento", query = "SELECT t FROM TipoEstabelecimento t WHERE t.idTipoEstabelecimento = :idTipoEstabelecimento")
    , @NamedQuery(name = "TipoEstabelecimento.findByNomeTipoEstabelecimento", query = "SELECT t FROM TipoEstabelecimento t WHERE t.nomeTipoEstabelecimento = :nomeTipoEstabelecimento")})
public class TipoEstabelecimento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipo_estabelecimento")
    private Integer idTipoEstabelecimento;
    @Column(name = "nome_tipo_estabelecimento")
    private String nomeTipoEstabelecimento;
    @OneToMany(mappedBy = "idTipoEstabelecimento")
    private Collection<Estabelecimento> estabelecimentoCollection;

    public TipoEstabelecimento() {
    }

    public TipoEstabelecimento(Integer idTipoEstabelecimento) {
        this.idTipoEstabelecimento = idTipoEstabelecimento;
    }

    public Integer getIdTipoEstabelecimento() {
        return idTipoEstabelecimento;
    }

    public void setIdTipoEstabelecimento(Integer idTipoEstabelecimento) {
        this.idTipoEstabelecimento = idTipoEstabelecimento;
    }

    public String getNomeTipoEstabelecimento() {
        return nomeTipoEstabelecimento;
    }

    public void setNomeTipoEstabelecimento(String nomeTipoEstabelecimento) {
        this.nomeTipoEstabelecimento = nomeTipoEstabelecimento;
    }

    @XmlTransient
    public Collection<Estabelecimento> getEstabelecimentoCollection() {
        return estabelecimentoCollection;
    }

    public void setEstabelecimentoCollection(Collection<Estabelecimento> estabelecimentoCollection) {
        this.estabelecimentoCollection = estabelecimentoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoEstabelecimento != null ? idTipoEstabelecimento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoEstabelecimento)) {
            return false;
        }
        TipoEstabelecimento other = (TipoEstabelecimento) object;
        if ((this.idTipoEstabelecimento == null && other.idTipoEstabelecimento != null) || (this.idTipoEstabelecimento != null && !this.idTipoEstabelecimento.equals(other.idTipoEstabelecimento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.TipoEstabelecimento[ idTipoEstabelecimento=" + idTipoEstabelecimento + " ]";
    }
    
}
