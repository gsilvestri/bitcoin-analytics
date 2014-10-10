package com.gconsulting.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 *
 * @author <a href="mailto:gsit80@gmail.com">Giovanni Silvestri</a>
 */
@Entity
@Table(name = "market")
public class Market extends BaseObject implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -3583315325662775953L;
	private String code;
    private String description;

    public Market() {
    }
    
    public Market(String code, String description) {
		super();
		this.code = code;
		this.description = description;
	}

	@Id
    @Column(name = "code", nullable = false, length = 20)
    public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

    @Column(name = "description")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		
        ToStringBuilder sb = new ToStringBuilder(this, ToStringStyle.DEFAULT_STYLE)
        .append("code", this.code)
        .append("description", this.description);
		return sb.toString();
	}

	@Override
	public boolean equals(Object o) {

		if (this == o) {
            return true;
        }
        if (!(o instanceof Market)) {
            return false;
        }
        final Market market = (Market) o;
        return !(code != null ? !code.equals(market.getCode()) : market.getCode() != null);
	}

	@Override
	public int hashCode() {
        return (code != null ? code.hashCode() : 0);
	}
}
