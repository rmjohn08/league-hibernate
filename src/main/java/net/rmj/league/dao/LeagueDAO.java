package net.rmj.league.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import net.rmj.league.entity.League;

public class LeagueDAO extends GenericDAOImpl {

	public void persistLeague(League league) {
		EntityManager em = createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		
		em.persist(league);
		tx.commit();
		em.close();
		
	}
	
	@SuppressWarnings("unchecked")
	public List<League> getLeagues() {
		
		EntityManager em = createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		Query qry = em.createQuery("select l from League l");
		List<League> leagues = qry.getResultList();
		
		
		tx.commit();
		em.close();
		return leagues;
		
	}
}
