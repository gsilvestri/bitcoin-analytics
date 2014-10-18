package com.gconsulting.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gconsulting.model.Api;
import com.gconsulting.model.ids.FeeApiId;

/**
 * Api Data Access Object (GenericDao) interface.
 *
 * @author <a href="mailto:gsit80@gmail.com">Giovanni Silvestri</a>
 */
public interface ApiDao extends GenericDao<Api, FeeApiId> {

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
    List<Api> getAll();

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
}
