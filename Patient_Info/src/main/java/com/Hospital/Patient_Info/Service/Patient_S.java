package com.Hospital.Patient_Info.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hospital.Patient_Info.Entity.Patient_E;
import com.Hospital.Patient_Info.Repository.Patient_Repos;
@Service
public class Patient_S {

	
	@Autowired
private	Patient_Repos Repos;

	public List<Patient_E> showList()
	      {
            return  Repos.findAll();       		
		    }
	
      public Optional<Patient_E> show_Patient(int patient_id) {
    	  return Repos.findById(patient_id);
            }
	
      public String addNew(Patient_E patient_E)
      {
          Repos.save(patient_E);       		
	   return "New data saved to the Patient Record Management";
      }
      
      public String listUpdate(List<Patient_E> newP)
      {
          Repos.saveAll(newP);       		
	   return "New list saved to the Patient Record Management ";
      }
      
      public String delete_By_Id(int patient_id) {
    	  Repos.deleteById(patient_id);
       return "Item has been deleted ";
     
      }
      
      
//     public String  update_Patient_Detail( Patient_E obj1,  int patient_id) {
//    	 boolean exist= Repos.existsById(patient_id);   
//    	
//    	 if(exist == true){
//                Repos.save(obj1);
//    	   return  " Information updated succesfully" ;               
//         	 }
//           else 
//      {
//    	 return "Given id does not exist, please try again";  
//    	  
//      }
//     
//           }
            }







