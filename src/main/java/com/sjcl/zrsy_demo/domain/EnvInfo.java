package com.sjcl.zrsy_demo.domain;

public class EnvInfo {
   String temperature;
   String hum;
   String Co2;
   String time;
   String location;

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
        return Co2;
    }

    public void setCo2(String co2) {
        Co2 = co2;
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
