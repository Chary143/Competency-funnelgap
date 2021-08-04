package com.tataelxsi.fga.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Funnel_Skill")
public class FunnelSkill {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	 
	@Column(name="Skill_Name")
	private String skillName;
	
	@Column(name="Level")
	private String level;

	@Column(name="Experience")
	private long experience;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy="fSkill")
	private FunnelRequirements fReq;
	

	public FunnelSkill() {
		super();
	}

	public FunnelSkill(long id, String skillName, String level,long experience,
			List<FunnelRequirements> funnelrequirements) {
		super();
		this.id = id;
		this.skillName = skillName;
		this.level = level;
		this.experience = experience;
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public long getExperience() {
		return experience;
	}

	public void setExperience(long experience) {
		this.experience = experience;
	}

	public FunnelRequirements getfReq() {
		return fReq;
	}

	public void setfReq(FunnelRequirements fReq) {
		this.fReq = fReq;
	}
	

}