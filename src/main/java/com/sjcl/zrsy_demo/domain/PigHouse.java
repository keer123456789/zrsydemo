package com.sjcl.zrsy_demo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PigHouse {
    @JsonProperty("pigstyId")
    private String pigstyId;
    private String column;
    private String ringNumber;
    private String person;


    public String getPigstyId() {
        return pigstyId;
    }

    public void setPigstyId(String pigstyId) {
        this.pigstyId = pigstyId;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getRingNumber() {
        return ringNumber;
    }

    public void setRingNumber(String ringNumber) {
        this.ringNumber = ringNumber;
    }


    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }


}
