/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author joselima
 */
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.Endereco;

/**
 *
 * @author Aluno
 */
public class EnderecoDAO{
    private final static EntityManagerFactory EMF = Persistence.createEntityManagerFactory("iBeboPU");


    public List<Endereco> listSingle(int idEndereco) {
        EntityManager em = EMF.createEntityManager();
        
        String jpql = "SELECT u FROM Endereco u where u.idEndereco = ?1";
        Query query = em.createQuery(jpql);
        query.setParameter(1, idEndereco);
        try{
        return (List<Endereco>) query.getResultList();
        }catch(NoResultException e){
        return null;
        }
    }
    
    public List<Endereco> listaCep(String cep) {
        EntityManager em = EMF.createEntityManager();
        
        String jpql = "SELECT u FROM Endereco u where u.cepEndereco = ?1";
        Query query = em.createQuery(jpql);
        query.setParameter(1, cep);
        try{
      //  List lista = (List<Endereco>) query.getSingleResult(); 
        return (List<Endereco>) query.getResultList();
        }catch(NoResultException e){
        return null;
        }
    }
   
    public List<Endereco> listar() {
        EntityManager em = EMF.createEntityManager();
        
        String jpa = "SELECT u FROM Endereco u";
        Query query = em.createQuery(jpa);

        return (List<Endereco>) query.getResultList();
    }

    
    public Endereco inserir(Endereco entity) {
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

  
    public void deletar(Endereco entity) {
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

    
    public Endereco atualizar(Endereco entity) {
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
