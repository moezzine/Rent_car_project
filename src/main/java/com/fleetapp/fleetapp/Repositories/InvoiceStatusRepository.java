package com.fleetapp.fleetapp.Repositories;

import com.fleetapp.fleetapp.models.Invoice;
import com.fleetapp.fleetapp.models.InvoiceStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceStatusRepository extends JpaRepository<InvoiceStatus,Integer> {

}
