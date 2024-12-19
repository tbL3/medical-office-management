package com.example.medicalrecord.service;

import com.example.medicalrecord.model.MedicalRecord;
import com.example.medicalrecord.repository.MedicalRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicalRecordService {

    @Autowired
    private MedicalRecordRepository medicalRecordRepository;

    public MedicalRecord createMedicalRecord(MedicalRecord medicalRecord) {
        return medicalRecordRepository.save(medicalRecord);
    }

    public MedicalRecord getMedicalRecord(Long id) {
        Optional<MedicalRecord> medicalRecord = medicalRecordRepository.findById(id);
        return medicalRecord.orElse(null);
    }

    public List<MedicalRecord> getAllMedicalRecords() {
        return medicalRecordRepository.findAll();
    }

    public MedicalRecord updateMedicalRecord(Long id, MedicalRecord medicalRecordDetails) {
        MedicalRecord medicalRecord = getMedicalRecord(id);
        if (medicalRecord != null) {
            medicalRecord.setPatientId(medicalRecordDetails.getPatientId());
            medicalRecord.setPractitionerId(medicalRecordDetails.getPractitionerId());
            medicalRecord.setDetails(medicalRecordDetails.getDetails());
            return medicalRecordRepository.save(medicalRecord);
        }
        return null;
    }

    public void deleteMedicalRecord(Long id) {
        medicalRecordRepository.deleteById(id);
    }
}

