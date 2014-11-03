package com.gconsulting.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gconsulting.dao.ExchangeDao;
import com.gconsulting.model.API;
import com.gconsulting.model.Exchange;
import com.gconsulting.model.Fee;
import com.gconsulting.model.FeeApiType;
import com.gconsulting.model.Market;
import com.gconsulting.model.ids.FeeApiId;
import com.gconsulting.model.ids.FeeApiTypeId;
import com.gconsulting.service.ExchangeManager;

/**
 * Implementation of ExchangeManager interface.
 *
 * @author <a href="mailto:gsit80@gmail.com">Giovanni Silvestri</a>
 */
@Service("exchangeManager")
public class ExchangeManagerImpl implements ExchangeManager {

	private ExchangeDao exchangeDao;

	public ExchangeManagerImpl() {
	}

	public ExchangeManagerImpl(ExchangeDao exchangeDao) {
		this.exchangeDao = exchangeDao;
	}

	@Override
	@Autowired
	public void setExchangeDao(final ExchangeDao exchangeDao) {
		this.exchangeDao = exchangeDao;
	}

	/**
	 * {@inheritDoc}
	 */
	public Exchange getExchangeByCode(String code) {
		return exchangeDao.getExchangeByCode(code);
	}

	/**
	 * {@inheritDoc}
	 */
	public List<Exchange> getAllExchange() {
		return exchangeDao.getAllExchange();
	}

	/**
	 * {@inheritDoc}
	 */
	public void create(Exchange exchange) {
		exchangeDao.create(exchange);
	}

	/**
	 * {@inheritDoc}
	 */
	public void update(Exchange exchange) {
		exchangeDao.update(exchange);
	}

	/**
	 * {@inheritDoc}
	 */
	public void delete(Exchange exchange) {
		exchangeDao.delete(exchange);
	}

	/**
	 * {@inheritDoc}
	 */
	public Market getMarketByCode(String code) {

		return exchangeDao.getMarketByCode(code);
	}

	/**
	 * {@inheritDoc}
	 */
	public List<Market> getAllMarket() {
		return exchangeDao.getAllMarket();
	}

	/**
	 * {@inheritDoc}
	 */
	public void create(Market market) {
		exchangeDao.create(market);
	}

	/**
	 * {@inheritDoc}
	 */
	public void update(Market market) {
		exchangeDao.update(market);
	}

	/**
	 * {@inheritDoc}
	 */
	public void delete(Market market) {
		exchangeDao.delete(market);
	}

	/**
	 * {@inheritDoc}
	 */
	public API getApiById(FeeApiId id) {

		return exchangeDao.getApiById(id);
	}

	/**
	 * {@inheritDoc}
	 */
	public List<API> getAllApi() {
		return exchangeDao.getAllApi();
	}

	/**
	 * {@inheritDoc}
	 */
	public void create(API api) {
		exchangeDao.create(api);
	}

	/**
	 * {@inheritDoc}
	 */
	public void update(API api) {
		exchangeDao.update(api);
	}

	/**
	 * {@inheritDoc}
	 */
	public void delete(API api) {
		exchangeDao.delete(api);
	}

	/**
	 * {@inheritDoc}
	 */
	public Fee getFeeById(FeeApiId id) {

		return exchangeDao.getFeeById(id);
	}

	/**
	 * {@inheritDoc}
	 */
	public List<Fee> getAllFee() {
		return exchangeDao.getAllFee();
	}

	/**
	 * {@inheritDoc}
	 */
	public void create(Fee fee) {
		exchangeDao.create(fee);
	}

	/**
	 * {@inheritDoc}
	 */
	public void update(Fee fee) {
		exchangeDao.update(fee);
	}

	/**
	 * {@inheritDoc}
	 */
	public void delete(Fee fee) {
		exchangeDao.delete(fee);
	}

	/**
	 * {@inheritDoc}
	 */
    public FeeApiType getTypeById(FeeApiTypeId id){
		return exchangeDao.getTypeById(id);
    }

	/**
	 * {@inheritDoc}
	 */
    public List<FeeApiType> getAllType(){
		return exchangeDao.getAllType();
    }

	/**
	 * {@inheritDoc}
	 */
    public void create(FeeApiType type) {
		exchangeDao.create(type);
    }

	/**
	 * {@inheritDoc}
	 */
    public void update(FeeApiType type) {
		exchangeDao.update(type);
    }

	/**
	 * {@inheritDoc}
	 */
    public void delete(FeeApiType type) {
		exchangeDao.delete(type);
    }
}
