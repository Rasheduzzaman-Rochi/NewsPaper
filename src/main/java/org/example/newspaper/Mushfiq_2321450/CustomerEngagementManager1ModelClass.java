package org.example.newspaper.Mushfiq_2321450;

import java.io.Serializable;
import java.time.LocalDate;

public class CustomerEngagementManager1ModelClass implements Serializable {
   private String name;
   private String description;
   private LocalDate date;
   private String audience;

    public CustomerEngagementManager1ModelClass(String name, String description, LocalDate date, String audience) {
        this.name = name;
        this.description = description;
        this.date = date;
        this.audience = audience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getAudience() {
        return audience;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }

    @Override
    public String toString() {
        return "CustomerEngagementManager1ModelClass{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", audience='" + audience + '\'' +
                '}';
    }
}
