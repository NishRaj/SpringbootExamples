package com.nishank.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Parts {

    @Id
    private Long id;

    private String partNum;

    private Double price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPartNum() {
        return partNum;
    }

    public void setPartNum(String partNum) {
        this.partNum = partNum;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }




}
