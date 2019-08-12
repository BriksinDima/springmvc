package com.model.entities.personaldata;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.time.LocalDate;


@Embeddable
public class PersonalData {

    @Column(name="birth_date")
    private LocalDate birthDate;

    @Column(name="employment_type_id")
    private Integer employmentTypeId;

    @Column(name="card_holder")
    private Boolean cardHolder;

    @Column(name="income_statement_id")
    private Boolean incomeStatementId;

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getEmploymentTypeId() {
        return employmentTypeId;
    }

    public void setEmploymentTypeId(Integer employmentTypeId) {
        this.employmentTypeId = employmentTypeId;
    }

    public Boolean getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(Boolean cardHolder) {
        this.cardHolder = cardHolder;
    }

    public Boolean getIncomeStatementId() {
        return incomeStatementId;
    }

    public void setIncomeStatementId(Boolean incomeStatementId) {
        this.incomeStatementId = incomeStatementId;
    }

    @Override
    public String toString() {
        return "PersonalData{" +
                "birthDate=" + birthDate +
                ", employmentTypeId=" + employmentTypeId +
                ", cardHolder=" + cardHolder +
                ", incomeStatementId=" + incomeStatementId +
                '}';
    }
}
