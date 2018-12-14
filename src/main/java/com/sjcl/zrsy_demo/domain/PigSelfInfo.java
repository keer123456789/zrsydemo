package com.sjcl.zrsy_demo.domain;

public class PigSelfInfo {
    private String id ;
    private String temperature;
//    private String weight;
    private String time;

    public PigSelfInfo() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

//    public String getWeight() {
//        return weight;
//    }
//
//    public void setWeight(String weight) {
//        this.weight = weight;
//    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
