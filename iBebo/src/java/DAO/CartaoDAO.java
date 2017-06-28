/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.CartaoCredito;


/**
 *
 * @author carlo
 */
public class CartaoDAO {
     private final static EntityManagerFactory EMF = Persistence.createEntityManagerFactory("iBeboPU");
    
   
    public CartaoCredito getSingle(CartaoCredito id) {
        EntityManager em = EMF.createEntityManager();
        
        String jpql = "FROM CartaoCredito u Where u.idUsuario > ?1";
        Query query = em.createQuery(jpql);
        query.setParameter(1, id);
        return (CartaoCredito) query.getSingleResult();
    }
    
    // adicionado
    public CartaoCredito getSingle(int id) {
        EntityManager em = EMF.createEntityManager();
        
        String jpa = "FROM CartaoCredito u Where u.idUsuario > ?1";
        Query query = em.createQuery(jpa);
        query.setParameter(1, id);
        return (CartaoCredito) query.getSingleResult();
    }
    
  
    public CartaoCredito getSingle(String login) {
         EntityManager em = EMF.createEntityManager();
        
        String jpql = "SELECT u FROM CartaoCredito u where u.login = ?1";
        Query query = em.createQuery(jpql);
        query.setParameter(1, login);

        return (CartaoCredito) query.getSingleResult();
    }

   
    public List<CartaoCredito> listar() {
        EntityManager em = EMF.createEntityManager();
        
        String jpa = "FROM CartaoCredito";
        Query query = em.createQuery(jpa);

        return (List<CartaoCredito>) query.getResultList();
    }

    
    public CartaoCredito inserir(CartaoCredito entity) {
        EntityManager em = null;
        EntityTransaction et = null;

        try {
            em = EMF.createEntityManager();
            et = em.getTransaction();

            et.begin();
            em.persist(entity);
            et.commit();
        } catch (Exception ex) {
            if (et != null && et.isActive()) {
                et.rollback();
            }
        } finally {
            if (em != null) {
                em.close();
            }
        }

        return entity;

    }

  
    public void deletar(CartaoCredito entity) {
        EntityManager em = null;
        EntityTransaction et = null;

        try {
            em = EMF.createEntityManager();
            et = em.getTransaction();

            et.begin();
            em.remove(entity);
            et.commit();
        } catch (Exception ex) {
            if (et != null && et.isActive()) {
                et.rollback();
            }
        } finally {
            if (em != null) {
                em.close();
            }
        }

    }

    
    public CartaoCredito atualizar(CartaoCredito entity) {
       EntityManager em = null;
        EntityTransaction et = null;

        try {
            em = EMF.createEntityManager();
            et = em.getTransaction();

            et.begin();
            em.merge(entity);
            et.commit();
        } catch (Exception ex) {
            if (et != null && et.isActive()) {
                et.rollback();
            }
        } finally {
            if (em != null) {
                em.close();
            }
        }

        return entity;
    }
}
