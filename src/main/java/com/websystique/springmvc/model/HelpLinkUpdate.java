package com.websystique.springmvc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author Sandeep
 *
 */
@Entity
@Table(name="HelpLinkUpdate")
public class HelpLinkUpdate implements Serializable {
    
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	
	//Added for oracle
	/*@Id
	@SequenceGenerator(name = "MySequence1", sequenceName = "HelpLinkUpdate_sequence", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MySequence1")*/
	private Integer id;
	
    @NotEmpty
	@Column(name="URL", unique=true, nullable=false)
	private String url;
	
	@NotEmpty
	@Column(name="FIELD_ID", nullable=false)
	private String filedid;
		
	@NotEmpty
	@Column(name="VALUE", nullable=false)
	private String value;

	@NotEmpty
	@Column(name="HELP_LINK", nullable=false)
	private String helplink;
	
	@NotEmpty
	@Column(name="APPLICATION_NAME", nullable=false)
	private String applicationname;

	

	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getUrl() {
		return url;
	}



	public void setUrl(String url) {
		this.url = url;
	}



	public String getFiledid() {
		return filedid;
	}



	public void setFiledid(String filedid) {
		this.filedid = filedid;
	}



	public String getValue() {
		return value;
	}



	public void setValue(String value) {
		this.value = value;
	}



	public String getHelplink() {
		return helplink;
	}



	public void setHelplink(String helplink) {
		this.helplink = helplink;
	}



	public String getApplicationname() {
		return applicationname;
	}



	public void setApplicationname(String applicationname) {
		this.applicationname = applicationname;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", fieldid=" + filedid + ", url=" + url
				+ ", value=" + value + ", applicationname=" + applicationname
				+ ", helplink=" + helplink + "]";
	}
	/*	return "User [fieldid=" + filedid + ", url=" + url
				+ ", value=" + value + ", applicationname=" + applicationname
				+ ", helplink=" + helplink + "]";
	}*/



	public Object getUserProfiles() {
		// TODO Auto-generated method stub
		return null;
	}
}
