package com.service;

import java.util.List;

import com.dao.CompanyDao;
import com.entity.Company;
 

public class CompanyService {
	public List<Company> findAll() {
		return new CompanyDao().findAll();
	}

	public Company findById(String id) {
		return new CompanyDao().findById(id);
	}
	
}
