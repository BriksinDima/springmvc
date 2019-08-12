package com.model.entities.personaldata;


public enum AmountChildren {

    NONE(0), ONE(1), TWO(2), TREEANDMORE(3);

    private Integer value;

    AmountChildren(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
