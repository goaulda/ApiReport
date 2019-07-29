package com.kabel.repo;

import com.kabel.model.WorkTime;
import jdk.nashorn.internal.runtime.options.Option;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import sun.jvm.hotspot.debugger.Page;

import java.util.*;
@Repository
@RestResource(exported = false)
public interface WorkTimeRepo extends CrudRepository<WorkTime, Long> {



    WorkTime findByIdtimeAndStopTime(Long idtime, Date date);



}
