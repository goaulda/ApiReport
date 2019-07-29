package com.kabel.service;

import com.kabel.model.QuantityWork;
import com.kabel.model.WorkTime;
import com.kabel.repo.QuantityWorkRepo;
import com.kabel.repo.WorkTimeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping(value = "time")
public class CodeTimeService {


    @Autowired
    private final WorkTimeRepo workTimeRepo;

    @Autowired
    private final QuantityWorkRepo quantityWorkRepo;

    public CodeTimeService(WorkTimeRepo workTimeRepo, QuantityWorkRepo quantityWorkRepo) {
        this.workTimeRepo = workTimeRepo;
        this.quantityWorkRepo = quantityWorkRepo;
    }


    @Autowired
    EntityManager entityManager;

    @RequestMapping(value = "", method = RequestMethod.GET)
    private Iterable<WorkTime> getWorkTime(Model model){

        return workTimeRepo.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    private Optional<WorkTime> workTimeOptional(@PathVariable Long id){
        return workTimeRepo.findById(id);
    }

    @RequestMapping(value = "/start" , method = RequestMethod.POST)
    private WorkTime startworktime(@RequestBody WorkTime workTime, Date date) throws Exception{
        Date date1 = new Date();
        //SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date d1 = date1;

        WorkTime workTime1 = new WorkTime();
        workTime1.setStartTime(d1);
        workTime1.setStopTime(null);
        workTime1.setIdtime(workTime.getIdtime());
        workTime1.setQuantityWork(workTime.getQuantityWork());
        return workTimeRepo.save(workTime1);
    }



    @RequestMapping(value = "/stop", method = RequestMethod.POST)
    private WorkTime demoTime(@RequestBody WorkTime workTime){
        Date date = new Date();
        QuantityWork quantityWork = new QuantityWork();

        WorkTime workTime1 = workTimeRepo.findByIdtimeAndStopTime(workTime.getIdtime(), null );
        workTime1.setStopTime(date);
        workTime1.setQuantityWork(workTime.getQuantityWork());

        return workTimeRepo.save(workTime1);


    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    private void delate(@PathVariable Long id){
        workTimeRepo.deleteById(id);
    }
}
