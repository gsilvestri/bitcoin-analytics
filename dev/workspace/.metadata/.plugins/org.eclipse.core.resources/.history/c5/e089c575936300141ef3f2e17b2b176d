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
@Table(name = "fee")
public class Fee extends BaseObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8921297484960476722L;

	private Exchange exchange;
	private FeeApiType feeType;
	private String unit;
	private String value;

	public Fee() {
	}

	public Fee(Exchange exchange, FeeApiType feeType, String unit, String value) {
		super();
		this.exchange = exchange;
		this.feeType = feeType;
		this.unit = unit;
		this.value = value;
	}

	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "exchange", referencedColumnName = "code")
	public Exchange getExchange() {
		return exchange;
	}

	public void setExchange(Exchange exchange) {
		this.exchange = exchange;
	}

	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "type_type", referencedColumnName = "type"),
			@JoinColumn(name = "type_market", referencedColumnName = "market") })
	public FeeApiType getFeeType() {
		return feeType;
	}

	public void setFeeType(FeeApiType feeType) {
		this.feeType = feeType;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
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
