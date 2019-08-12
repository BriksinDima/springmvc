package com.model.entities.goals;

import com.model.entities.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="goal")
public class Goal extends BaseEntity {

    @Column(name="type_id")
    private Integer typeId;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Goal() {
    }

    public Goal(Integer typeId) {
        this.typeId = typeId;
    }

    @Override
    public String toString() {
        return "Goal{" +
                "typeId=" + typeId +
                '}';
    }
}
