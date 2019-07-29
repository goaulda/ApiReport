package com.kabel.model;

import javax.persistence.*;

@Entity
@Table(name = "codework")
public class CodeWork {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String code;
    String description;

    public CodeWork() {
    }

    public CodeWork(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
