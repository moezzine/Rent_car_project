package com.fleetapp.fleetapp.Services;

import com.fleetapp.fleetapp.Repositories.InvoiceRepository;
import com.fleetapp.fleetapp.models.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceService {
    @Autowired
    InvoiceRepository invoiceRepository;
    public List<Invoice> getinvoices() {
        return  invoiceRepository.findAll();
    }
    public void delete(int id) {
        invoiceRepository.deleteById(id);
    }
    public void saveinvoice(Invoice invoice) {
        invoiceRepository.save(invoice);
    }
    public void update(Invoice invoice) {
        invoiceRepository.save(invoice);
    }
    public Optional<Invoice> findById(int id) {
        return invoiceRepository.findById(id);
    }
}
