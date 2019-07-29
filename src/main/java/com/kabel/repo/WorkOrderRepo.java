package com.kabel.repo;

import com.kabel.model.WorkOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

@Repository
@RestResource(exported = false)
public interface WorkOrderRepo extends CrudRepository<WorkOrder, Long> {
}
