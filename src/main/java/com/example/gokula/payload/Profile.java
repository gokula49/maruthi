package com.example.gokula.payload;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Profile {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	private String employeename;
	private String phoneno;
	private String website;
	private String timeZome;
	private String currencyLocale;

	
	

	public Profile() {
		super();
	}

	public Profile(Integer id, String employeename, String phoneno, String website, String timeZome,
			String currencyLocale) {
		super();
		this.id = id;
		this.employeename = employeename;
		this.phoneno = phoneno;
		this.website = website;
		this.timeZome = timeZome;
		this.currencyLocale = currencyLocale;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getTimeZome() {
		return timeZome;
	}

	public void setTimeZome(String timeZome) {
		this.timeZome = timeZome;
	}

	public String getCurrencyLocale() {
		return currencyLocale;
	}

	public void setCurrencyLocale(String currencyLocale) {
		this.currencyLocale = currencyLocale;
	}

}
