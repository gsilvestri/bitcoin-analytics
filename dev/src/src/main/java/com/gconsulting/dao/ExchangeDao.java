package com.gconsulting.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gconsulting.model.API;
import com.gconsulting.model.Exchange;
import com.gconsulting.model.Fee;
import com.gconsulting.model.FeeApiType;
import com.gconsulting.model.Market;
import com.gconsulting.model.ids.FeeApiId;
import com.gconsulting.model.ids.FeeApiTypeId;

/**
 * Exchange Data Access Object (GenericDao) interface.
 *
 * @author <a href="mailto:gsit80@gmail.com">Giovanni Silvestri</a>
 */
public interface ExchangeDao {

    /**
     * Gets Exchange information based on code.
     * 
     * @param Code code of the exchange to be retrieved
     * @return Exchange retrieved
     * 
     * @throws 
     */
    @Transactional
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
    API getApiById(FeeApiId id);

    /**
     * Gets all Api entities in the db
     * 
     * @return List<Api> retrieved
     * 
     * @throws 
     */
    @Transactional
    List<API> getAllApi();

    /**
     * Create a new Api
     * 
     * @throws 
     */
    @Transactional
    void create(API api);

    /**
     * Update an existing Api instance
     * 
     * @throws 
     */
    @Transactional
    void update(API api);

    /**
     * Delete an existing Api instance
     * 
     * @throws 
     */
    @Transactional
    void delete(API api);

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

    /**
     * Gets Type information based on ids.
     * 
     * @param FeeApiTypeId id of the type to be retrieved
     * @return FeeApiType retrieved
     * 
     * @throws 
     */
    @Transactional
    FeeApiType getTypeById(FeeApiTypeId id);

    /**
     * Gets all FeeApiType entities in the db
     * 
     * @return List<FeeApiType> retrieved
     * 
     * @throws 
     */
    @Transactional
    List<FeeApiType> getAllType();

    /**
     * Create a new FeeApiType
     * 
     * @throws 
     */
    @Transactional
    void create(FeeApiType type);

    /**
     * Update an existing FeeApiType instance
     * 
     * @throws 
     */
    @Transactional
    void update(FeeApiType type);

    /**
     * Delete an existing FeeApiType instance
     * 
     * @throws 
     */
    @Transactional
    void delete(FeeApiType type);
}
