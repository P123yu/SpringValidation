package com.valid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.valid.Service.ValidService;
import com.valid.model.ValidModel;

import jakarta.validation.Valid;

@RestController
@CrossOrigin
public class ValidController {
	
	@Autowired
	private ValidService validService;
	
	@PostMapping("/post")
	public ResponseEntity<?>insert(@RequestBody @Valid ValidModel validModel){
		ValidModel valid=validService.insert(validModel);
		if(valid!=null) {
			return ResponseEntity.ok(valid);
		}
		else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("error in insertion");
		}
		
	}

}
