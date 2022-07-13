package com.dsmeta.store.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsmeta.store.Repositories.SaleRepository;
import com.dsmeta.store.entitites.Sale;

@Service
public class SaleService {

  @Autowired
  private SaleRepository repository;

  public List<Sale> findSales() {
    return repository.findAll();
  }
}
