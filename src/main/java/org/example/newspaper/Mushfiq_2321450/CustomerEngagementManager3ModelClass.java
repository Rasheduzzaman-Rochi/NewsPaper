package org.example.newspaper.Mushfiq_2321450;

import java.io.Serializable;

public class CustomerEngagementManager3ModelClass implements Serializable{
    private String title;
    private String description;

    public CustomerEngagementManager3ModelClass(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "CustomerEngagementManager3ModelClass{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
