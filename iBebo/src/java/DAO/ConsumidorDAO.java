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
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.Consumidor;

/**
 *
 * @author aldo_neto
 */
public class ConsumidorDAO {
 
         private final static EntityManagerFactory EMF = Persistence.createEntityManagerFactory("iBeboPU");

    
     public Consumidor getSingle(String login) {
         EntityManager em = EMF.createEntityManager();
        
         //PROXY: LOGIN
        String jpql = "SELECT u FROM Consumidor u where u.loginUsuario = ?1";
        Query query = em.createQuery(jpql);
        query.setParameter(1, login);
        try{
        Consumidor consumidor = (Consumidor) query.getSingleResult(); 
        return consumidor;
        }catch(NoResultException e){
        return null;
        }
    }
     
     public List<Consumidor> listSingle(String login) {
        EntityManager em = EMF.createEntityManager();
        
        String jpql = "SELECT u FROM Consumidor u where u.loginUsuario = ?1";
        Query query = em.createQuery(jpql);
        query.setParameter(1, login);
        
        return (List<Consumidor>) query.getResultList();
    }
     
      public Consumidor inserir(Consumidor entity) {
        EntityManager em = null;
        EntityTransaction et = null;

        try {
            em = EMF.createEntityManager();
            et = em.getTransaction();
            
            et.begin();
            em.persist(entity);
            et.commit();
        } catch (Exception ex) {
            System.out.println("O ERRO É ESSE: " +ex);
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
      
       public Consumidor atualizar(Consumidor entity) {
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
