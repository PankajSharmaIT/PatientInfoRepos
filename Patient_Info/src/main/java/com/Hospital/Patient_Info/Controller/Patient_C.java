package com.Hospital.Patient_Info.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Hospital.Patient_Info.Entity.Patient_E;
import com.Hospital.Patient_Info.Service.Patient_S;

@RestController
@RequestMapping("/Home")
public class Patient_C  {

	@Autowired
	private Patient_S patient_S;

	@GetMapping("/PatientList")
	public List<Patient_E> getPatientList() {
		System.out.println(patient_S.showList());
		return patient_S.showList();
	}

	@GetMapping("/Patient_Details/{patient_id}")
	public Optional<Patient_E> show_patient_datails(@PathVariable int patient_id) {
System.out.println(patient_S.show_Patient(patient_id));
		return patient_S.show_Patient(patient_id);
	}

	@GetMapping("/Patient_Details")
	public Optional<Patient_E> show_patient_datail(@RequestParam("patient_id") int patient_id) {

		return patient_S.show_Patient(patient_id);
	}

	@PostMapping("/AddNew")
	public String save_Patient(@RequestBody Patient_E patient_E) {
		patient_S.addNew(patient_E);
		return "New Patient added succesfully";
	}

	@PostMapping("/Add")
	public String save_PatientList(@RequestBody List<Patient_E> patient_E) {
		patient_S.listUpdate(patient_E);
		return "New Patient List added succesfully";
	}

	@DeleteMapping("/delete_patient/{patient_id}")
	public String delete_patient(@PathVariable int patient_id) {
		patient_S.delete_By_Id(patient_id);
		return "succesfully deleted";
	}
}
