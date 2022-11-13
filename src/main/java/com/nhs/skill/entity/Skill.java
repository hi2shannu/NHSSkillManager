package com.nhs.skill.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.nhs.skill.util.SkillLevel;

@Entity
@Table(name = "skill")
public class Skill {
	
	@Id
	@Column(name = "key")
	@GeneratedValue
	private int key;
	@Column(name = "skill_id")
	private int skillId;
	@Column(name = "skill_name")
	private String skillName;
	@Column(name = "skill_level")
	@Enumerated(EnumType.STRING)
	private SkillLevel skillLevel;

	public Skill() {
		super();
	}

	public Skill(int key, int skillId, String skillName, SkillLevel skillLevel) {
		super();
		this.key = key;
		this.skillId = skillId;
		this.skillName = skillName;
		this.skillLevel = skillLevel;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public int getSkillId() {
		return skillId;
	}

	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public SkillLevel getSkillLevel() {
		return skillLevel;
	}

	public void setSkillLevel(SkillLevel skillLevel) {
		this.skillLevel = skillLevel;
	}

	@Override
	public String toString() {
		return "Skill [key=" + key + ", skillId=" + skillId + ", skillName=" + skillName + ", skillLevel=" + skillLevel
				+ "]";
	}

}
