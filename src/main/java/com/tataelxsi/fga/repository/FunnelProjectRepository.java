package com.tataelxsi.fga.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tataelxsi.fga.entity.FunnelProject;

@Repository
public interface FunnelProjectRepository extends JpaRepository<FunnelProject,Long> {

}
