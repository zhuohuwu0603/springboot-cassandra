package com.bhavesh.web.rest;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import java.util.UUID;
import java.util.logging.Logger;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bhavesh.service.InventoryService;
import com.bhavesh.domain.*;

@RestController
@RequestMapping("/api")
public class InventoryResource {
	
	private static final Logger LOGGER = Logger.getLogger(InventoryResource.class.getName());
	
	@Autowired
	InventoryService inventoryService;
	
	@RequestMapping(value = "/inventory", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Inventory> getAll(){
		return this.inventoryService.getAll();
	}
	
	@RequestMapping(value="inventory", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public Inventory save(@RequestBody Inventory inv){	
		inv.setId(UUID.randomUUID());
		inv.setCreatedat(getTimeStampMillis());
		LOGGER.info("Before saving : "+inv.toString());
		return this.inventoryService.save(inv);
	}
	
	public static String getTimeStampMillis() {
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		df.setTimeZone(TimeZone.getTimeZone("IST"));
		return df.format(date);
	}
}
