package com.bhavesh.repository;

import java.util.UUID;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.TypedIdCassandraRepository;

import com.bhavesh.domain.Inventory;

public interface InventoryRepository extends TypedIdCassandraRepository<Inventory,UUID> {

}
