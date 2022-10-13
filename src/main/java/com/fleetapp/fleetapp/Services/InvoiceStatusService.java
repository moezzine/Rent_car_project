package com.fleetapp.fleetapp.Services;
import com.fleetapp.fleetapp.Repositories.InvoiceStatusRepository;
import com.fleetapp.fleetapp.models.InvoiceStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class InvoiceStatusService {
    @Autowired
    InvoiceStatusRepository invoiceStatusRepository;
    public List<InvoiceStatus> getinvoiceStatus() {
        return  invoiceStatusRepository.findAll();
    }
    public void saveinvoiceStatus(InvoiceStatus invoiceStatus) {invoiceStatusRepository.save(invoiceStatus);
    }
    public Optional<InvoiceStatus> getById(int id) {
        return  invoiceStatusRepository.findById(id);
    }
    public void delete(Integer id) {
        invoiceStatusRepository.deleteById(id);
    }
}
