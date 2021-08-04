package com.tataelxsi.fga.entity;


import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Funnel_Requirements")
public class FunnelRequirements {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(name="Funnel_Id")
	private long funnelId;
	@Column(name="Job_Description")
	@Lob
	private String jobDescription;
	@Column(name="Number_Of_Positions")
	private long numberOfPositions;
	@Column(name="Reserved_No")
	private long reservedNo;
	@Column (name="Reserved_Emp_No")
	private long reservedEmpNo;

	@Column(name="Remarks")
	@Lob
    private String remarks;
	@Column(name="Requirement_Date")
	private Date requirementDate;
	
	@OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name="funnel_buc_id")
	private FunnelBuc funnelbuc;
	@OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name="funnel_customer_id")
	private FunnelCustomer funnelCustomer;
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="funnel_project_id")
	private FunnelProject funnelProject;
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="funnel_project_category_id")
	private FunnelProjectCategory fProjCat;
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="funnel_project_probability_id")
	private FunnelProjectProbability fProjProb;
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="funnel_project_stage_id")
	private FunnelProjectStage fProjStage;
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="funnel_skill_id")
	private FunnelSkill fSkill;
	
	public FunnelRequirements() {
		super();
	}

	public FunnelRequirements(long id, long funnelId, String jobDescription, long numberOfPositions, long reservedNo,
			long reservedEmpNo, String remarks, Date requirementDate, FunnelBuc funnelbuc,
			FunnelCustomer funnelCustomer, FunnelProject funnelProject, FunnelProjectCategory fProjCat,
			FunnelProjectProbability fProjProb, FunnelProjectStage fProjStage, FunnelSkill fSkill) {
		super();
		this.id = id;
		this.funnelId = funnelId;
		this.jobDescription = jobDescription;
		this.numberOfPositions = numberOfPositions;
		this.reservedNo = reservedNo;
		this.reservedEmpNo = reservedEmpNo;
		this.remarks = remarks;
		this.requirementDate = requirementDate;
		this.funnelbuc = funnelbuc;
		this.funnelCustomer = funnelCustomer;
		this.funnelProject = funnelProject;
		this.fProjCat = fProjCat;
		this.fProjProb = fProjProb;
		this.fProjStage = fProjStage;
		this.fSkill = fSkill;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getFunnelId() {
		return funnelId;
	}

	public void setFunnelId(long funnelId) {
		this.funnelId = funnelId;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public long getNumberOfPositions() {
		return numberOfPositions;
	}

	public void setNumberOfPositions(long numberOfPositions) {
		this.numberOfPositions = numberOfPositions;
	}

	public long getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(long reservedNo) {
		this.reservedNo = reservedNo;
	}

	public long getReservedEmpNo() {
		return reservedEmpNo;
	}

	public void setReservedEmpNo(long reservedEmpNo) {
		this.reservedEmpNo = reservedEmpNo;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Date getRequirementDate() {
		return requirementDate;
	}

	public void setRequirementDate(Date requirementDate) {
		this.requirementDate = requirementDate;
	}

	public FunnelBuc getFunnelbuc() {
		return funnelbuc;
	}

	public void setFunnelbuc(FunnelBuc funnelbuc) {
		this.funnelbuc = funnelbuc;
	}

	public FunnelCustomer getFunnelCustomer() {
		return funnelCustomer;
	}

	public void setFunnelCustomer(FunnelCustomer funnelCustomer) {
		this.funnelCustomer = funnelCustomer;
	}

	public FunnelProject getFunnelProject() {
		return funnelProject;
	}

	public void setFunnelProject(FunnelProject funnelProject) {
		this.funnelProject = funnelProject;
	}

	public FunnelProjectCategory getfProjCat() {
		return fProjCat;
	}

	public void setfProjCat(FunnelProjectCategory fProjCat) {
		this.fProjCat = fProjCat;
	}

	public FunnelProjectProbability getfProjProb() {
		return fProjProb;
	}

	public void setfProjProb(FunnelProjectProbability fProjProb) {
		this.fProjProb = fProjProb;
	}

	public FunnelProjectStage getfProjStage() {
		return fProjStage;
	}

	public void setfProjStage(FunnelProjectStage fProjStage) {
		this.fProjStage = fProjStage;
	}

	public FunnelSkill getfSkill() {
		return fSkill;
	}

	public void setfSkill(FunnelSkill fSkill) {
		this.fSkill = fSkill;
	}
	
}