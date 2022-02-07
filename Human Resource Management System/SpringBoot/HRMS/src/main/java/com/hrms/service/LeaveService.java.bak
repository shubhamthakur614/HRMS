package com.hrms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.model.Employee;
import com.hrms.model.Leaves;
import com.hrms.repository.LeaveRepository;

@Service
public class LeaveService {
	@Autowired
	private LeaveRepository repo;

	// add leave of employee
	public Leaves register(Leaves leaves) {
		return repo.save(leaves);
	}

	// fetch leave
	public List<Leaves> fetchLeaves() {
		return repo.findAll();
	}

	// get Leaves by ID
	public Optional<Leaves> getById(int id) {
		return repo.findById(id);
	}

	// update Leave
	public Leaves editLeaves(Leaves leaves) {
		return repo.save(leaves);
	}

	//delete Leave 
	public String deleteleaves(int lid) {
		String result;
		try {
			repo.deleteById(lid);
			result = "Employee Leave Record Deleted";
		} catch (Exception e) {
			result = "Employee with LId is not Deleted";
			e.printStackTrace();

		}
		return result;

	}

}
