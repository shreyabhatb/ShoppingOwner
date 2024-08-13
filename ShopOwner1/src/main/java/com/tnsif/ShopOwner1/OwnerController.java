package com.tnsif.ShopOwner1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.NoResultException;

@RestController
public class OwnerController {

	@Autowired
	private OwnerService service;
	
	@GetMapping("/ownerservice")
	public List<Owner> list()
	{
		return service.listAllRecords();
	}
	
	@PostMapping("/ownerservice")
	public void add(@RequestBody Owner own)
	{
		service.insertRecord(own);
	}
	
	@GetMapping("/ownerservice/{id}")
	public ResponseEntity<Owner> get (@PathVariable Integer id)
	{
		try
		{
			Owner own=service.getParticularRecord(id);
			return new ResponseEntity<Owner>(own,HttpStatus.OK);
		}
		catch(NoResultException e)
		{
			return new ResponseEntity<Owner>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/ownerservice/{id}")
	public void delete(@PathVariable Integer id)
	{
		service.delete(id);
	}
}
