package net.rmj.league.dao;

import java.util.List;

import javax.persistence.EntityManager;

public interface GenericDAO {
	
	EntityManager getEntityManager();
	
	<T> T find(Class<T> clazz, Object id);
	
	void insert(Object o);
	
	void delete(Object o);
	
	void save(Object o);
	
	<T> List<T> findAll(Class<T> clazz);
	
	
	<T> List<T> findAllOrderBy(Class<T> clazz, String colName);
	
	<T, PropType> List<T> findWherePropertIn(Class<T> clazz, String propName, List<PropType> valueList);
	

}
