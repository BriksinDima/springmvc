package com.model.entities.personaldata;


import com.model.entities.base.BaseEntity;

import javax.persistence.Entity;

@Entity(name="sub_borrower")
public class SubBorrower extends BaseEntity {

    private PersonalData personalData;

    public PersonalData getPersonalData() {
        return personalData;
    }

    public void setPersonalData(PersonalData personalData) {
        this.personalData = personalData;
    }
}
