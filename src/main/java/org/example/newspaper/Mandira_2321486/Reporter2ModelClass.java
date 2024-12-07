package org.example.newspaper.Mandira_2321486;

public class Reporter2ModelClass {
    private String id;
    private String title;
    private String subtitle;
    private String category;

    public Reporter2ModelClass(String id, String title, String subtitle, String category) {
        this.id = id;
        this.title = title;
        this.subtitle = subtitle;
        this.category = category;
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

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Reporter2ModelClass{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
