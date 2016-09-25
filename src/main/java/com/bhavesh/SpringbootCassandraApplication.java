package com.bhavesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.cassandra.config.CassandraEntityClassScanner;
import org.springframework.data.cassandra.mapping.BasicCassandraMappingContext;
import org.springframework.data.cassandra.mapping.CassandraMappingContext;

@SpringBootApplication
public class SpringbootCassandraApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCassandraApplication.class, args);
	}
	
	@Bean
    public CassandraMappingContext mappingContext() throws Exception {
        BasicCassandraMappingContext bean = new BasicCassandraMappingContext();
        bean.setInitialEntitySet(CassandraEntityClassScanner.scan(("com.bhavesh")));
        return bean;
    }
}
