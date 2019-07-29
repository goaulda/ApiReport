package com.kabel.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.ObjectFactory;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "connectiontable")
public class ConnectionTable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;


    @GeneratedValue(strategy = GenerationType.TABLE)
    Long idconnTable;

    @GeneratedValue(strategy = GenerationType.TABLE)
    Long idCodeWork;

    @GeneratedValue(strategy = GenerationType.AUTO)
    Long idQuantityWork;

    @GeneratedValue(strategy = GenerationType.AUTO)
    Long WorkOrder;

    @GeneratedValue(strategy = GenerationType.AUTO)
    Long WorkTime;

    public ConnectionTable() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdconnTable() {
        return idconnTable;
    }

    public void setIdconnTable(Long idconnTable) {
        this.idconnTable = idconnTable;
    }

    public Long getIdCodeWork() {
        return idCodeWork;
    }

    public void setIdCodeWork(Long idCodeWork) {
        this.idCodeWork = idCodeWork;
    }

    public Long getIdQuantityWork() {
        return idQuantityWork;
    }

    public void setIdQuantityWork(Long idQuantityWork) {
        this.idQuantityWork = idQuantityWork;
    }

    public Long getWorkOrder() {
        return WorkOrder;
    }

    public void setWorkOrder(Long workOrder) {
        WorkOrder = workOrder;
    }

    public Long getWorkTime() {
        return WorkTime;
    }

    public void setWorkTime(Long workTime) {
        WorkTime = workTime;
    }
}
