package com.kabel.repo;

import com.kabel.model.CodeWork;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
@RestResource(exported = false)
public interface CodeWorkRepo extends CrudRepository<CodeWork, Long> {
}
