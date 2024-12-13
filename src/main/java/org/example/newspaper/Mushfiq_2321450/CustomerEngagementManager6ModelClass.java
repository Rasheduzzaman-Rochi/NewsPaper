package org.example.newspaper.Mushfiq_2321450;

import java.io.Serializable;

public class CustomerEngagementManager6ModelClass implements Serializable {
    private Integer id;
    private String group;
    private String trainingContent;
    private String description;

    public CustomerEngagementManager6ModelClass(Integer id, String group, String trainingContent, String description) {
        this.id = id;
        this.group = group;
        this.trainingContent = trainingContent;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getTrainingContent() {
        return trainingContent;
    }

    public void setTrainingContent(String trainingContent) {
        this.trainingContent = trainingContent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "CustomerEngagementManager6ModelClass{" +
                "id=" + id +
                ", group='" + group + '\'' +
                ", trainingContent='" + trainingContent + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
