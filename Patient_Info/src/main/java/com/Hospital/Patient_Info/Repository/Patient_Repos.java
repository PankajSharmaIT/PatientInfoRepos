package com.Hospital.Patient_Info.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hospital.Patient_Info.Entity.Patient_E;
@Repository
public interface Patient_Repos extends JpaRepository<Patient_E,Integer> {

}
