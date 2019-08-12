package com.model.entities;

import com.model.entities.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="application")
public class Appliaction extends BaseEntity {

    private Integer salary;

    private Integer duration;

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Appliaction(Integer salary, Integer duration) {
        this.salary = salary;
        this.duration = duration;
    }

    public Appliaction() {
    }

    @Override
    public String toString() {
        return "Appliaction{" +
                "salary=" + salary +
                ", duration=" + duration +
                '}';
    }
}
