package com.gconsulting.dao.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.gconsulting.dao.MarketDao;
import com.gconsulting.model.Market;

/**
 * This class interacts with Hibernate session to save/delete and retrieve
 * Market objects.
 *
 * @author <a href="mailto:gsit80@gmail.com">Giovanni Silvestri</a>
 */
@Repository("marketDao")
@SuppressWarnings("unchecked")
public class MarketDaoHibernate extends GenericDaoHibernate<Market, String>
		implements MarketDao {

	public MarketDaoHibernate(Class<Market> persistentClass) {
		super(persistentClass);
	}

	/**
	 * {@inheritDoc}
	 */
	public Market getMarketByCode(String code) {
		
		Query qry = getSession().createQuery(
				"from Market m where m.code='" + code + "'");
		if (qry.list() != null) {
			if (qry.list().size() > 0) {
				return (Market) qry.list().get(0);
			}
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
    public List<Market> getAll() {
		return (List<Market>) getSession().createQuery(
				"from Market").list();
    }

	/**
	 * {@inheritDoc}
	 */
    public void create(Market market) {
    	getSession().save(market);
    }

	/**
	 * {@inheritDoc}
	 */
    public void update(Market market) {
    	getSession().update(market);
    }

	/**
	 * {@inheritDoc}
	 */
    public void delete(Market market) {
    	getSession().delete(market);
    }
}
