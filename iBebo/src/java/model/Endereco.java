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
@Table(name = "endereco")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Endereco.findAll", query = "SELECT e FROM Endereco e")
    , @NamedQuery(name = "Endereco.findByIdEndereco", query = "SELECT e FROM Endereco e WHERE e.idEndereco = :idEndereco")
    , @NamedQuery(name = "Endereco.findByLogradouroEndereco", query = "SELECT e FROM Endereco e WHERE e.logradouroEndereco = :logradouroEndereco")
    , @NamedQuery(name = "Endereco.findByNumeroEndereco", query = "SELECT e FROM Endereco e WHERE e.numeroEndereco = :numeroEndereco")
    , @NamedQuery(name = "Endereco.findByBairroEndereco", query = "SELECT e FROM Endereco e WHERE e.bairroEndereco = :bairroEndereco")
    , @NamedQuery(name = "Endereco.findByComplementoEndereco", query = "SELECT e FROM Endereco e WHERE e.complementoEndereco = :complementoEndereco")
    , @NamedQuery(name = "Endereco.findByCidadeEndereco", query = "SELECT e FROM Endereco e WHERE e.cidadeEndereco = :cidadeEndereco")
    , @NamedQuery(name = "Endereco.findByEstadoUsuario", query = "SELECT e FROM Endereco e WHERE e.estadoUsuario = :estadoUsuario")})
public class Endereco implements Serializable {

    @Column(name = "cep_endereco")
    private String cepEndereco;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_endereco")
    private Integer idEndereco;
    @Column(name = "logradouro_endereco")
    private String logradouroEndereco;
    @Column(name = "numero_endereco")
    private String numeroEndereco;
    @Column(name = "bairro_endereco")
    private String bairroEndereco;
    @Column(name = "complemento_endereco")
    private String complementoEndereco;
    @Column(name = "cidade_endereco")
    private String cidadeEndereco;
    @Column(name = "estado_usuario")
    private String estadoUsuario;
    @OneToMany(mappedBy = "idEnderecoUsuario")
    private Collection<Usuario> usuarioCollection;

    public Endereco() {
    }

    public Endereco(Integer idEndereco) {
        this.idEndereco = idEndereco;
    }

    public Integer getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Integer idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getLogradouroEndereco() {
        return logradouroEndereco;
    }

    public void setLogradouroEndereco(String logradouroEndereco) {
        this.logradouroEndereco = logradouroEndereco;
    }

    public String getNumeroEndereco() {
        return numeroEndereco;
    }

    public void setNumeroEndereco(String numeroEndereco) {
        this.numeroEndereco = numeroEndereco;
    }

    public String getBairroEndereco() {
        return bairroEndereco;
    }

    public void setBairroEndereco(String bairroEndereco) {
        this.bairroEndereco = bairroEndereco;
    }

    public String getComplementoEndereco() {
        return complementoEndereco;
    }

    public void setComplementoEndereco(String complementoEndereco) {
        this.complementoEndereco = complementoEndereco;
    }

    public String getCidadeEndereco() {
        return cidadeEndereco;
    }

    public void setCidadeEndereco(String cidadeEndereco) {
        this.cidadeEndereco = cidadeEndereco;
    }

    public String getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(String estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    @XmlTransient
    public Collection<Usuario> getUsuarioCollection() {
        return usuarioCollection;
    }

    public void setUsuarioCollection(Collection<Usuario> usuarioCollection) {
        this.usuarioCollection = usuarioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEndereco != null ? idEndereco.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Endereco)) {
            return false;
        }
        Endereco other = (Endereco) object;
        if ((this.idEndereco == null && other.idEndereco != null) || (this.idEndereco != null && !this.idEndereco.equals(other.idEndereco))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Endereco[ idEndereco=" + idEndereco + " ]";
    }

    public String getCepEndereco() {
        return cepEndereco;
    }

    public void setCepEndereco(String cepEndereco) {
        this.cepEndereco = cepEndereco;
    }
    
}
