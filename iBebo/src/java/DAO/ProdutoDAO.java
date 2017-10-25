/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.Estabelecimento;
import model.Produto;
import model.Tipo;

/**
 *
 * @author carlo
 */
public class ProdutoDAO {

    private final static EntityManagerFactory EMF = Persistence.createEntityManagerFactory("iBeboPU");

    public Produto getSingleProd(int id) {
        EntityManager em = EMF.createEntityManager();

        String jpql = "SELECT u FROM Produto u where u.idProduto = ?1";
        Query query = em.createQuery(jpql);
        query.setParameter(1, id);
         try{
        Produto produto = (Produto) query.getSingleResult(); 
        return produto;
        }catch(NoResultException e){
        return null;
        }
    }
    public List<Produto> getSingle(int id) {
        EntityManager em = EMF.createEntityManager();

        String jpql = "SELECT u FROM Produto u where u.idProduto = ?1";
        Query query = em.createQuery(jpql);
        query.setParameter(1, id);
        try {
            return (List<Produto>) query.getResultList();
        } catch (NoResultException e) {
            return null;
        }
    }

    public List<Produto> listaEstab(Estabelecimento estabelecimento) {
        EntityManager em = EMF.createEntityManager();

        String jpql = "SELECT u FROM Produto u where u.idEstabelecimentoProduto = ?1";
        Query query = em.createQuery(jpql);
        query.setParameter(1, estabelecimento);
        try {
            //  List lista = (List<Endereco>) query.getSingleResult(); 
            return (List<Produto>) query.getResultList();
        } catch (NoResultException e) {
            return null;
        }
    }

    public List<Produto> listaFiltrada(Estabelecimento estabelecimento, Tipo id_tipo) {
        EntityManager em = EMF.createEntityManager();

        String jpql = "SELECT u FROM Produto u where u.idEstabelecimentoProduto = ?1 AND u.idTipoProduto = ?2";
        Query query = em.createQuery(jpql);
        query.setParameter(1, estabelecimento);
        query.setParameter(2, id_tipo);
        try {
            //  List lista = (List<Endereco>) query.getSingleResult(); 
            return (List<Produto>) query.getResultList();
        } catch (NoResultException e) {
            return null;
        }
    }
}
