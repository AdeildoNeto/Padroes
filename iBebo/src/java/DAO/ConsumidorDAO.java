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

/**
 *
 * @author aldo_neto
 */
public class ConsumidorDAO {
 
         private final static EntityManagerFactory EMF = Persistence.createEntityManagerFactory("iBeboPU");

    
     public Consumidor getSingle(String login) {
         EntityManager em = EMF.createEntityManager();
        
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
    
}
