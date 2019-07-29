package com.kabel.model;

import javax.persistence.*;

@Entity
@Table(name = "workorder")
public class WorkOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idworkOrder;

    Long quantityWorkOrder;


    public WorkOrder() {
    }

    public Long getIdworkOrder() {
        return idworkOrder;
    }

    public void setIdworkOrder(Long idworkOrder) {
        this.idworkOrder = idworkOrder;
    }

    public Long getQuantityWorkOrder() {
        return quantityWorkOrder;
    }

    public void setQuantityWorkOrder(Long quantityWorkOrder) {
        this.quantityWorkOrder = quantityWorkOrder;
    }
}
