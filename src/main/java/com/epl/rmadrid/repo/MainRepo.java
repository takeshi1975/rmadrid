package com.epl.rmadrid.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epl.rmadrid.dto.RMadridRs;

@Repository
public interface MainRepo extends CrudRepository<RMadridRs, String> {
		 
	RMadridRs findOne(String locata);
}
