package com.tataelxsi.fga.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tataelxsi.fga.entity.FunnelCustomer;

@Repository
public interface FunnelCustomerRepository extends JpaRepository<FunnelCustomer,Long> {

	



}
