package com.gconsulting.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gconsulting.model.Market;

/**
 * Market Data Access Object (GenericDao) interface.
 *
 * @author <a href="mailto:gsit80@gmail.com">Giovanni Silvestri</a>
 */
public interface MarketDao extends GenericDao<Market, String> {

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
    List<Market> getAll();

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
}
