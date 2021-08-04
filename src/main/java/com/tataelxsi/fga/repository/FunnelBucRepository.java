package com.tataelxsi.fga.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tataelxsi.fga.entity.FunnelBuc;

@Repository
public interface FunnelBucRepository extends JpaRepository<FunnelBuc,Long> {

	

}
