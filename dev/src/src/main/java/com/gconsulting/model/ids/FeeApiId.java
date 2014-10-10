package com.gconsulting.model.ids;

import java.io.Serializable;

import com.gconsulting.model.BaseObject;
import com.gconsulting.model.Exchange;
import com.gconsulting.model.FeeApiType;

/**
 *
 * @author <a href="mailto:gsit80@gmail.com">Giovanni Silvestri</a>
 */
public class FeeApiId extends BaseObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5816491385865025825L;
	
	private Exchange exchange;
	private FeeApiType feeType;

	public FeeApiId() {
		super();
	}

	public FeeApiId(Exchange exchange, FeeApiType feeType) {
		super();
		this.exchange = exchange;
		this.feeType = feeType;
	}

	public Exchange getExchange() {
		return exchange;
	}

	public void setExchange(Exchange exchange) {
		this.exchange = exchange;
	}

	public FeeApiType getFeeType() {
		return feeType;
	}

	public void setFeeType(FeeApiType feeType) {
		this.feeType = feeType;
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
