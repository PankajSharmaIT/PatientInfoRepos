package com.Hospital.Patient_Info.Entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="Patient data Management")
@Entity
public class Patient_E {

@Id	
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int patient_id;
    private String patient_name;
    private long  patient_contact;
    private String department;
	private String  date_of_Admit;
	private String  date_of_Discharge;
	private String  attender_Name;
    private int bed_number;
	public Patient_E(int patient_id, String patient_name, long patient_contact, String department, String date_of_Admit,
			String date_of_Discharge, String attender_Name, int bed_number) {
		super();
		this.patient_id = patient_id;
		this.patient_name = patient_name;
		this.patient_contact = patient_contact;
		this.department = department;
		this.date_of_Admit = date_of_Admit;
		this.date_of_Discharge = date_of_Discharge;
		this.attender_Name = attender_Name;
		this.bed_number = bed_number;
	}
	public Patient_E() {
		super();
	}
	public int getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}
	public long getPatient_contact() {
		return patient_contact;
	}
	public void setPatient_contact(long patient_contact) {
		this.patient_contact = patient_contact;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDate_of_Admit() {
		return date_of_Admit;
	}
	public void setDate_of_Admit(String date_of_Admit) {
		this.date_of_Admit = date_of_Admit;
	}
	public String getDate_of_Discharge() {
		return date_of_Discharge;
	}
	public void setDate_of_Discharge(String date_of_Discharge) {
		this.date_of_Discharge = date_of_Discharge;
	}
	public String getAttender_Name() {
		return attender_Name;
	}
	public void setAttender_Name(String attender_Name) {
		this.attender_Name = attender_Name;
	}
	public int getBed_number() {
		return bed_number;
	}
	public void setBed_number(int bed_number) {
		this.bed_number = bed_number;
	}
	@Override
	public String toString() {
		return "Patient_E [patient_id=" + patient_id + ", patient_name=" + patient_name + ", patient_contact="
				+ patient_contact + ", department=" + department + ", date_of_Admit=" + date_of_Admit
				+ ", date_of_Discharge=" + date_of_Discharge + ", attender_Name=" + attender_Name + ", bed_number="
				+ bed_number + "]";
	}

    

}
