package com.model.entities.personaldata;




public enum Gender {

    MALE("m"), FEMALE("f");

    private String value;

    Gender(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "value='" + value + '\'' +
                '}';
    }
}
