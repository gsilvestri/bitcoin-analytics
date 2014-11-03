package com.gconsulting.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.gconsulting.model.ids.FeeApiId;

/**
 *
 * @author <a href="mailto:gsit80@gmail.com">Giovanni Silvestri</a>
 */
@Entity
@IdClass(FeeApiId.class)
@Table(name = "api")
public class API extends BaseObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2578145832311322927L;
	private Exchange exchange;
	private FeeApiType feeType;
	private String address;

	public API() {
	}

	public API(Exchange exchange, FeeApiType feeType, String address) {

		super();
		this.exchange = exchange;
		this.feeType = feeType;
		this.address = address;
	}

	@Id
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "exchange", referencedColumnName = "code")
	public Exchange getExchange() {
		return exchange;
	}

	public void setExchange(Exchange exchange) {
		this.exchange = exchange;
	}

	@Id
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumns({
			@JoinColumn(name = "type_type", referencedColumnName = "type"),
			@JoinColumn(name = "type_market", referencedColumnName = "market") })
	public FeeApiType getFeeType() {
		return feeType;
	}

	public void setFeeType(FeeApiType feeType) {
		this.feeType = feeType;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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
