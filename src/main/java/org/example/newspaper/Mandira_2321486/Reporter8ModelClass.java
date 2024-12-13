package org.example.newspaper.Mandira_2321486;

import java.time.LocalDate;

public class Reporter8ModelClass {
    private String name;
    private LocalDate date ;
    private String time;
    private String location;
    private String reporter;

    public Reporter8ModelClass(String name, LocalDate date, String time, String location, String reporter) {
        this.name = name;
        this.date = date;
        this.time = time;
        this.location = location;
        this.reporter = reporter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
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

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    @Override
    public String toString() {
        return "Reporter8ModelClass{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", time='" + time + '\'' +
                ", location='" + location + '\'' +
                ", reporter='" + reporter + '\'' +
                '}';
    }
}
