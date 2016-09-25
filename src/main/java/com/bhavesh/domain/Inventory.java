package com.bhavesh.domain;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table("inventories")
public class Inventory {
	
	@PrimaryKey
	private UUID id;
	
	private String product_name;
	private String stock_available;
	private String lot_no;
	private String date_first_available;
	private String createdat;
	
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getStock_available() {
		return stock_available;
	}

	public void setStock_available(String stock_available) {
		this.stock_available = stock_available;
	}

	public String getLot_no() {
		return lot_no;
	}

	public void setLot_no(String lot_no) {
		this.lot_no = lot_no;
	}

	public String getDate_first_available() {
		return date_first_available;
	}

	public void setDate_first_available(String date_first_available) {
		this.date_first_available = date_first_available;
	}

	public String getCreatedat() {
		return createdat;
	}

	public void setCreatedat(String createdat) {
		this.createdat = createdat;
	}

	@Override
	public String toString() {
		return "Inventory [id=" + id + ", product_name=" + product_name + ", stock_available=" + stock_available
				+ ", lot_no=" + lot_no + ", date_first_available=" + date_first_available + ", createdat=" + createdat
				+ "]";
	}
}
