package com.tataelxsi.fga.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tataelxsi.fga.entity.FunnelProjectCategory;

@Repository
public interface FunnelProjectCategoryRepository extends JpaRepository<FunnelProjectCategory,Long> {

}
