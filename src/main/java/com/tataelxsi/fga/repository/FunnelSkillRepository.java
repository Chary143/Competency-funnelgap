package com.tataelxsi.fga.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tataelxsi.fga.entity.FunnelSkill;

@Repository
public interface FunnelSkillRepository extends JpaRepository<FunnelSkill,Long> {

}
