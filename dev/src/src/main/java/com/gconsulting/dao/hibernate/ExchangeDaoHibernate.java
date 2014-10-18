package com.gconsulting.dao.hibernate;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Repository;

import com.gconsulting.dao.ExchangeDao;
import com.gconsulting.model.Api;
import com.gconsulting.model.Exchange;
import com.gconsulting.model.Fee;
import com.gconsulting.model.Market;
import com.gconsulting.model.ids.FeeApiId;

/**
 * This class interacts with Hibernate session to save/delete and retrieve
 * Exchange objects.
 *
 * @author <a href="mailto:gsit80@gmail.com">Giovanni Silvestri</a>
 */
@Repository("exchangeDao")
@SuppressWarnings("unchecked")
public class ExchangeDaoHibernate
		implements ExchangeDao {

	/**
     * Log variable for all child classes. Uses LogFactory.getLog(getClass()) from Commons Logging
     */
    protected final Log log = LogFactory.getLog(ExchangeDaoHibernate.class);
    @Resource
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return this.sessionFactory;
    }

    public Session getSession() throws HibernateException {
        Session sess = getSessionFactory().getCurrentSession();
        if (sess == null) {
            sess = getSessionFactory().openSession();
        }
        return sess;
    }

    @Autowired
    @Required
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public ExchangeDaoHibernate() {
	}

	/**
	 * {@inheritDoc}
	 */
	public Exchange getExchangeByCode(String code) {
		
		Query qry = getSession().createQuery(
				"from Exchange e where e.code='" + code + "'");
		if (qry.list() != null) {
			if (qry.list().size() > 0) {
				return (Exchange) qry.list().get(0);
			}
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
    public List<Exchange> getAllExchange() {
		return (List<Exchange>) getSession().createQuery(
				"from Exchange").list();
    }

	/**
	 * {@inheritDoc}
	 */
    public void create(Exchange exchange) {
    	getSession().save(exchange);
    }

	/**
	 * {@inheritDoc}
	 */
    public void update(Exchange exchange) {
    	getSession().update(exchange);
    }

	/**
	 * {@inheritDoc}
	 */
    public void delete(Exchange exchange) {
    	getSession().delete(exchange);
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
    public List<Market> getAllMarket() {
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

	/**
	 * {@inheritDoc}
	 */
	public Api getApiById(FeeApiId id) {
		
		return (Api) getSession().get(Api.class, id);
	}

	/**
	 * {@inheritDoc}
	 */
    public List<Api> getAllApi() {
		return (List<Api>) getSession().createQuery(
				"from Api").list();
    }

	/**
	 * {@inheritDoc}
	 */
    public void create(Api api) {
    	getSession().save(api);
    }

	/**
	 * {@inheritDoc}
	 */
    public void update(Api api) {
    	getSession().update(api);
    }

	/**
	 * {@inheritDoc}
	 */
    public void delete(Api api) {
    	getSession().delete(api);
    }

	/**
	 * {@inheritDoc}
	 */
	public Fee getFeeById(FeeApiId id) {
		
		return (Fee) getSession().get(Fee.class, id);
	}

	/**
	 * {@inheritDoc}
	 */
    public List<Fee> getAllFee() {
		return (List<Fee>) getSession().createQuery(
				"from Fee").list();
    }

	/**
	 * {@inheritDoc}
	 */
    public void create(Fee fee) {
    	getSession().save(fee);
    }

	/**
	 * {@inheritDoc}
	 */
    public void update(Fee fee) {
    	getSession().update(fee);
    }

	/**
	 * {@inheritDoc}
	 */
    public void delete(Fee fee) {
    	getSession().delete(fee);
    }
}
