package com.gconsulting.model.ids;

import java.io.Serializable;

import com.gconsulting.model.BaseObject;
import com.gconsulting.model.Market;

/**
 *
 * @author <a href="mailto:gsit80@gmail.com">Giovanni Silvestri</a>
 */
public class FeeApiTypeId extends BaseObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2913268437842471603L;
	private String type;
	private Market market;
	
	public FeeApiTypeId() {
    }
	
    public FeeApiTypeId(String type, Market market) {
		super();
		this.type = type;
		this.market = market;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Market getMarket() {
		return market;
	}

	public void setMarket(Market market) {
		this.market = market;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 0;
	}
}
