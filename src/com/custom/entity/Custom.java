package com.custom.entity;

/**
 * Custom entity. @author MyEclipse Persistence Tools
 */
/*
 * 20165874-…Ú¿ˆ∆º
 */
public class Custom implements java.io.Serializable {

	// Fields

	private Integer customid;
	private String cname;
	private String caddress;
	private String cemail;
	private String cpost;

	// Constructors

	/** default constructor */
	public Custom() {
	}

	/** full constructor */
	public Custom(String cname, String caddress, String cemail, String cpost) {
		this.cname = cname;
		this.caddress = caddress;
		this.cemail = cemail;
		this.cpost = cpost;
	}

	// Property accessors

	public Integer getCustomid() {
		return this.customid;
	}

	public void setCustomid(Integer customid) {
		this.customid = customid;
	}

	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCaddress() {
		return this.caddress;
	}

	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}

	public String getCemail() {
		return this.cemail;
	}

	public void setCemail(String cemail) {
		this.cemail = cemail;
	}

	public String getCpost() {
		return this.cpost;
	}

	public void setCpost(String cpost) {
		this.cpost = cpost;
	}

}