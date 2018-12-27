package com.sjcl.zrsy_demo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PigSensor {
    private String id;
    @JsonProperty("ERC721ID")
    private String ERC721ID;
    private String type;
    private String time;

    public PigSensor() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    @JsonProperty("ERC721ID")
    public String getERC721ID() {
        return ERC721ID;
    }

    public void setERC721ID(String ERC721ID) {
        this.ERC721ID = ERC721ID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
