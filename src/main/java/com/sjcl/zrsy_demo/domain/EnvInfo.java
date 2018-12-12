package com.sjcl.zrsy_demo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EnvInfo {
   private String temperature;
   private String hum;
   @JsonProperty(value="CO2")
   private String CO2;
   private String time;
   private String location;


    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getHum() {
        return hum;
    }

    public void setHum(String hum) {
        this.hum = hum;
    }

    public String getCo2() {
        return CO2;
    }

    public void setCo2(String co2) {
        CO2 = co2;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}
