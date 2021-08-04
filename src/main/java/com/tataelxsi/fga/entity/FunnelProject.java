package com.tataelxsi.fga.entity;


import java.util.Date;

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
@Table(name="Funnel_Project")
public class FunnelProject {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(name="CRMID")
	
	private long crmid;
	@Column(name="Project_Name")
	private String projectName;
	@Column(name="Project_Owner")
	private String projectOwner;
	@Column(name="StartDate")
	private Date startDate;
    @Column(name="Duration_in_weeks")
	private long durationInWeeks;
	@Column(name="TotalProjectValue_in_Lakhs")
	private double totalProjectValueInLakhs;
    @Column(name="TPV_Per_Competency")
	private double tpvPerCompetency;
    
    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy="funnelProject")
	private FunnelRequirements fReq;
    
	public FunnelProject() {
		super();
	}
	public FunnelProject(long id, long crmid, String projectName, String projectOwner, Date startDate,
			long durationInWeeks, double totalProjectValueInLakhs, double tpvPerCompetency) {
		super();
		this.id = id;
		this.crmid = crmid;
		this.projectName = projectName;
		this.projectOwner = projectOwner;
		this.startDate = startDate;
		this.durationInWeeks = durationInWeeks;
		this.totalProjectValueInLakhs = totalProjectValueInLakhs;
		this.tpvPerCompetency = tpvPerCompetency;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getCrmid() {
		return crmid;
	}
	public void setCrmid(long crmid) {
		this.crmid = crmid;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectOwner() {
		return projectOwner;
	}
	public void setProjectOwner(String projectOwner) {
		this.projectOwner = projectOwner;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public long getDurationInWeeks() {
		return durationInWeeks;
	}
	public void setDurationInWeeks(long durationInWeeks) {
		this.durationInWeeks = durationInWeeks;
	}
	public double getTotalProjectValueInLakhs() {
		return totalProjectValueInLakhs;
	}
	public void setTotalProjectValueInLakhs(double totalProjectValueInLakhs) {
		this.totalProjectValueInLakhs = totalProjectValueInLakhs;
	}
	public double getTpvPerCompetency() {
		return tpvPerCompetency;
	}
	public void setTpvPerCompetency(double tpvPerCompetency) {
		this.tpvPerCompetency = tpvPerCompetency;
	}
	public FunnelRequirements getfReq() {
		return fReq;
	}
	public void setfReq(FunnelRequirements fReq) {
		this.fReq = fReq;
	}
	
	}