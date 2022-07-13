package com.dsmeta.store.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dsmeta.store.entitites.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {

}
