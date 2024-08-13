package com.tnsif.ShopOwner1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class OwnerService {

	@Autowired
	private OwnerRepository repo;
	
	//Insert the record into the database
	public void insertRecord (Owner own)
	{
		repo.save(own);
	}
	//get all the records from the table
	public List<Owner> listAllRecords()
	{
		return repo.findAll ();
	
	}
	
	//Retrieving particular record
	public Owner getParticularRecord(Integer id)
	{
		return repo.findById(id).get();
	}
	
	//Deleting particular method
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}
}
