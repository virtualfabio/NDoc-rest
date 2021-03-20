package com.document.any.NDoc.resources;

import java.util.List;
import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/documents")
public class DocumentResource {

	@GetMapping("/hello")
	public String sayHello() {
		return "hello";
	}
	
	@ApiOperation(value = "List Documents")
	@GetMapping
	@ResponseBody
	public ResponseEntity<?> findAll(){
		List<String> list = new ArrayList<String>();
		
		return new ResponseEntity<List>(list, HttpStatus.OK);
	}
	
	
}
