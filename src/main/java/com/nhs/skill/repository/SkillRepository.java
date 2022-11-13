package com.nhs.skill.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nhs.skill.entity.Skill;

public interface SkillRepository extends JpaRepository<Skill, Integer> {

}
