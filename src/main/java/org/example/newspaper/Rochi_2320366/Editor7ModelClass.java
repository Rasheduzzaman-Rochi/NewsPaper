package org.example.newspaper.Rochi_2320366;

import java.io.Serializable;
import java.time.LocalDate;

public class Editor7ModelClass implements Serializable {
    private String id;
    private String title;
    private LocalDate submiDate;
    private LocalDate newDate;
    private String status;

    @Override
    public String toString() {
        return "Editor7ModelClass{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", submiDate=" + submiDate +
                ", newDate=" + newDate +
                ", status='" + status + '\'' +
                '}';
    }

    public Editor7ModelClass(String id, String title, LocalDate submiDate, LocalDate newDate, String status) {
        this.id = id;
        this.title = title;
        this.submiDate = submiDate;
        this.newDate = newDate;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getSubmiDate() {
        return submiDate;
    }

    public void setSubmiDate(LocalDate submiDate) {
        this.submiDate = submiDate;
    }

    public LocalDate getNewDate() {
        return newDate;
    }

    public void setNewDate(LocalDate newDate) {
        this.newDate = newDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
