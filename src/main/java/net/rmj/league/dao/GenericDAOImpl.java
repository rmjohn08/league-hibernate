package net.rmj.league.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;


public class GenericDAOImpl implements GenericDAO {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("hsqldb-league");
	
	public EntityManager createEntityManager() {
		return emf.createEntityManager();
	}
	
	private static void closeEntityManager() {
		emf.close();
	}

	public EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return emf.createEntityManager();
	}

	public <T> T find(Class<T> clazz, Object id) {
		return getEntityManager().find(clazz, id);
		
	}

	public void insert(Object o) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Object o) {
		// TODO Auto-generated method stub
		
	}

	public void save(Object o) {
		// TODO Auto-generated method stub
		
	}

	public <T> List<T> findAll(Class<T> clazz) {
		EntityManager em = getEntityManager();
		CriteriaQuery<T> criteria = em.getCriteriaBuilder().createQuery(clazz);
		criteria.select(criteria.from(clazz));
		List<T> resultList = em.createQuery(criteria).getResultList();
		return resultList;
	}

	public <T> List<T> findAllOrderBy(Class<T> clazz, String colName) {
		// TODO Auto-generated method stub
		return null;
	}

	public <T, PropType> List<T> findWherePropertIn(Class<T> clazz,
			String propName, List<PropType> valueList) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
