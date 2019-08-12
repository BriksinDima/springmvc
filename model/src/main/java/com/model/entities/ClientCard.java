package com.model.entities;

import com.model.entities.base.BaseEntity;
import com.model.entities.goals.Goal;
import com.model.entities.personaldata.Borrower;
import com.model.entities.personaldata.SubBorrower;

import javax.persistence.*;
import java.util.List;

@Entity
public class ClientCard extends BaseEntity {

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="borrower_id")
    private Borrower borrower;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="sub_borrower_id")
    private SubBorrower subBorrower;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="goal_id")
    private Goal goal;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name="clientcard_appliaction",
            joinColumns = @JoinColumn(name="card_id"),
            inverseJoinColumns = @JoinColumn(name="application_id")
    )
    private List<Appliaction> applicationList;

    public Borrower getBorrower() {
        return borrower;
    }

    public void setBorrower(Borrower borrower) {
        this.borrower = borrower;
    }

    public SubBorrower getSubBorrower() {
        return subBorrower;
    }

    public void setSubBorrower(SubBorrower subBorrower) {
        this.subBorrower = subBorrower;
    }

    public Goal getGoal() {
        return goal;
    }

    public void setGoal(Goal goal) {
        this.goal = goal;
    }

    public List<Appliaction> getApplicationList() {
        return applicationList;
    }

    public void setApplicationList(List<Appliaction> applicationList) {
        this.applicationList = applicationList;
    }
}
