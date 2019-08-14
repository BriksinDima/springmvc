package com.model.entities;

import com.model.entities.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="application")
public class Application extends BaseEntity {

    private Integer amount;

    private Integer duration;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Application() {
    }

    public Application(Integer amount, Integer duration) {
        this.amount = amount;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Appliaction{" +
                "amount=" + amount +
                ", duration=" + duration +
                '}';
    }
}
