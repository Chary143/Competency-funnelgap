package com.tataelxsi.fga.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tataelxsi.fga.entity.FunnelProjectStage;

@Repository
public interface FunnelProjectStageRepository extends JpaRepository<FunnelProjectStage,Long> {

}
