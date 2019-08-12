package com.model.entities;

public class Main {

    public static void main(String args[]) {
        GoalDao goalDao = new GoalDao();
        ClientCard goal = new ClientCard();

        goalDao.saveStudent(goal);
    }
}
