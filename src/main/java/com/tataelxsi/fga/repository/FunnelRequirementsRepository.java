package com.tataelxsi.fga.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tataelxsi.fga.entity.FunnelRequirements;

@Repository
public interface FunnelRequirementsRepository extends JpaRepository<FunnelRequirements,Long> {

}
