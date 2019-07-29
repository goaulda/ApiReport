package com.kabel.repo;

import com.kabel.model.User;
import com.kabel.model.WorkTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.Set;

@Repository
@RestResource(exported = false)
public interface UserRepo
        extends CrudRepository<User, Long>{

    Set<User> findUserByPassNumberContaining(String passNumber);
}
