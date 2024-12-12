package org.example.newspaper.Mushfiq_2321450;

import java.io.Serializable;
import java.time.LocalDate;

public class CustomerEngagementManager5ModelClass implements Serializable{
    private String heading;
    private String description;
    private LocalDate date;
    private String audience;

    public CustomerEngagementManager5ModelClass(String heading, String description, LocalDate date, String audience) {
        this.heading = heading;
        this.description = description;
        this.date = date;
        this.audience = audience;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
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
        return "CustomerEngagementManager5ModelClass{" +
                "heading='" + heading + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", audience='" + audience + '\'' +
                '}';
    }
}