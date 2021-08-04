package com.tataelxsi.fga.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tataelxsi.fga.entity.FunnelProjectProbability;

@Repository
public interface FunnelProjectProbabilityRepository extends JpaRepository<FunnelProjectProbability,Long> {

}
