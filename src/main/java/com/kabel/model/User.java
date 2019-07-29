package com.kabel.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "User")
public class User {

    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "iduser", unique = true, nullable = false, updatable = false)
    Long iduser;

    @Column(name = "name", nullable = false, length = 40)
    String name;

    @Column(name = "surename", nullable = false, length = 40)
    String surename;

    @Column(name = "position", nullable = false, length = 40)
    String position;

    @Column(name = "passNumber", nullable = false, length = 10, unique = true)
    String passNumber;


    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = WorkTime.class)
    @JoinColumn(name = "idtime", referencedColumnName = "iduser", updatable = true)
    private Set<WorkTime> workTime = new HashSet<>();

    public Set<WorkTime> getWorkTime() {
        return workTime;
    }

    public void setWorkTime(Set<WorkTime> workTime) {
        this.workTime = workTime;
    }

    public User() {
    }

    public Long getIduser() {
        return iduser;
    }

    public void setIduser(Long iduser) {
        this.iduser = iduser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPassNumber() {
        return passNumber;
    }

    public void setPassNumber(String passNumber) {
        this.passNumber = passNumber;
    }




}
