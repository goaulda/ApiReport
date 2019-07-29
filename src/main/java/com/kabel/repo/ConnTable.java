package com.kabel.repo;

import com.kabel.model.ConnectionTable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

@Repository
@RestResource(exported = false)
public interface ConnTable extends CrudRepository<ConnectionTable, Long> {
}
