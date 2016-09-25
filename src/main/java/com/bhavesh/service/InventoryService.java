package com.bhavesh.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhavesh.domain.Inventory;
import com.bhavesh.repository.InventoryRepository;

@Service
public class InventoryService {
	
	@Autowired
	private InventoryRepository inventoryRepository;
	
	public List<Inventory> getAll(){
		return (List<Inventory>) this.inventoryRepository.findAll();
	}
	
	public Inventory find(UUID id){
		return this.inventoryRepository.findOne(id);	
	}
	
	public Inventory save(Inventory inv){
		return this.inventoryRepository.save(inv);	
	}
	
	public Inventory update(Inventory inv){
		return this.inventoryRepository.save(inv);	
	}
	
	public void delete(UUID id){
		this.inventoryRepository.delete(id);	
	}

}
