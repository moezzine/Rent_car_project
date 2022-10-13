package com.fleetapp.fleetapp.Services;

import com.fleetapp.fleetapp.Repositories.JobTitleRepository;
import com.fleetapp.fleetapp.Repositories.VehiculeModelRepository;
import com.fleetapp.fleetapp.models.JobTitle;
import com.fleetapp.fleetapp.models.VehicleModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobTitleService {
    @Autowired
    JobTitleRepository jobTitleRepository;

    public List<JobTitle> getjobTitle() {
        return  jobTitleRepository.findAll();
    }

    public void savejobTitle(JobTitle jobTitle) {
        jobTitleRepository.save(jobTitle);
    }

    public Optional<JobTitle> getById(int id) {
        return  jobTitleRepository.findById(id);
    }

    public void delete(Integer id) {
        jobTitleRepository.deleteById(id);
    }

}
