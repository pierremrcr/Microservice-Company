package org.sid.DAO;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.sid.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

@RepositoryRestResource
public interface CompanyRepository extends JpaRepository<Company,Long> {
	
}
 