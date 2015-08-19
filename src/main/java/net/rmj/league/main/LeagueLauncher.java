package net.rmj.league.main;

import java.util.List;

import net.rmj.league.dao.LeagueDAO;
import net.rmj.league.entity.League;

public class LeagueLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LeagueDAO dao = new LeagueDAO();
		
		League league = new League();
		league.setLeagueName("Soccer Fall 2015");
		
		try {
			
			dao.persistLeague(league);
			
		} catch (Exception ex) {
			
		}
		
		List<League> list = dao.getLeagues();
		for (League l : list) {
			System.out.println("League -" + l.getLeagueName());
		}

	}

}
