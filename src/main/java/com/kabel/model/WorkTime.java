package com.kabel.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "worktime")

public class WorkTime {

    @Id
    @JsonIgnore
    @Column(name = "id", unique = true)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "worktime")
            @SequenceGenerator(name = "worktime", sequenceName = "worktime_seq", allocationSize = 1)
    Long id;

    //@GeneratedValue(strategy = GenerationType.AUTO)

    Long idtime;

    Date startTime;
    Date stopTime;


    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id", referencedColumnName = "idquantity")
    private QuantityWork quantityWork;

    public QuantityWork getQuantityWork() {
        return quantityWork;
    }

    public void setQuantityWork(QuantityWork quantityWork) {
        this.quantityWork = quantityWork;
    }

    public WorkTime() {
    }

    public WorkTime(Long idtime, Date startTime, Date stopTime) {
        //this.idtime = idtime;
        this.startTime = startTime;
        this.stopTime = stopTime;
    }

    @JsonIgnore
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @JsonIgnore
    public Long getIdtime() {
        return idtime;
    }

    public void setIdtime(Long idtime) {
        this.idtime = idtime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getStopTime() {
        return stopTime;
    }

    public void setStopTime(Date stopTime) {
        this.stopTime = stopTime;
    }

}
