package com.gconsulting.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.gconsulting.model.ids.FeeApiTypeId;

/**
 *
 * @author <a href="mailto:gsit80@gmail.com">Giovanni Silvestri</a>
 */
@Entity
@IdClass(FeeApiTypeId.class)
@Table(name = "feeapi_type")
public class FeeApiType extends BaseObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 873269891253343990L;
	private String type;
	private Market market;
		
    public FeeApiType() {
    }
    
	public FeeApiType(String type, Market market) {
		super();
		this.type = type;
		this.market = market;
	}

	@Id
    @Column(name = "type", nullable = false, length = 20)
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Id
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="market", referencedColumnName = "code")
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
