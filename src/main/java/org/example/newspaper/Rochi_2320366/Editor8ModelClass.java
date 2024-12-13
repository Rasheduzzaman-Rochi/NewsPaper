package org.example.newspaper.Rochi_2320366;

import java.io.Serializable;
import java.time.LocalDate;

public class Editor8ModelClass implements Serializable {
    private String id;
    private String title;
    private String status;
    private LocalDate updateDate;

    public Editor8ModelClass(String id, String title, String status, LocalDate updateDate) {
        this.id = id;
        this.title = title;
        this.status = status;
        this.updateDate = updateDate;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "Editor8ModelClass{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", status='" + status + '\'' +
                ", updateDate=" + updateDate +
                '}';
    }
}
