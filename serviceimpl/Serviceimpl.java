package com.Student_management_system.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Student_management_system.entity.Student;
import com.Student_management_system.service.Studentservice;

@Service
public class Serviceimpl implements Studentservice  {
	
	@Autowired
	 com.Student_management_system.repository.Studentrepository Studentrepository;

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		 
		List<Student> list=	Studentrepository.findAll();
		
		return list;
	}
	


	
}
