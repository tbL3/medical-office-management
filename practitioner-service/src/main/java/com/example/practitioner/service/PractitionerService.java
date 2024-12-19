package com.example.practitioner.service;

import com.example.practitioner.model.Practitioner;
import com.example.practitioner.repository.PractitionerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PractitionerService {

    @Autowired
    private PractitionerRepository practitionerRepository;

    public Practitioner createPractitioner(Practitioner practitioner) {
        return practitionerRepository.save(practitioner);
    }

    public Practitioner getPractitioner(Long id) {
        Optional<Practitioner> practitioner = practitionerRepository.findById(id);
        return practitioner.orElse(null);
    }

    public List<Practitioner> getAllPractitioners() {
        return practitionerRepository.findAll();
    }

    public Practitioner updatePractitioner(Long id, Practitioner practitionerDetails) {
        Practitioner practitioner = getPractitioner(id);
        if (practitioner != null) {
            practitioner.setName(practitionerDetails.getName());
            practitioner.setSpecialty(practitionerDetails.getSpecialty());
            return practitionerRepository.save(practitioner);
        }
        return null;
    }

    public void deletePractitioner(Long id) {
        practitionerRepository.deleteById(id);
    }
}

