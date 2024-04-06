package com.valid.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valid.model.ValidModel;
import com.valid.repo.ValidRepository;

@Service
public class ValidService {
	
	@Autowired
	private ValidRepository validRepository;
	
	
	public ValidModel insert(ValidModel validModel) {
		ValidModel valid=validRepository.save(validModel);
		return valid;
	}

}
