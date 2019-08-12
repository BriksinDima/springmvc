package com.model.entities.personaldata;

import com.model.entities.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity(name="borrower")
public class Borrower extends BaseEntity {

    @Column(name="gender")
    private Gender gender;

    @Column(name="married")
    private Boolean married;

    @Column(name="children_amount")
    private AmountChildren children;

    @Embedded
    private PersonalData personalData;

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Boolean getMarried() {
        return married;
    }

    public void setMarried(Boolean married) {
        this.married = married;
    }

    public AmountChildren getChildren() {
        return children;
    }

    public void setChildren(AmountChildren children) {
        this.children = children;
    }

    public PersonalData getPersonalData() {
        return personalData;
    }

    public void setPersonalData(PersonalData personalData) {
        this.personalData = personalData;
    }

    @Override
    public String toString() {
        return "Borrower{" +
                "gender=" + gender +
                ", married=" + married +
                ", children=" + children +
                ", personalData=" + personalData +
                '}';
    }
}
