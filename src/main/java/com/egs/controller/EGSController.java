package com.egs.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.egs.bean.Employee;
import com.egs.dao.EmployeeDAO;


@RestController
@CrossOrigin("http://localhost:4200/")
public class EGSController {

	@Autowired
	EmployeeDAO dao;
	
	@PostMapping("/PerformInsert")
	public void performInsert(@RequestBody Employee emp)
	{
		dao.save(emp);
	}
	
	@PutMapping("/PerformUpdate")
	public void performUpdate(@RequestBody Employee emp)
	{
		dao.save(emp);
	}
	@DeleteMapping("/PerformDelete/{id}")
	public void performDelete(@PathVariable("id") int id) {
		dao.deleteById(id);
	}
	
	@GetMapping("/ViewAll")
    public List<Employee> viewAllEmployee(){
        Iterator<Employee> it=dao.findAll().iterator();
         List<Employee> list=new ArrayList<Employee>();
            while (it.hasNext()) {
                list.add(it.next());
            }
            return list;
    }
	
	

	

}
