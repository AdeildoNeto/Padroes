/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.Consumidor;
import model.Estabelecimento;

/**
 *
 * @author carlo
 */
public class EstabelecimentoDAO {

    private final static EntityManagerFactory EMF = Persistence.createEntityManagerFactory("iBeboPU");

    public Estabelecimento Single(int idEstabelecimento) {
        EntityManager em = EMF.createEntityManager();

        String jpql = "SELECT u FROM Estabelecimento u where u.idUsuario = ?1";
        Query query = em.createQuery(jpql);
        query.setParameter(1, idEstabelecimento);
        try {
            Estabelecimento estabelecimento = (Estabelecimento) query.getSingleResult();
            return estabelecimento;
        } catch (NoResultException e) {
            return null;
        }
    }
    
    
}
