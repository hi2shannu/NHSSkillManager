package com.nhs.skill.util;

import java.io.Serializable;

public enum SkillLevel implements Serializable{

	EXPERT,
    PRACTITIONER,
    WORKING,
    AWARENESS;
    
    public String getskill() 
	{
		return this.name();
	}
}
