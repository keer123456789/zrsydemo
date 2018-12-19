package com.sjcl.zrsy_demo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.Past;
public class EnvInfo {
   private String temperature;
   private String humidity;

   private String CO2;
   private String datetime;
   private String pigstyid;


    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }
    @JsonProperty("CO2")
    public String getCO2() {
        return CO2;
    }

    public void setCO2(String CO2) {
        this.CO2 = CO2;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getPigstyid() {
        return pigstyid;
    }

    public void setPigstyid(String pigstyid) {
        this.pigstyid = pigstyid;
    }
}
