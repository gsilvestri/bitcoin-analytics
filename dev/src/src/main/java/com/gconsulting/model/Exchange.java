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
@Table(name = "exchange")
public class Exchange extends BaseObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -915434706032263031L;
	private String code;
    private String name;
    private String description;
    private String websiteAddress;
    private String apiAddress;
    private Boolean restInterface;
    
    public Exchange() {
    }
    
	public Exchange(String code, String name, String description,
			String websiteAddress, String apiAddress, Boolean restInterface) {
		super();
		this.code = code;
		this.name = name;
		this.description = description;
		this.websiteAddress = websiteAddress;
		this.apiAddress = apiAddress;
		this.restInterface = restInterface;
	}

	@Id
    @Column(name = "code", nullable = false, length = 20)
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

    @Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    @Column(name = "description")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

    @Column(name = "website_address")
	public String getWebsiteAddress() {
		return websiteAddress;
	}

	public void setWebsiteAddress(String websiteAddress) {
		this.websiteAddress = websiteAddress;
	}

    @Column(name = "api_address")
	public String getApiAddress() {
		return apiAddress;
	}

	public void setApiAddress(String apiAddress) {
		this.apiAddress = apiAddress;
	}

    @Column(name = "interface")
	public Boolean getRestInterface() {
		return restInterface;
	}

	public void setRestInterface(Boolean restInterface) {
		this.restInterface = restInterface;
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
        if (!(o instanceof Exchange)) {
            return false;
        }
        final Exchange market = (Exchange) o;
        return !(code != null ? !code.equals(market.getCode()) : market.getCode() != null);
	}

	@Override
	public int hashCode() {
        return (code != null ? code.hashCode() : 0);
	}
}
