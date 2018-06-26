package Model;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

public abstract class DAOGenerico<E> {
	
	@PersistenceContext(unitName = "estamparia")
	private EntityManagerFactory entityManagerFactory;
	private Class<E> persistentClass;

	@SuppressWarnings("unchecked")	
	public DAOGenerico(EntityManagerFactory emf){
		
		this.setEntityManagerFactory(emf);
		this.entityManagerFactory = emf;
		ParameterizedType parameterizedType = (ParameterizedType) getClass().getGenericSuperclass();  
	    persistentClass = (Class<E>) parameterizedType.getActualTypeArguments()[0]; 
	    
	}
	
	/**
	 * Salva o objeto atual na base de dados.
	 * 
	 * @param objeto a ser salvo
	 */
	public void inserir(E objeto) {
		
		EntityManager em = this.entityManagerFactory.createEntityManager();
		EntityTransaction tx = em.getTransaction();		
		
		try {
			
			tx.begin();
			em.persist(objeto);
			tx.commit();
			em.close();
			
		} catch (PersistenceException e) {
			
			tx.rollback();
			
		}
	}
	
	/**
	 * Remove o objeto da base de dados.
	 * 
	 * @param objeto
	 *            a ser removido
	 */
	public final void remover(E objeto) {
		
		EntityManager em = this.entityManagerFactory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		objeto = em.merge(objeto);		
		em.remove(objeto);		
		tx.commit();		
		em.close();
		
	}
	
	/**
	 * Executa o merge do objeto que se encontra em mem�ria.
	 * 
	 * @param objeto
	 *            a ser realizado o merge
	 * @return objeto que foi executado o merge
	 */
	public E alterar(E objeto) {
		
		EntityManager em = this.entityManagerFactory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();		
		objeto = em.merge(objeto);		
		tx.commit();		
		em.close();
		
		return objeto;
		
	}
	
	@SuppressWarnings("unchecked")
	public final List<E> getAll() {
		
		List<E> instance = null;
		EntityManager em = this.entityManagerFactory.createEntityManager();
		
		try {
			
			instance = ((List<E>) em.createQuery("from " + getPersistentClass().getName()).getResultList());
			
		} catch (RuntimeException re) {
			
			re.printStackTrace();
			
		}
		
		em.close();
		
		return instance;
	}

	/**
	 * Salva o objeto atual na base de dados.
	 * 
	 * @param objeto
	 *            a ser salvo
	 */
	public final void insertCollection(Collection<E> colecao) {
		
		EntityManager em = this.entityManagerFactory.createEntityManager();
		
		try {
			
			EntityTransaction tx = em.getTransaction();
			
			tx.begin();

			for (E entidade : colecao) {
				
				em.persist(entidade);
				
			}
			
			tx.commit();			
			em.close();
			
		} catch (PersistenceException e) {
			
			e.printStackTrace();
			
		}
	}
	
	/**
	 * Busca o objeto uma vez passado sua chave como par�metro.
	 * 
	 * @param id
	 *            identificador
	 * @return Objeto do tipo T
	 */
	public final E pesquisarPorId(Serializable id) {
		
		E instance = null;
		EntityManager em = this.entityManagerFactory.createEntityManager();
		
		try {
			
			instance = (E) em.find(getPersistentClass(), id);
			
		} catch (RuntimeException re) {
			
			re.printStackTrace();
			
		}
		
		em.close();
		
		return instance;
	}

	/**
	 * Atualiza o objeto que se encontra em mem�ria.
	 * 
	 * @param object
	 *            objeto a ser atualizado
	 */
	public final void refresh(E object) {
		
		EntityManager em = this.entityManagerFactory.createEntityManager();
		
		em.refresh(object);
		em.close();
	}
	
	/**
	 * Utilizado para se injetar o Entity manager no DAO.
	 * 
	 * @param entityManager
	 *            entity manager
	 */
	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		
		this.entityManagerFactory = entityManagerFactory;
		
	}

	public EntityManagerFactory getEntityManagerFactory() {		
		
		return entityManagerFactory;
		
	}
	
	/**
	 * Busca a classe persistente do objeto utilizado na classe.
	 * 
	 * @return classe persistente
	 */
	protected final Class<E> getPersistentClass() {
		
		return persistentClass;
		
	}
}