package com.kabel.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "quantitywork")
public class QuantityWork {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "quantity")
            @SequenceGenerator(name = "quantity", sequenceName = "quantity_seq", allocationSize = 1)
            @JsonIgnore
    Long idquantity;


    Long id;
    Long allQuantity;
    Long badQuantity;
    Long goodQuantity;



    public QuantityWork() {
    }

    public QuantityWork(Long id, Long allQuantity, Long badQuantity, Long goodQuantity) {
        this.id = id;
        this.allQuantity = allQuantity;
        this.badQuantity = badQuantity;
        this.goodQuantity = goodQuantity;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdquantity() {
        return idquantity;
    }

    public void setIdquantity(Long idquantity) {
        this.idquantity = idquantity;
    }

    public Long getAllQuantity() {
        return allQuantity;
    }

    public void setAllQuantity(Long allQuantity) {
        this.allQuantity = allQuantity;
    }

    public Long getBadQuantity() {
        return badQuantity;
    }

    public void setBadQuantity(Long badQuantity) {
        this.badQuantity = badQuantity;
    }

    public Long getGoodQuantity() {
        return goodQuantity;
    }

    public void setGoodQuantity(Long goodQuantity) {
        this.goodQuantity = goodQuantity;
    }




}
