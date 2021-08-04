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
@Table(name="Funnel_Buc")
public class FunnelBuc {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(name="BUName")
	private String buName;
	@Column(name="Competency")
	private String competency;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy="funnelbuc")
	private FunnelRequirements fReq;
	
	public FunnelBuc() {
		super();
	}
	public FunnelBuc(long id, String buName, String competency) {
		super();
		this.id= id;
		this.buName = buName;
		this.competency = competency;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBuName() {
		return buName;
	}
	public void setBuName(String buName) {
		this.buName = buName;
	}
	public String getCompetency() {
		return competency;
	}
	public void setCompetency(String competency) {
		this.competency = competency;
	}
	public FunnelRequirements getfReq() {
		return fReq;
	}
	public void setfReq(FunnelRequirements fReq) {
		this.fReq = fReq;
	}
	
	

}
	


