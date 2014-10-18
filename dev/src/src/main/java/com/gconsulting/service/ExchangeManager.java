package com.gconsulting.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gconsulting.dao.ExchangeDao;
import com.gconsulting.model.Api;
import com.gconsulting.model.Exchange;
import com.gconsulting.model.Fee;
import com.gconsulting.model.Market;
import com.gconsulting.model.ids.FeeApiId;


/**
 * Business Service Interface to handle communication between web and
 * persistence layer.
 *
 * @author <a href="mailto:gsit80@gmail.com"></a>
 */
public interface ExchangeManager extends GenericManager<Exchange, String> {

	/**
     * Convenience method for testing - allows you to mock the DAO and set it on an interface.
     * @param exchangeDao the ExchangeDao implementation to use
     */
    void setExchangeDao(ExchangeDao exchangeDao);

    /**
     * Retrieves an Exchange by code.  An exception is thrown if exchange not found
     *
     * @param code the identifier for the Echange
     * @return Echange
     */
    Exchange getExchangeByCode(String code);

    /**
     * Gets all Exchange entities in the db
     * 
     * @return List<Exchange> retrieved
     * 
     * @throws 
     */
    @Transactional
    List<Exchange> getAllExchange();

    /**
     * Create a new Exchange
     * 
     * @throws 
     */
    @Transactional
    void create(Exchange exchange);

    /**
     * Update an existing Exchange instance
     * 
     * @throws 
     */
    @Transactional
    void update(Exchange exchange);

    /**
     * Delete an existing Exchange instance
     * 
     * @throws 
     */
    @Transactional
    void delete(Exchange exchange);

    /**
     * Gets Market information based on code.
     * 
     * @param Code code of the market to be retrieved
     * @return Market retrieved
     * 
     * @throws 
     */
    @Transactional
    Market getMarketByCode(String code);

    /**
     * Gets all Market entities in the db
     * 
     * @return List<Market> retrieved
     * 
     * @throws 
     */
    @Transactional
    List<Market> getAllMarket();

    /**
     * Create a new Market
     * 
     * @throws 
     */
    @Transactional
    void create(Market market);

    /**
     * Update an existing Market instance
     * 
     * @throws 
     */
    @Transactional
    void update(Market market);

    /**
     * Delete an existing Market instance
     * 
     * @throws 
     */
    @Transactional
    void delete(Market market);

    /**
     * Gets Api information based on code.
     * 
     * @param FeeApiId id of the api to be retrieved
     * @return Exchange retrieved
     * 
     * @throws 
     */
    @Transactional
    Api getApiById(FeeApiId id);

    /**
     * Gets all Api entities in the db
     * 
     * @return List<Api> retrieved
     * 
     * @throws 
     */
    @Transactional
    List<Api> getAllApi();

    /**
     * Create a new Api
     * 
     * @throws 
     */
    @Transactional
    void create(Api api);

    /**
     * Update an existing Api instance
     * 
     * @throws 
     */
    @Transactional
    void update(Api api);

    /**
     * Delete an existing Api instance
     * 
     * @throws 
     */
    @Transactional
    void delete(Api api);

    /**
     * Gets Fee information based on code.
     * 
     * @param FeeApiId id of the fee to be retrieved
     * @return Fee retrieved
     * 
     * @throws 
     */
    @Transactional
    Fee getFeeById(FeeApiId id);

    /**
     * Gets all Fee entities in the db
     * 
     * @return List<Fee> retrieved
     * 
     * @throws 
     */
    @Transactional
    List<Fee> getAllFee();

    /**
     * Create a new Fee
     * 
     * @throws 
     */
    @Transactional
    void create(Fee fee);

    /**
     * Update an existing Fee instance
     * 
     * @throws 
     */
    @Transactional
    void update(Fee fee);

    /**
     * Delete an existing Fee instance
     * 
     * @throws 
     */
    @Transactional
    void delete(Fee fee);
}
