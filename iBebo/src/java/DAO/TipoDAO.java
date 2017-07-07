/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.Tipo;

/**
 *
 * @author carlo
 */
public class TipoDAO {
    private final static EntityManagerFactory EMF = Persistence.createEntityManagerFactory("iBeboPU");
    
    public List<Tipo> listar() {
        EntityManager em = EMF.createEntityManager();
        
        String jpa = "SELECT u FROM Tipo u";
        Query query = em.createQuery(jpa);

        return (List<Tipo>) query.getResultList();
    }
    
    public List<Tipo> listarTipo()
    {
        EntityManager em = EMF.createEntityManager();
        
        String jpa = "SELECT u FROM Tipo u";
        Query query = em.createQuery(jpa);

        return (List<Tipo>) (TipoDAO) query.getResultList();
    }

}
