package com.kabel.service;

import com.kabel.model.User;
import com.kabel.repo.UserRepo;
import com.kabel.repo.WorkTimeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping(value = "/user")
public class UserControler{

    @Autowired
    private final UserRepo userRepo;
    
    @Autowired
    private final WorkTimeRepo workTimeRepo;

    public UserControler(UserRepo userRepo, WorkTimeRepo workTimeRepo) {
        this.userRepo = userRepo;
        this.workTimeRepo = workTimeRepo;
    }


    @RequestMapping(value = "",method = RequestMethod.GET)
    private Iterable<User> getUser(Model model){
        return userRepo.findAll();

    }

    @RequestMapping(value = "/pass={passNumber}", method = RequestMethod.GET)
    Set<User> findbypassNumber(@PathVariable String passNumber){
        return userRepo.findUserByPassNumberContaining(passNumber);

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Optional<User> oneUser(@PathVariable Long id){
        return userRepo.findById(id);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    private User newUser(@RequestBody User newUser){
        return userRepo.save(newUser);
    }

}
