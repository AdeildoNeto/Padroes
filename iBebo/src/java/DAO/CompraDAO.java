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
import model.Compra;
import model.Consumidor;

/**
 *
 * @author carlo
 */
public class CompraDAO {
    private final static EntityManagerFactory EMF = Persistence.createEntityManagerFactory("iBeboPU");
    
     public List<Compra> listaUsuario(Consumidor idUsuario) {
        EntityManager em = EMF.createEntityManager();
        
        String jpql = "SELECT u FROM Compra u where u.idConsumidorCompra = ?1";
        Query query = em.createQuery(jpql);
        query.setParameter(1, idUsuario);
        try{
        return (List<Compra>) query.getResultList();
        }catch(NoResultException e){
        return null;
        }
    }
    
    
    public Compra inserir(Compra entity) {
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
}
