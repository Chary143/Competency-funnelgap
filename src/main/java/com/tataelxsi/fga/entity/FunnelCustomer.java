package com.tataelxsi.fga.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Funnel_Customer")
public class FunnelCustomer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(name="Customer_Name")
	private String customerName;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy="funnelCustomer")
	private FunnelRequirements fReq;
	
	public FunnelCustomer() {
		super();
	}
	public FunnelCustomer(long id, String customerName) {
		super();
		this.id= id;
		this.customerName = customerName;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public FunnelRequirements getfReq() {
		return fReq;
	}
	public void setfReq(FunnelRequirements fReq) {
		this.fReq = fReq;
	}
	
	

}
